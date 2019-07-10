package org.design.patterns.creational.builder;

public class Character {

    private final String name;
    private final String gender;
    private final String hairColor;
    private final String height;
    private final String skinColor;

    //Notice private constructor, so that to avoid creating Character explicitly in order to encapsulate object creation
    private Character(CharacterBuilder builder) {
        this.name = builder.name;
        this.gender = builder.gender;
        this.hairColor = builder.hairColor;
        this.height = builder.height;
        this.skinColor = builder.skinColor;
    }

    public static class CharacterBuilder {

        private final String name;
        private final String gender;
        private String hairColor;
        private String height;
        private String skinColor;

        public CharacterBuilder(String name, String gender) {
            this.name = name;
            this.gender = gender;
        }

        public CharacterBuilder buildWithHairColor(String hairColor) {
            this.hairColor = hairColor;
            return this;
        }

        public CharacterBuilder buildWithHeight(String height) {
            this.height = height;
            return this;
        }

        public CharacterBuilder buildWithSkinColor(String skinColor) {
            this.skinColor = skinColor;
            return this;
        }

        public Character build() {
            return new Character(this);
        }
    }

    //Added just for the sake of printing object details
    @Override
    public String toString() {
        return "Awesome character is ready these are the specifications [ name:" + this.name + ", gender: " +
                this.gender + ", skinColor: " + this.skinColor + ", hairColor: " + this.hairColor + ", height:" + this.height + "]";
    }
}
