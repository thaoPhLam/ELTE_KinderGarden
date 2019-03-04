package com.codecool.thao.kindergarden.children;

public class MusicLover extends Child {
    public MusicLover(String name, int satisfactionLevel) {
        super(name, satisfactionLevel);
    }

    @Override
    public void reactToSinging() {
        this.satisfactionLevel = 4;
    }

    @Override
    public void reactToBall() {
        this.satisfactionLevel -= 1;
    }

    @Override
    public void reactToDrawing() {
        this.satisfactionLevel -= 1;
    }

    @Override
    public void reactToDancing() {

    }
}
