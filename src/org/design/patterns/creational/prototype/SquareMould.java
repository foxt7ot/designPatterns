package org.design.patterns.creational.prototype;

public class SquareMould extends Mould {

    @Override
    public Cake getCake() {
        return new Cake();
    }
}
