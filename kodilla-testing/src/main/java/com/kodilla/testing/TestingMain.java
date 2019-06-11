package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error!!!");
        }

        Calculator calculator = new Calculator(5,4);
        //test add
        int sum = calculator.getA() + calculator.getB();

        if (sum == calculator.add(5,4)) {
            System.out.println("Test Add OK");
        } else {
            System.out.println("Add Error!!!");
        }
        // test subtract
        int difference = calculator.getA() - calculator.getB();

        if (difference == calculator.subtract(5,4)) {
            System.out.println("Test Subtract OK");
        } else {
            System.out.println("Subtract Error!!!");
        }
    }
}
