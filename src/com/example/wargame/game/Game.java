package com.example.wargame.game;

import com.example.wargame.coordinates.Coordinates;
import com.example.wargame.soldiers.Soldier;
import com.example.wargame.soldiers.humans.Human;
import com.example.wargame.soldiers.humans.types.Comando;
import com.example.wargame.soldiers.humans.types.General;
import com.example.wargame.soldiers.humans.types.Infantry;
import com.example.wargame.soldiers.mystics.Mystic;
import com.example.wargame.soldiers.mystics.types.Elf;
import com.example.wargame.soldiers.mystics.types.Orc;
import com.example.wargame.soldiers.mystics.types.Troll;
import com.example.wargame.weapons.Weapon;
import com.example.wargame.weapons.humanWeapons.types.Gun;
import com.example.wargame.weapons.humanWeapons.types.Rifle;
import com.example.wargame.weapons.humanWeapons.types.Shotgun;
import com.example.wargame.weapons.mysticWeapons.types.Axe;
import com.example.wargame.weapons.mysticWeapons.types.Knife;
import com.example.wargame.weapons.mysticWeapons.types.Sword;

import java.util.Scanner;

/**
 * Created by simonyan_51 on 27.03.2017.
 */
public class Game {
    private int cols;
    private int rows;
    private static int countSoldiers = 0;
    private Soldier[] soldiers = new Soldier[4];

    public Game(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
    }

    private void createCharacters() {
        Soldier bob = new General("Bob");
        bob.setWeapon(new Rifle());
        bob.setCoordinates(new Coordinates(0, 0));

        Soldier galactus = new Troll("Galactus");
        galactus.setWeapon(new Axe());
        galactus.setCoordinates(new Coordinates(cols, 0));

        Soldier john = new Comando("John");
        john.setWeapon(new Shotgun());
        john.setCoordinates(new Coordinates(0, 1));

        Soldier babylon = new Elf("Babylon");
        babylon.setWeapon(new Sword());
        babylon.setCoordinates(new Coordinates(cols, 1));

        soldiers[0] = bob;
        soldiers[2] = john;
        soldiers[1] = galactus;
        soldiers[3] = babylon;
    }

    private void gameProgress(Soldier sold1, Soldier sold2) {
        while(sold1.getCoordinates().getX() != sold2.getCoordinates().getX()) {

            if (sold1.getCoordinates().getX() > sold2.getCoordinates().getX()) {
                sold1.getCoordinates().setX(-(sold1.getCoordinates().getX() - sold2.getCoordinates().getX()));
                System.out.println(sold1.getRace() + " "
                        + sold1.getType() + " "
                        + sold1.getName() + " (" + sold1.getHealth() + ") moved to "
                        + sold1.getCoordinates().getX() + ":" + sold1.getCoordinates().getY());
                fight(sold1, sold2);
                break;
            }

                sold1.getCoordinates().setX(sold1.getSpeed());
                System.out.println(sold1.getRace() + " "
                        + sold1.getType() + " "
                        + sold1.getName() + " (" + sold1.getHealth() + ") moved to "
                        + sold1.getCoordinates().getX() + ":" + sold1.getCoordinates().getY());
                sold2.getCoordinates().setX(-sold2.getSpeed());
                System.out.println(sold2.getRace() + " "
                        + sold2.getType() + " "
                        + sold2.getName() + " (" + sold2.getHealth() + ") moved to "
                        + sold2.getCoordinates().getX() + ":" + sold2.getCoordinates().getY());
        }
    }

    private void fight(Soldier sold1, Soldier sold2) {

        while (sold1.getHealth() > 0 && sold2.getHealth() > 0) {
            System.out.println(sold1.getRace() + " "
                    + sold1.getType() + " "
                    + sold1.getName() + " (" + sold1.getHealth() + ") Attacks "
                    + sold2.getRace() + " "
                    + sold2.getType() + " "
                    + sold2.getName() + " (" + sold2.getHealth() + "), Damage: " +
                    (sold1.getStrength() +
                            sold1.getWeapon().getDamage()));

            System.out.println(sold2.getRace() + " "
                    + sold2.getType() + " "
                    + sold2.getName() + " ("
                    + sold2.getHealth() + ") Attacks "
                    + sold1.getRace() + " "
                    + sold1.getType() + " "
                    + sold1.getName() + " ("
                    + sold1.getHealth() + "), Damage: " +
                    (sold2.getStrength() +
                            sold2.getWeapon().getDamage()));

            sold1.setHealth(sold2.getStrength() + sold2.getWeapon().getDamage());
            sold2.setHealth(sold1.getStrength() + sold1.getWeapon().getDamage());

        }

        if (sold1.getHealth() <= 0) {
            System.out.println(sold1.getRace() + " "
                    + sold1.getType() + " "
                    + sold1.getName() + " (" + 0 + ") Was Fallen By "
                    + sold2.getRace() + " "
                    + sold2.getType() + " "
                    + sold2.getName());
            return;
        }

        if (sold2.getHealth() <= 0) {
            System.out.println(sold2.getRace() + " "
                    + sold2.getType() + " "
                    + sold2.getName() + " (" + 0 + ") Was Fallen By "
                    + sold1.getRace() + " "
                    + sold1.getType() + " "

                    + sold1.getName());
            return;
        }

    }

    public void start() {
        createCharacters();
        for (Soldier soldier : soldiers) {
            System.out.println(soldier.getRace() + " "
                    + soldier.getType() + " "
                    + soldier.getName() + " (" + soldier.getHealth() + ") arrived at "
                    + soldier.getCoordinates().getX() + ":" + soldier.getCoordinates().getY() + " Armed with "
                    + soldier.getWeapon().getName());
        }
        System.out.println("\nSoldiers Are Created. \n--------------------");
        for (int i = 0; i < soldiers.length; i++) {
            for (int j = 0; j < i; j++) {

                if (i == j) {break;}

                if (soldiers[j] instanceof Human && soldiers[i] instanceof Human) {continue;}
                if (soldiers[j] instanceof Mystic && soldiers[i] instanceof Mystic) {continue;}
                gameProgress(soldiers[i], soldiers[j]);
                fight(soldiers[i], soldiers[j]);

            }
        }
    }
}
