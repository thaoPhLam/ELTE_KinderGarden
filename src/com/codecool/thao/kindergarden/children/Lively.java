package com.codecool.thao.kindergarden.children;

public class Lively extends Child {
    public Lively(String name, int satisfactionLevel) {
        super(name, satisfactionLevel);
    }

    @Override
    public void reactToSinging() {
        this.satisfactionLevel -= 1;
    }

    @Override
    public void reactToBall() {
        this.satisfactionLevel = 3;
    }

    @Override
    public void reactToDrawing() {
        this.satisfactionLevel -= 1;
    }

    @Override
    public void reactToDancing() {

    }
}
