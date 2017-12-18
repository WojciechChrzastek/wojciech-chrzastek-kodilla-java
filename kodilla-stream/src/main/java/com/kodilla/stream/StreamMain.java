package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println("");
        System.out.println("Zadanie: Upiększacz tekstów, submoduł 7.1");

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("aaa", (poem) -> poem + " ABC");
        poemBeautifier.beautify("xyz", (poem) -> "ABC " + poem);
        poemBeautifier.beautify("aaa", (poem) -> poem.toUpperCase());
        poemBeautifier.beautify("aaa", String::toUpperCase);
        System.out.println("Własne upiększacze:");
        poemBeautifier.beautify("aaa", (poem) -> poem.toUpperCase() + poem.toLowerCase() + poem.toUpperCase());
        poemBeautifier.beautify("aaa", (poem) -> ">>> " + poem + " <<<");
    }
}
