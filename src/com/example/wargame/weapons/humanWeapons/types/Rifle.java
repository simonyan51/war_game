package com.example.wargame.weapons.humanWeapons.types;

import com.example.wargame.weapons.humanWeapons.HumanWeapon;

/**
 * Created by simonyan_51 on 27.03.2017.
 */
public class Rifle extends HumanWeapon {
    private static final String NAME = "Rifle";
    private static final int DAMAGE = 37;

    public Rifle() {
        super(NAME, DAMAGE);
    }
}
