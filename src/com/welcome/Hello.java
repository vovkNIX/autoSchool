package com.welcome;
import java.util.Scanner;

public class Hello {
    public String name;
    public void setupName() {
        System.out.println("Enter your name please");
        Scanner in = new Scanner(System.in);
        name = in.nextLine();
    }
    public void welcome(){
        System.out.println("Hello " + name);
    }
    public void byeBay(){
        System.out.println("Bye " + name);
    }

}
