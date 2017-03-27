package com.example.wargame.soldiers.humans.types;

import com.example.wargame.coordinates.Coordinates;
import com.example.wargame.soldiers.humans.Human;
import com.example.wargame.weapons.Weapon;

/**
 * Created by simonyan_51 on 27.03.2017.
 */
public class Comando extends Human {
    private static final String TYPE = "Comando";
    private static final int HEALTH = 850;
    private static final int STRENGTH = 12;
    private static final int SPEED = 4;

    public Comando(String name) {
        super(name, TYPE, HEALTH, STRENGTH, SPEED);
    }
}
