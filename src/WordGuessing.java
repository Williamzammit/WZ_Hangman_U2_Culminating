// William Zammit
// Oct 20th 2022
// Hangman_Unit_2

import java.util.Scanner;
import java.util.Arrays;

public class WordGuessing {
    public void wordGuessing(String selectedWord, char[] wordChars, int u, char[] outputChars, int chances){

        Scanner input = new Scanner(System.in);
        String usedCharacters = "";
        String selectedWordString = Arrays.toString(wordChars);
        String outputWord = "";


            while (u < chances){
            outputWord = Arrays.toString(outputChars);

            System.out.println("Used Characters: " + usedCharacters);
            for(int k = 0; k < selectedWord.length(); k++){
            System.out.print(outputChars[k] + " ");
            }
            System.out.println("\n" + "Enter a Letter!");
            System.out.println("===============");
            String a1 = input.nextLine();




                if (usedCharacters.indexOf(a1) >= 0){
                    System.out.println("You have already used this letter!");



                } else {
                        usedCharacters += a1.charAt(0) + " "; 
                    }



            
            for (int i = 0; i < selectedWord.length(); i++){
            if (a1.charAt(0) == wordChars[i]){
                outputChars[i] = a1.charAt(0);




            }
            if (Arrays.equals(wordChars, outputChars)) {

                u = 6;
                for(int j = 0; j < selectedWord.length(); j++){
                System.out.print(outputChars[j] + " ");
                }
                System.out.println("\n" + "Congratulations, You Win!!");
                break;
             }
            }

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
