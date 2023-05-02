package org.example;

import java.util.ArrayList;

public class Game {
    public Board b;
    private Dice d;
    private ArrayList<Player> players = new ArrayList<Player>();
    public Player winner = null;


    public Game(Board board) {
        this.b = board;
    }

    public void addPlayer(Player p) {
        this.players.add(p);
    }

    public ArrayList<Player> getPlayers() {
        return this.players;
    }

    public void move(Player p, int increment) {
        System.out.println(p.name + " : " + p.position + " : "+ increment);
        p.position = p.position + increment;

        if(this.b.ladders.get(p.position)!= null) {
            System.out.println("Ladder found");
            p.position = this.b.ladders.get(p.position);
            System.out.println(p.name + " : " + p.position);
        }

        if(this.b.snakes.get(p.position)!= null) {
            System.out.println("Snake found");
            p.position = this.b.snakes.get(p.position);
            System.out.println(p.name + " : " + p.position);
        }
    }

    public void start(){
        while(this.winner == null) {
            for(Player p: this.getPlayers()) {
                int increment = this.d.rollDice();
                this.move(p, increment);

                if(p.position >= 100) {
                    this.winner = p;
                    break;
                }
            }
        }

        System.out.println("Winner is " + this.winner.name);
    }
}
