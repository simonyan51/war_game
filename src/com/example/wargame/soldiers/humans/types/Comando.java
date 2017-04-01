package com.example.wargame.soldiers.humans.types;

import com.example.wargame.coordinates.Coordinates;
import com.example.wargame.soldiers.Soldier;
import com.example.wargame.soldiers.humans.Human;
import com.example.wargame.weapons.Weapon;

/**
 * Created by simonyan_51 on 27.03.2017.
 */
public class Comando extends Human {
    private static final String TYPE = "Comando";
    private static final int HEALTH = 850;
    private static final int STRENGTH = 12;
    private static final int SPEED = 4;

    public Comando(String name) {
        super(name, TYPE, HEALTH, STRENGTH, SPEED);
    }

    public boolean move(Soldier sold1) {
        int currentCoord = this.getCoordinates().getX();
        int currentCoord2 = sold1.getCoordinates().getX();
        if (currentCoord >= currentCoord2) {
            return false;
        }
        this.getCoordinates().setX(this.getCoordinates().getX() + this.getSpeed());
        System.out.println(this.getRace() + " "
                + this.getType() + " "
                + this.getName() + " (" + this.getHealth() + ") moved to "
                + this.getCoordinates().getX() + ":" + this.getCoordinates().getY());
        return true;
    }
    public boolean attack(Soldier sold1) {
        if (sold1.getHealth() <= 0 || this.getHealth() <= 0) {
            return false;
        }
        System.out.println(this.getRace() + " "
                + this.getType() + " "
                + this.getName() + " (" + this.getHealth() + ") Attacks "
                + sold1.getRace() + " "
                + sold1.getType() + " "
                + sold1.getName() + " (" + sold1.getHealth() + "), Damage: " +
                (this.getStrength() +
                        this.getWeapon().getDamage()));
        int power = this.getStrength() + this.getWeapon().getDamage();
        sold1.setHealth(power);
        if (sold1.getHealth() <= 0) {
            System.out.println(sold1.getRace() + " "
                    + sold1.getType() + " "
                    + sold1.getName() + " (" + 0 + ") Was Fallen By "
                    + this.getRace() + " "
                    + this.getType() + " "
                    + this.getName());
        }
        return true;
    }
}
