package com.codecool.thao.kindergarden.children;

import com.codecool.thao.kindergarden.Activity;

public abstract class Child {
    protected int satisfactionLevel;
    protected String name;
    protected boolean happy = true;

    public Child(String name, int satisfactionLevel) {
        this.satisfactionLevel = satisfactionLevel;
        this.name = name;
    }

    public boolean isHappy() {
        return happy;
    }

    public void checkSatisfactionLevel() {
        if (this.satisfactionLevel <= 0) {
            cry();
        }
    }

    public void cry() {
        this.happy = false;
        System.out.println(name + ": I'm not satisfied! CRY! CRY! T.T");
    }

    public void reactToActivity(Activity activity) {
        if (activity.equals(Activity.SINGING)) {
            reactToSinging();
        } else if (activity.equals(Activity.BALL)) {
            reactToBall();
        } else if (activity.equals(Activity.DRAWING)) {
            reactToDrawing();
        } else if (activity.equals(Activity.DANCING)) {
            reactToDancing();
        }
    }

    public abstract void reactToSinging();
    public abstract void reactToBall();
    public abstract void reactToDrawing();
    public abstract void reactToDancing();

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "name='" + name + '\'' +
                ", satisfactionLevel=" + satisfactionLevel +
                ", isHappy=" + happy +
                '}';
    }
}
