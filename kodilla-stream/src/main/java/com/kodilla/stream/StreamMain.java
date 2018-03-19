package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.time.LocalDate;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        System.out.println(">>>>> Result of tasks from: package com.kodilla.stream.forum:\n");

        Forum forum = new Forum();

        Map<Integer, ForumUser> mapOfForumUsers = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'm')
                .filter(forumUser -> forumUser.getDateOfBirth().isBefore(LocalDate.now().minusYears(20)))
                .filter(forumUser -> forumUser.getPostsCount() >= 1)
                .collect(Collectors.toMap(ForumUser::getId, Function.identity()));

        System.out.println("# of elements in the map: " + mapOfForumUsers.size());
        mapOfForumUsers.entrySet().stream()
                .map(entry -> "Flitered user ID:" + entry.getKey() + " " + entry.getValue())
                .forEach(System.out::println);


        System.out.println("\n\n>>>>> Result of tasks from: package com.kodilla.stream.book:\n");

        BookDirectory theBookDirectory = new BookDirectory();

        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n", "<<", ">>"));

        System.out.println(theResultStringOfBooks + "\n");


        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);


        System.out.println("\n\n>>>>> Result of tasks from: package com.kodilla.stream.person:\n");

        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);


        System.out.println("\n\n>>>>> Result of tasks from: package com.kodilla.stream.lambda:\n");

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);


        System.out.println("\n\n>>>>> Result of tasks from: package com.kodilla.stream.reference:\n");

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);


        System.out.println("\n\n>>>>> Result of tasks from: package com.kodilla.stream.beautifier:\n");

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("aaa", (poem) -> poem + " ABC");
        poemBeautifier.beautify("xyz", (poem) -> "ABC " + poem);
        poemBeautifier.beautify("aaa", (poem) -> poem.toUpperCase());
        poemBeautifier.beautify("aaa", String::toUpperCase);

        System.out.println("My beautifiers:");
        poemBeautifier.beautify("aaa", (poem) -> poem.toUpperCase() + poem.toLowerCase() + poem.toUpperCase());
        poemBeautifier.beautify("aaa", (poem) -> ">>> " + poem + " <<<");


        System.out.println("\n\n>>>>> Result of tasks from: package com.kodilla.stream.iterate:\n");

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
