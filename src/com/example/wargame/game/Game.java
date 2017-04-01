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
        soldiers[1] = galactus;
        soldiers[2] = john;
        soldiers[3] = babylon;
    }

    private void gameProgress() {
        boolean sold1Move = soldiers[0].move(soldiers[1]);
        boolean sold2Move = soldiers[1].move(soldiers[0]);
        boolean sold3Move = soldiers[2].move(soldiers[3]);
        boolean sold4Move = soldiers[3].move(soldiers[2]);

        while (sold1Move || sold2Move || sold3Move || sold4Move) {
            if (!sold1Move || !sold2Move) {
                soldiers[0].attack(soldiers[1]);
                soldiers[1].attack(soldiers[0]);
                sold3Move = soldiers[2].move(soldiers[3]);
                sold4Move = soldiers[3].move(soldiers[2]);
            }
            if (!sold3Move || !sold4Move) {
                sold1Move = soldiers[0].move(soldiers[1]);
                sold2Move = soldiers[1].move(soldiers[0]);
                soldiers[2].attack(soldiers[3]);
                soldiers[3].attack(soldiers[2]);
            }
            sold1Move = soldiers[0].move(soldiers[1]);
            sold2Move = soldiers[1].move(soldiers[0]);
            sold3Move = soldiers[2].move(soldiers[3]);
            sold4Move = soldiers[3].move(soldiers[2]);
        }

        boolean soldAttack1 = soldiers[0].attack(soldiers[1]);
        boolean soldAttack2 = soldiers[1].attack(soldiers[0]);
        boolean soldAttack3 = soldiers[2].attack(soldiers[3]);
        boolean soldAttack4 = soldiers[3].attack(soldiers[2]);

        while(soldAttack1 ||
                soldAttack2 ||
                soldAttack3 ||
                soldAttack4) {

            soldAttack1 = soldiers[0].attack(soldiers[1]);
            soldAttack2 = soldiers[1].attack(soldiers[0]);
            soldAttack3 = soldiers[2].attack(soldiers[3]);
            soldAttack4 = soldiers[3].attack(soldiers[2]);
        }
        if (soldiers[0].getHealth() > 0 && soldiers[2].getHealth() > 0) {
            System.out.println("Human Wins");
        } else if (soldiers[1].getHealth() > 0 && soldiers[3].getHealth() > 0) {
            System.out.println("Mystic Wins");
        } else if (soldiers[0].getHealth() > soldiers[3].getHealth() ||
                soldiers[2].getHealth() > soldiers[1].getHealth()) {
            System.out.println("Human Wins");
        } else if (soldiers[3].getHealth() > soldiers[0].getHealth() ||
                soldiers[1].getHealth() > soldiers[2].getHealth()) {
            System.out.println("Mystic Wins");
        } else {
            System.out.println("Draw");
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
        gameProgress();
    }
}
