package com.example.wargame.weapons.mysticWeapons.types;

import com.example.wargame.weapons.mysticWeapons.MysticWeapon;

/**
 * Created by simonyan_51 on 27.03.2017.
 */
public class Knife extends MysticWeapon {
    private static final String NAME = "Knife";
    private static final int DAMAGE = 8;

    public Knife() {
        super(NAME, DAMAGE);
    }
}
