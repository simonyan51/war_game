package com.example.wargame;

import com.example.wargame.game.Game;

/**
 * Created by simonyan_51 on 27.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Game game = new Game(2, 20);
        game.start();
    }
}
