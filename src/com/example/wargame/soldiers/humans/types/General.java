package com.example.wargame.soldiers.humans.types;

import com.example.wargame.coordinates.Coordinates;
import com.example.wargame.soldiers.humans.Human;
import com.example.wargame.weapons.Weapon;

/**
 * Created by simonyan_51 on 27.03.2017.
 */
public class General extends Human {
    private static final String TYPE = "General";
    private static final int HEALTH = 1000;
    private static final int STRENGTH = 10;
    private static final int SPEED = 2;

    public General(String name) {
        super(name, TYPE, HEALTH, STRENGTH, SPEED);
    }
}
