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
        Bicykle bicykle = new Bicykle(20, 90, 2);
        bicykle.setSpeed(25);
        bicykle.setGear(3);
        bicykle.setCadence(bicykle.getCadence()+5);
        System.out.println(bicykle.print());
        System.out.println(bicykle.alternativePrint());
    }
}
