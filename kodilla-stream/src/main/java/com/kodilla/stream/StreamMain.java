package com.kodilla.stream;

import com.kodilla.stream.com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Today I'm learning Java", string -> "ABC " + string + " ABC");
        poemBeautifier.beautify("Today I'm learning Java", string -> string.toUpperCase());
        poemBeautifier.beautify("Today I'm learning Java", string -> string.toLowerCase());
        poemBeautifier.beautify("Today I'm learning Java", string -> "(^^)" + string + "(^^)");

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
