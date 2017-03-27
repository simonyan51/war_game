package com.example.wargame.weapons;

/**
 * Created by simonyan_51 on 27.03.2017.
 */
public abstract class Weapon {
    private String type;
    private String name;
    private int damage;
    protected Weapon(String type, String name, int damage) {
        this.type = type;
        this.name = name;
        this.damage = damage;
    }
}
