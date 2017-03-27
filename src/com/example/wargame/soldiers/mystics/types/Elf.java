package com.example.wargame.soldiers.mystics.types;

import com.example.wargame.coordinates.Coordinates;
import com.example.wargame.soldiers.mystics.Mystic;
import com.example.wargame.weapons.Weapon;

/**
 * Created by simonyan_51 on 27.03.2017.
 */
public class Elf extends Mystic {
    private static final String TYPE = "Elf";
    private static final int HEALTH = 800;
    private static final int STRENGTH = 10;
    private static final int SPEED = 5;

    public Elf(String name) {
        super(name, TYPE, HEALTH, STRENGTH, SPEED);
    }
}
