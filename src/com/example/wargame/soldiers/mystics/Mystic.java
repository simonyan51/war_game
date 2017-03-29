package com.example.wargame.soldiers.mystics;

import com.example.wargame.coordinates.Coordinates;
import com.example.wargame.soldiers.Soldier;
import com.example.wargame.weapons.Weapon;
import com.example.wargame.weapons.mysticWeapons.types.Axe;
import com.example.wargame.weapons.mysticWeapons.types.Knife;
import com.example.wargame.weapons.mysticWeapons.types.Sword;


/**
 * Created by simonyan_51 on 27.03.2017.
 */
public abstract class Mystic extends Soldier {
    private static final String RACE = "Mystic";

    protected Mystic(String name, String type, int health, int strength, int speed) {
        super(RACE, name, type, health, strength, speed);
    }
    
}
