package com.example.wargame.game;

import com.example.wargame.coordinates.Coordinates;
import com.example.wargame.soldiers.Soldier;
import com.example.wargame.soldiers.humans.types.Comando;
import com.example.wargame.soldiers.humans.types.General;
import com.example.wargame.soldiers.humans.types.Infantry;
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
    private Soldier[] soldiers = new Soldier[countSoldiers];

    public Game(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
    }

    private void createCharacter(String race, String type, String name, String weapon, int x, int y) {
        Soldier soldier = null;
        if (race.toLowerCase().equals("human")) {
            if (type.toLowerCase().equals("general")) {
                soldier = new General(name);
            } else if (type.toLowerCase().equals("comando")) {
                soldier = new Comando(name);
            } else {
                soldier = new Infantry(name);
            }
            if (weapon.toLowerCase().equals("gun")) {
                Weapon weap = new Gun();
                soldier.setWeapon(weap);
            } else if (weapon.toLowerCase().equals("rifle")) {
                Weapon weap = new Rifle();
                soldier.setWeapon(weap);
            } else if (weapon.toLowerCase().equals("shotgun")){
                Weapon weap = new Shotgun();
                soldier.setWeapon(weap);
            }
        } else if (race.toLowerCase().equals("mystic")) {
            if (type.toLowerCase().equals("elf")) {
                soldier = new Elf(name);
            } else if (type.toLowerCase().equals("Troll")) {
                soldier = new Troll(name);
            } else {
                soldier = new Orc(name);
            }
            if (weapon.toLowerCase().equals("axe")) {
                Weapon weap = new Axe();
                soldier.setWeapon(weap);
            } else if (weapon.toLowerCase().equals("sword")) {
                Weapon weap = new Sword();
                soldier.setWeapon(weap);
            } else if (weapon.toLowerCase().equals("knife")) {
                Weapon weap = new Knife();
                soldier.setWeapon(weap);
            }
        }
        Coordinates coords = new Coordinates(x, y);
        soldier.setCoordinates(coords);
        countSoldiers++;
        soldiers[countSoldiers - 1] = soldier;
    };

    public void start() {
        for (int i = 0; i < rows; i++) {
            String[] selectedResults = new String[6];
            Scanner input = new Scanner(System.in);
            System.out.println("You Set " + rows + " Rows, Its Mean You Should Create " + (rows * 2) + " Characters");
            System.out.print("Create Character: Whats Race is Your Character, Human Or Mystic? ");
            selectedResults[0] = input.nextLine();
            System.out.print("You Choose " + selectedResults[0] + " Race, Now Choose Type Of " + selectedResults[0] + ": Infantry, Comando or General? ");
            selectedResults[1] = input.nextLine();
            System.out.print("Now, Set Name: ");
            selectedResults[2] = input.nextLine();
            if (selectedResults[0].toLowerCase().equals("human")) {
                System.out.print("You Choose " + selectedResults[1] + " Type, Now Choose Weapon: Shotgun, Gun or Rifle? ");
            } else if (selectedResults[0].toLowerCase().equals("mystic")) {
                System.out.print("You Choose " + selectedResults[1] + " Type, Now Choose Weapon: Knife, Sword or Axe? ");
            }
            selectedResults[3] = input.nextLine();
            System.out.print("Select X Coords: ");
            selectedResults[4] = input.nextLine();
            System.out.print("Select Y Coords: ");
            selectedResults[5] = input.nextLine();

            this.createCharacter(selectedResults[0], selectedResults[1],
                    selectedResults[2], selectedResults[3],
                    Integer.parseInt(selectedResults[4]),
                    Integer.parseInt(selectedResults[5]));
            System.out.println("Character Created Succesfully");
        }
    }
}
