package com.kodilla.good.patterns.challenges;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        movieStore.getMovies().entrySet().stream()
                .map(Map.Entry::getValue)
                .map(n -> n + "!" )
                .forEach(System.out::print);
    }
}
