package org.design.patterns.creational.builder;

/**
 * GOF Definition
 * Separate the construction of a complex object from its representation so that the same construction processes can
 * create different representations.
 */

/**
 * Wiki definition
 *     The builder pattern is an object creation software design pattern with the intentions of finding a solution to
 *     the telescoping constructor anti-pattern.
 *
 *     Having said that let me add a bit about what telescoping constructor anti-pattern is. At one point or the
 *     other we have all seen a constructor like below:
 *
 * public Hero(Profession profession, String name, HairType hairType, HairColor hairColor, Armor armor, Weapon weapon) {
 * }
 */

/**
 * Real World Analogy
 *     Imagine a character generator for a role playing game. The easiest option is to let computer create the character
 *     for you. But if you want to select the character details like profession, gender, hair color etc. the character
 *     generation becomes a step-by-step process that completes when all the selections are ready.
 */
public class BuilderExample {

    public static void main(String[] args) {
        Character character = new Character.CharacterBuilder("Jane Doe", "Female")
                .buildWithHairColor("Blonde")
                .buildWithHeight("5\"4'")
                .buildWithSkinColor("Fair")
                .build();
        System.out.println(character);

    }
}

/**
 * Drawbacks of Builder Pattern:
 * It is not suitable if you want to deal with mutable objects (which can be modified later).
 *
 * You may need to duplicate some portion of the code. These duplications may have significant impact in some context
 * and turn into an antipattern.
 *
 * A concrete builder is dedicated to a particular type of product. So, to create different type of products,
 * you may need to come up with different concrete builders.
 *
 * The approach makes more sense if the structure is very complex.
 */
