package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you num: ");
        num = scanner.nextInt();

        if (num > 7){
            System.out.println("Hello !!!");
        }else {
            System.out.println("noHello ...");
        }
    }
}
