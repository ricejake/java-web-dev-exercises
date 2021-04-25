package org.launchcode.java.studio.countingCharacters;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class charCount {
    public static void main(String[] args) {

        String line = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = line.toCharArray();
        HashMap<Character, Integer> numOfChar = new HashMap<>();


        for(char letter : charactersInString){

                if(numOfChar.containsKey(letter)) {
                    numOfChar.put(letter, numOfChar.get(letter) +1);
                }
                else {
                    numOfChar.put(letter, 1);
                }
        }

        System.out.println(numOfChar);
    }
}


