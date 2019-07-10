package org.design.patterns.prototype;

public class Cake {

    private boolean shouldAddChocolateChips;

    Cake() {
        System.out.println("Contains Bread");
        System.out.println("Contains cream");
    }

    public boolean isShouldAddChocolateChips() {
        return shouldAddChocolateChips;
    }

    public void setShouldAddChocolateChips(boolean shouldAddChocolateChips) {
        this.shouldAddChocolateChips = shouldAddChocolateChips;
    }

    @Override
    protected Cake clone() {
        return new Cake();
    }
}
