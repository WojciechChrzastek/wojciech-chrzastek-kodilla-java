package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final String rollType;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    public static class BigmacBuilder {
        private static final String ROLL_WITH_SESAME = "with sesame";
        private static final String ROLL_WITHOUT_SESAME = "without sesame";
        private static final String STANDARD_SAUCE = "standard";
        private static final String THOUSAND_ISLANDS_SAUCE = "1000 islands";
        private static final String BARBECUE_SAUCE = "barbecue";
        private static final String LETTUCE = "lettuce";
        private static final String ONION = "onion";
        private static final String BACON = "bacon";
        private static final String CUCUMBER = "cucumber";
        private static final String CHILI_PEPPERS = "chilli peppers";
        private static final String MUSHROOMS = "mushrooms";
        private static final String SHRIMPS = "shrimps";
        private static final String CHEESE = "cheese";

        private String rollType;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder rollType(String rollType) {
            if (rollType.equals(ROLL_WITH_SESAME) || rollType.equals(ROLL_WITHOUT_SESAME)) {
                this.rollType = rollType;
            } else {
                throw new IllegalStateException("Please choose roll type: with sesame or without sesame.");
            }
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            if (sauce.equals(STANDARD_SAUCE) || sauce.equals(THOUSAND_ISLANDS_SAUCE) || sauce.equals(BARBECUE_SAUCE)) {
                this.sauce = sauce;
            } else {
                throw new IllegalStateException("Please choose sauce: standard, 1000 islands, barbecue.");
            }
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            if (ingredient.equals(LETTUCE) || ingredient.equals(ONION) || ingredient.equals(BACON) ||
                    ingredient.equals(CUCUMBER) || ingredient.equals(CHILI_PEPPERS) || ingredient.equals(MUSHROOMS) ||
                    ingredient.equals(SHRIMPS) || ingredient.equals(CHEESE)) {
                ingredients.add(ingredient);
            } else {
                throw new IllegalStateException("Please choose only from following ingredients: lettuce, onion, bacon, cucumber, chili peppers, mushrooms, shrimps, cheese.");
            }
            return this;
        }

        public Bigmac build() {
            return new Bigmac(rollType, burgers, sauce, ingredients);
        }
    }

    private Bigmac(String rollType, int burgers, String sauce, List<String> ingredients) {
        this.rollType = rollType;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public String getRollType() {
        return rollType;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "rollType='" + rollType + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}