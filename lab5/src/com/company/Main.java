package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    String inputString = "Hello   ,  I  am an excellent “potato”\n\n\n\nand   I am going to grow (    maybe    )    .";
    System.out.println("Source string:");
    System.out.println(inputString);
    System.out.println("____________________________");
    System.out.println("Fixed string:");

    Interpreter inter;
    inter = new Interpreter();

    String result = inter.interpret(inputString);

    System.out.println(result);
    }
}


