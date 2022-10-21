// William Zammit
// Oct 20th 2022
// Hangman_Unit_2

import java.util.Scanner;
import java.util.Arrays;

public class App {



    public static void main(String[] args) throws Exception {
        //initializing variables
        Scanner input = new Scanner(System.in);
        WordGuessing myObj = new WordGuessing();
        String[] easyWords = {"aiden", "david", "wilson", "jacen", "william", "liam"};
        String[] mediumWords = {"mouse", "compute", "java", "keyboard", "monitor", "coding"};
        String[] hardWords = {"wooden", "hangman", "tailor", "letter", "mother", "coffee"};
        String selectedWord = "";
        int chances = 6;
        int u = 0;
        char[] myCharArray = {'_'};

        //get user input to determine difficulty
        System.out.println("Select Difficulty: Easy (e), Medium (m), Hard (h)");
        String difficulty = input.nextLine();
        if (difficulty.charAt(0) == 'h'){
            System.out.println("You have selected Hard, these words are completely random so good luck.");
            selectedWord = hardWords[(int)(Math.random() * 6)];

        } else if (difficulty.charAt(0) == 'm'){
            System.out.println("You have selected Medium, these words are focused on technology.");
            selectedWord = mediumWords[(int)(Math.random() * 6)];

        } else {
            System.out.println("You have selected Easy, these words are students in the ICSU3/4 class.");
            selectedWord = easyWords[(int)(Math.random() * 6)];
        }


        
            //Sets up the arrays and calls the method which houses the loop that receives guesses from the user
            char[] wordChars = Arrays.copyOf(myCharArray, selectedWord.length());
            for (int o = 0; o < selectedWord.length(); o++){
                wordChars[o] = selectedWord.charAt(o);
            }

            char[] outputChars = Arrays.copyOf(myCharArray, selectedWord.length());
            for(int i =0; i < selectedWord.length(); i++){
                outputChars[i] = '_';
            }
           

            
            myObj.wordGuessing(selectedWord, wordChars, u, outputChars, chances);
                
            
    

    }
}