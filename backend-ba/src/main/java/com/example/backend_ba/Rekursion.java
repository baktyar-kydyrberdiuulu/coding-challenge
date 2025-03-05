package com.example.backend_ba;

import java.util.Arrays;

public class Rekursion {
    public static void main(String[] args) {
//        helloWorld(10);
        // Fakultät int 5! = 5*4*3*2*1 || 5 * 4!, 4*3!, 3*2!, 2*1
        System.out.println(fakulteat(5));
    }

//    public static void helloWorld(int counter){
//        if(counter==0){
//            System.out.println("Fertig");
//        }else {
//
//            System.out.println("Hello World");
//            helloWorld( counter-1);
//
//        }
//    }

    //Fakultät
    public static int fakulteat(int zahl){
        if(zahl==1){
            return 1;
        }else {
            return zahl * fakulteat(zahl-1);
        }
    }
}
