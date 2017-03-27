package com.example.wargame.weapons.humanWeapons.types;

import com.example.wargame.weapons.humanWeapons.HumanWeapon;

/**
 * Created by simonyan_51 on 27.03.2017.
 */
public class Gun extends HumanWeapon {
    private static final String NAME = "Gun";
    private static final int DAMAGE = 18;

    public Gun() {
        super(NAME, DAMAGE);
    }
}
