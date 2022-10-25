// William Zammit
// Oct 20th 2022
// Hangman_Unit_2

import java.util.Scanner;
import java.util.Arrays;

public class WordGuessing {
    public void wordGuessing(String selectedWord, char[] wordChars, int u, char[] outputChars, int chances){

        //initializes variables
        Scanner input = new Scanner(System.in);
        String usedCharacters = "";
        String selectedWordString = Arrays.toString(wordChars);
        String outputWord = "";


        //while loop to repeat the process of getting an input
            while (u < chances){
                outputWord = "";
                for(int k = 0; k < selectedWord.length(); k++){
                outputWord += outputChars[k] + " ";
            }


            //prints out current info and some instructions
            System.out.println("Used Characters: " + usedCharacters + "\n" + outputWord);
            
            System.out.println("\n" + "Enter a Letter!");
            System.out.println("===============");
            String a1 = input.nextLine();



                //checks to see if input has already been guessed
                if (usedCharacters.indexOf(a1) >= 0){
                    System.out.println("You have already used this letter!");



                } else {
                        usedCharacters += a1.charAt(0) + " "; 
                    }



            //Makes changes to the output if necessary based on the guess
            for (int i = 0; i < selectedWord.length(); i++){
            if (a1.charAt(0) == wordChars[i]){
                outputChars[i] = a1.charAt(0);




            }
            //Checks to see if the entire word has been correctly guessed to end the game
            if (Arrays.equals(wordChars, outputChars)) {

                u = 6;
                for(int j = 0; j < selectedWord.length(); j++){
                System.out.print(outputChars[j] + " ");
                }
                System.out.println("\n" + "Congratulations, You Win!!");
                break;
             }
            }

            //The punishment of guessing a number not in the chosen word
        if(selectedWordString.indexOf(a1) <= 0) {
                System.out.println("There are no " + a1.charAt(0) + "s");
                u++;
                if(u >= 6){
                    System.out.println("Game over.");
                }
            }


    }
}
}
