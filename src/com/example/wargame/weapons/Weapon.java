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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
