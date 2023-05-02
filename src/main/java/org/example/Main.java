package org.example;

public class Main {
    public static void main(String[] args) {
        Game g = new Game(new Board(100));
        g.addPlayer(new Player("Sunil"));
        g.addPlayer(new Player("Komal"));

        g.b.addLadder(1,38);
        g.b.addLadder(4,14);


        g.start();

    }
}