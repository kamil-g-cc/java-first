package com.codecool.MyApp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        byte a = 126; //-128..127
        short b = 31200; //-32,768..32,767
        int c = 176234; //-2^31..2^31
        long d = 1092410; //-2^63..2^63
        float e = 2.5f; //-2^31..2^31 IEEE 754 (single-precision)
        double f = 2.5; //-2^63..2^63 EEE 754 (double-precision)
        boolean g = true;
        char h = 'a';
        String i = "to jest test";

        int[] intArray = new int[10];
        int[] anotherIntArray = {2, 3, 4, 5};

        for(int element = 0; element < anotherIntArray.length; element++){
            System.out.println(anotherIntArray[element]);
        }

        System.out.println( "-----------");

        for(int element : anotherIntArray){
            System.out.println(element);
        }

        System.out.println( "-----------");

        boolean running = true;
        int n = 0;
        while(running){
            System.out.println(anotherIntArray[n]);
            if(n<anotherIntArray.length-1){
                n++;
            } else {
                running = false;
            }
        }

        running = true;

        do{
            System.out.println("Przynajmniej raz ten napis zostanie wydrukowany");
            running = false;
        } while(running);

        System.out.println( "Hello World!" + anotherIntArray.length);
    }
}
