package com.company;

public class Counter extends Thread {

    private String name;
    private Board board;

    public Counter(String name, Board board) {
        this.name = name;
        this.board = board;
    }

    @Override
    public void run() {
        synchronized (board) {
            for (int i = 1; i < 11; i++) {
                board.notify();
                if (name == "Thread1") {
                    System.out.println(name + " - " + ((i * 2) - 1));
                } else System.out.println(name + " - " + ((i * 2)));
                try {
                    board.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}





