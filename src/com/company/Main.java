package com.company;

public class Main {

    public static void main(String[] args) {
        Board board = new Board();
        Counter c1 = new Counter("Thread1", board);
	Counter c2= new Counter("Thread2", board);

c1.start();
c2.start();

    }
}
