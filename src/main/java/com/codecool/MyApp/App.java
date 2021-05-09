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
        System.out.println("Wybierz pozycje z menu");
        System.out.println("1. start");
        System.out.println("2. zakoncz");

        Scanner scanner = new Scanner(System.in);
        //int choice = scanner.nextInt();
        String response = scanner.nextLine();
        int choice = 0;
        System.out.println(response);
        if(response.equals("1")){
            choice = 1;
        } else if(response.equals("2")){
            choice = 2;
        } else {
            System.out.println("Nieprawidlowy wybor");
        }

        if(choice == 1){
            System.out.println("wybrano start");
        } else if(choice==2){
            System.out.println("wyborano koniec");
        }
    }
}
