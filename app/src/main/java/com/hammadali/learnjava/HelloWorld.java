package com.hammadali.learnjava;

/**
 * Created by Hammad on 10/29/17.
 */

public class HelloWorld {
    public static void main(String[] args) {
        int lives = 3;
        boolean isGameOver = (lives < 1);
        System.out.println(isGameOver);


        if(isGameOver) {
            System.out.println("Game over!");
        } else {
            System.out.println("Your still alive!");
        }
    }
}
