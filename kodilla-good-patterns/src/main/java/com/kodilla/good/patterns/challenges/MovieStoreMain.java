package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieStoreMain {
    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        Map<String, List<String>> moviesTranslations = movieStore.getMovies();

        String moviesTitles = moviesTranslations.entrySet().stream()
                .map(entry -> entry.getKey())
                .collect(Collectors.joining("!"));

        System.out.println("Movies: " + moviesTitles);

        String allTranslations = moviesTranslations.entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.joining("!"));

        System.out.println("All translations: " + allTranslations);


    }
}
