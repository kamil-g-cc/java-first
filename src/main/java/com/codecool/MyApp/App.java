package com.codecool.MyApp;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Field[][] board = new Field[10][10];

        for(int x = 0; x < 10; ++x){
            for (int y = 0; y<10; ++y){
                board[x][y] = new Field(x, y, true);
            }
        }
        Bicykle bicykle = new Bicykle(35, 90, 4);
        System.out.println(bicykle);
    }
}
