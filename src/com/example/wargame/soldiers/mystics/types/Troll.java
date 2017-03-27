package com.example.wargame.soldiers.mystics.types;

import com.example.wargame.coordinates.Coordinates;
import com.example.wargame.soldiers.mystics.Mystic;
import com.example.wargame.weapons.Weapon;

/**
 * Created by simonyan_51 on 27.03.2017.
 */
public class Troll extends Mystic {
    private static final String TYPE = "Troll";
    private static final int HEALTH = 2000;
    private static final int STRENGTH = 30;
    private static final int SPEED = 2;

    public Troll(String name) {
        super(name, TYPE, HEALTH, STRENGTH, SPEED);
    }
}
