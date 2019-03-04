package com.codecool.thao.kindergarden;


import com.codecool.thao.kindergarden.children.Child;

import java.util.ArrayList;
import java.util.List;

public class KinderGarden {
    private List<Child> children = new ArrayList<>();
    private int cryingChildCount = 0;

    public void putChildIntoKinderGarden(Child child) {
        children.add(child);
    }

    public void simulatePlayTime(Activity activity) {
        for (Child child : children) {
            if (child.isHappy()) {
                child.reactToActivity(activity);
                child.checkSatisfactionLevel();
                System.out.println(child);
            }

            if (!child.isHappy()) {
                cryingChildCount++;
            }
        }
        System.out.println();
        //checkChaos();
    }

    public void checkChaos() {
        if (cryingChildCount >= 3) {
            System.out.println("Chaos in the house!");
        }
    }
}
