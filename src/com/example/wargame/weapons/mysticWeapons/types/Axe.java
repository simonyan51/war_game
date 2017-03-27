package com.example.wargame.weapons.mysticWeapons.types;

import com.example.wargame.weapons.mysticWeapons.MysticWeapon;

/**
 * Created by simonyan_51 on 27.03.2017.
 */
public class Axe extends MysticWeapon {
    private static final String NAME = "Axe";
    private static final int DAMAGE = 15;

    public Axe() {
        super(NAME, DAMAGE);
    }
}
