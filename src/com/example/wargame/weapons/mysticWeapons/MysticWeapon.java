package com.example.wargame.weapons.mysticWeapons;

import com.example.wargame.weapons.Weapon;

/**
 * Created by simonyan_51 on 27.03.2017.
 */
public abstract class MysticWeapon extends Weapon {
    private static final String TYPE = "Mystic Weapon";
    protected MysticWeapon(String name, int damage) {
        super(TYPE, name, damage);
    }
}
