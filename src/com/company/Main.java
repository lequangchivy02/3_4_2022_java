package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        if(a==0){
            System.out.println("không âm dương");
        }
        if(a>0){
            System.out.println("là số dương");
        }
        if(a<0) {
            System.out.println("là số âm");}
    }
}
