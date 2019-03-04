package com.codecool.thao.kindergarden.children;

public class EasyGoing extends Child {
    public EasyGoing(String name, int satisfactionLevel) {
        super(name, satisfactionLevel);
    }

    @Override
    public void reactToSinging() {

    }

    @Override
    public void reactToBall() {
        this.satisfactionLevel -= 2;
    }

    @Override
    public void reactToDrawing() {
        this.satisfactionLevel = 4;
    }

    @Override
    public void reactToDancing() {
        this.satisfactionLevel -= 1;
    }
}
