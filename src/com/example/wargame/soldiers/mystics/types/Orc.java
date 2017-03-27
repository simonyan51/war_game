package com.example.wargame.soldiers.mystics.types;

import com.example.wargame.coordinates.Coordinates;
import com.example.wargame.soldiers.mystics.Mystic;
import com.example.wargame.weapons.Weapon;

/**
 * Created by simonyan_51 on 27.03.2017.
 */
public class Orc extends Mystic {
    private static final String TYPE = "Orc";
    private static final int HEALTH = 1200;
    private static final int STRENGTH = 15;
    private static final int SPEED = 1;

    public Orc(String name) {
        super(name, TYPE, HEALTH, STRENGTH, SPEED);
    }
}
