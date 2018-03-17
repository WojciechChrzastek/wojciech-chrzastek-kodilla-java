package com.kodilla.good.patterns.challenges.moviestore;

import java.util.stream.Collectors;

public class MovieStoreMain {
    public static void main(String[] args) {

        String titlesInOneRow = MovieStore.getMovies().entrySet().stream()
                .flatMap(e -> e.getValue().stream())
                .collect(Collectors.joining("!"));
        System.out.println(titlesInOneRow);
    }
}
