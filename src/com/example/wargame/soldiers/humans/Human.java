package com.example.wargame.soldiers.humans;

import com.example.wargame.coordinates.Coordinates;
import com.example.wargame.soldiers.Soldier;
import com.example.wargame.weapons.Weapon;
import com.example.wargame.weapons.humanWeapons.types.Gun;
import com.example.wargame.weapons.humanWeapons.types.Rifle;
import com.example.wargame.weapons.humanWeapons.types.Shotgun;

/**
 * Created by simonyan_51 on 27.03.2017.
 */
public abstract class Human extends Soldier {

    private static final String RACE = "Human";

    protected Human(String name, String type, int health, int strength, int speed) {
        super(RACE, name, type, health, strength, speed);
    }
}
