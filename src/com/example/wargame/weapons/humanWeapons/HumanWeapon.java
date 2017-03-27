package com.example.wargame.weapons.humanWeapons;

import com.example.wargame.weapons.Weapon;

/**
 * Created by simonyan_51 on 27.03.2017.
 */
public abstract class HumanWeapon extends Weapon {
    private static final String TYPE = "Human Weapon";
    protected HumanWeapon(String name, int damage) {
        super(TYPE, name, damage);
    }
}
