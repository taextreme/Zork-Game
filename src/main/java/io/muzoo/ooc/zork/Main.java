package io.muzoo.ooc.zork;

import io.muzoo.ooc.zork.gamemap.GameLibrary;
import io.muzoo.ooc.zork.gamemap.GameMap;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        Game game = new Game();
        game.start();
        GameMap gameMap = new GameMap(new File("RuinPinnacleMap\\RuinPinnacleData.txt"));
//        gameMap.printIntro();
//        gameMap.printDescription();
//        GameLibrary gameLibrary = new GameLibrary();
//        gameLibrary.listBookEntry(gameLibrary.getDragonBook());
//        gameLibrary.listBookEntry(gameLibrary.getVictoryItem());

    }
}
