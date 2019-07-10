package org.design.patterns.prototype;

public class SquareMould extends Mould {

    @Override
    public Cake getCake() {
        return new Cake();
    }
}
