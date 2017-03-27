package com.example.wargame.soldiers;

import com.example.wargame.coordinates.Coordinates;
import com.example.wargame.weapons.Weapon;

/**
 * Created by simonyan_51 on 27.03.2017.
 */
public abstract class Soldier {
    private String race;
    private String type;
    private String name;
    private int health;
    private int strength;
    private int speed;
    private Coordinates coordinates;

    protected Soldier(String race, String type, String name, int health, int strength, int speed) {
        this.race = race;
        this.type = type;
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.speed = speed;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public abstract void setWeapon(Weapon weapon);
}
