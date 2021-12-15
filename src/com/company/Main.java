package com.company;

public class Main {
    public static void main(String[] args) {

        int wiekWSekundach = 1000000000;


        System.out.printf("Merkury - %.2f\n", obliczWiekNaPlanecie(wiekWSekundach,Planety.MERKURY));
        System.out.printf("Wenus - %.2f\n", obliczWiekNaPlanecie(wiekWSekundach,Planety.WENUS));
        System.out.printf("Ziemia - %.2f\n", obliczWiekNaPlanecie(wiekWSekundach,Planety.ZIEMIA));
        System.out.printf("Mars - %.2f\n", obliczWiekNaPlanecie(wiekWSekundach,Planety.MARS));
        System.out.printf("Jowisz - %.2f\n", obliczWiekNaPlanecie(wiekWSekundach,Planety.JOWISZ));
        System.out.printf("Saturn - %.2f\n", obliczWiekNaPlanecie(wiekWSekundach,Planety.SATURN));
        System.out.printf("Uran - %.2f\n", obliczWiekNaPlanecie(wiekWSekundach,Planety.URAN));
        System.out.printf("Neptun - %.2f\n", obliczWiekNaPlanecie(wiekWSekundach,Planety.NEPTUN));


    }
}
