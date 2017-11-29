package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MovieStore {

    private static final String IRON_MAN_EN = "Iron Man";
    private static final String IRON_MAN_PL = "Żelazny Człowiek";
    private static final String AVENGERS_EN = "Avengers";
    private static final String AVENGERS_PL = "Mściciele";
    private static final String FLASH_EN = "Flash";
    private static final String FLASH_PL = "Błyskawica";

    public Map<String, List<String>> getMovies() {

        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add(IRON_MAN_EN);
        ironManTranslations.add(IRON_MAN_PL);

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add(AVENGERS_EN);
        avengersTranslations.add(AVENGERS_PL);

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add(FLASH_EN);
        flashTranslations.add(FLASH_PL);

        Map<String, List<String>> moviesTitlesWithTranslations = new HashMap<>();
        moviesTitlesWithTranslations.put(IRON_MAN_EN, ironManTranslations);
        moviesTitlesWithTranslations.put(AVENGERS_EN, avengersTranslations);
        moviesTitlesWithTranslations.put(FLASH_EN, flashTranslations);

        return new HashMap<>(moviesTitlesWithTranslations);
    }
}