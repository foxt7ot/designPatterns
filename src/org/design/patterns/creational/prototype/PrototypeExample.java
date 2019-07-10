package org.design.patterns.creational.prototype;

/**
 * In general, creating a new instance from scratch is a costly operation. Using the prototype pattern, you can create
 * new instances by copying or cloning an instance of an existing one. This approach saves both time and money in
 * creating a new instance from scratch.
 * <p>
 * In short, it allows you to create a copy of an existing object and modify it to your needs, instead of going through
 * the trouble of creating an object from scratch and setting it up.
 */

/**
 * Real Life Analogy
 * Suppose my best friend Birthday is coming, so me and my other friends decide to buy a cake for him.
 * We will go to bakery and buy a cake and to make it special, I will request the seller to write, “Happy Birthday XYZ”
 * on the cake. From the seller’s point of view, he is not making any new model. He already defined the model and
 * produces many cakes (which all look the same) every day by following the same process, and finally makes each
 * special with some small changes.
 * <p>
 * Another example can be mitotic division of cell.
 */
public class PrototypeExample {

    public static void main(String[] args) {
        Cake rawCake = new SquareMould().getCake();
        System.out.println(rawCake.isShouldAddChocolateChips());
        Cake myFriendBirthdayCake = rawCake.clone();
        myFriendBirthdayCake.setShouldAddChocolateChips(true);
        System.out.println(myFriendBirthdayCake.isShouldAddChocolateChips());
    }
}