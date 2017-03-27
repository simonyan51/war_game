package com.example.wargame.soldiers.humans.types;

import com.example.wargame.coordinates.Coordinates;
import com.example.wargame.soldiers.humans.Human;
import com.example.wargame.weapons.Weapon;

/**
 * Created by simonyan_51 on 27.03.2017.
 */
public class Infantry extends Human {
    private static final String TYPE = "Infantry";
    private static final int HEALTH = 800;
    private static final int STRENGTH = 7;
    private static final int SPEED = 3;

    public Infantry(String name) {
        super(name, TYPE, HEALTH, STRENGTH, SPEED);
    }

}
