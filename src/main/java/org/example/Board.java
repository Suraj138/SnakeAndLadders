package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Board {
    int size;
    public HashMap<Integer,Integer> snakes = new HashMap<Integer, Integer>();
    public HashMap<Integer,Integer> ladders = new HashMap<Integer, Integer>();

    public Board(int size) {
        this.size = size;
    }

    public void addSnake(int head, int tail){
        if(head > tail){
            this.snakes.put(head, tail);
        }

        // throw custom exception InvalidValueForSnake - head should be higher than the tail
    }

    public void addLadder(int start, int end) {
        if(start < end) {
            this.ladders.put(start, end);
        }

        // throw custom exception InvalidValueForLadder - start should be smaller that the end
    }


}
