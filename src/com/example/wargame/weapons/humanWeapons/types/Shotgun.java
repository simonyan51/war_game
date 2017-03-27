package com.example.wargame.weapons.humanWeapons.types;

import com.example.wargame.weapons.humanWeapons.HumanWeapon;

/**
 * Created by simonyan_51 on 27.03.2017.
 */
public class Shotgun extends HumanWeapon {
    private static final String NAME = "Shotgun";
    private static final int DAMAGE = 62;

    public Shotgun() {
        super(NAME, DAMAGE);
    }
}
