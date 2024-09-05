package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] numeros ={5,2,3,1,4};
        int x =numeros[0];
        numeros[0] = numeros[4];
        numeros[4]=x;
        System.out.println(Arrays.toString(numeros));
        
        int [] numeros1 = {12,34,56};
        int [] numeros2 = {12,34,56};
        
        boolean cosa1 = Arrays.equals(numeros1,numeros2);
        boolean cosa2 = Arrays.equals(numeros1,numeros2);
        System.out.println("numeros1 y numeros2 son iguales "+ cosa1);
         System.out.println("numeros originales: "+ Arrays.toString(numeros));
         Arrays.sort(numeros);
         int n = numeros[numeros.length-1];
         System.out.println("el numero mayor es: "+numeros[numeros.length-1]);
         System.out.println("el numero menor es: "+numeros[numeros.length-0]);
         


       
        


        

        

        


        
        

    }
}