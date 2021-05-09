package com.codecool.MyApp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Bicykle bicykle = new Bicykle(25, 85, 4);
        Bicykle[] arrayOfBicykles = new Bicykle[10];

        int[] arrayOfInts = new int[10];


        for(int i = 0 ; i < arrayOfInts.length; ++i){
            System.out.println(arrayOfInts[i]);
        }

        for(int i = 0 ; i < 10; ++i){
            arrayOfBicykles[i] = new Bicykle(20, 80, 3);
        }
        for(Bicykle b : arrayOfBicykles){
            System.out.println(b.getGear());
        }

        System.out.println(bicykle.getGear());
    }
}
