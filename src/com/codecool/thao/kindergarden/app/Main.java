package com.codecool.thao.kindergarden.app;

import com.codecool.thao.kindergarden.Activity;
import com.codecool.thao.kindergarden.children.EasyGoing;
import com.codecool.thao.kindergarden.children.Lively;
import com.codecool.thao.kindergarden.children.MusicLover;
import com.codecool.thao.kindergarden.KinderGarden;

public class Main {
    public static void main(String[] args) {
        KinderGarden kg = new KinderGarden();

        kg.putChildIntoKinderGarden(new Lively("Ede", 1));
        kg.putChildIntoKinderGarden(new EasyGoing("Kati", 4));
        kg.putChildIntoKinderGarden(new MusicLover("Zsuzsa", 2));
        kg.putChildIntoKinderGarden(new Lively("Emese", 2));
        kg.putChildIntoKinderGarden(new Lively("Emil", 3));
        kg.putChildIntoKinderGarden(new EasyGoing("Karcsi", 1));
        kg.putChildIntoKinderGarden(new MusicLover("Zoli", 3));

        kg.simulatePlayTime(Activity.SINGING);
        kg.simulatePlayTime(Activity.BALL);
        kg.simulatePlayTime(Activity.DANCING);
        kg.simulatePlayTime(Activity.DRAWING);
        kg.simulatePlayTime(Activity.SINGING);
        kg.simulatePlayTime(Activity.DRAWING);

        kg.checkChaos();
    }
}
