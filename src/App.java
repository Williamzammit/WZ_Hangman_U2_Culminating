// William Zammit
// Oct 20th 2022
// Hangman_Unit_2

import java.util.Scanner;

public class App {



    public static void main(String[] args) throws Exception {
        //initializing variables
        Scanner input = new Scanner(System.in);
        Length7 obj7 = new Length7();
        Length6 obj6 = new Length6();
        Length5 obj5 = new Length5();
        Length4 obj4 = new Length4();
        String[] easyWords = {"aiden", "david", "wilson", "jacen", "william", "liam"};
        String[] mediumWords = {"mouse", "compute", "java", "keyboard", "monitor", "coding"};
        String[] hardWords = {"wooden", "hangman", "tailor", "letter", "mother", "coffee"};
        String selectedWord = "";
        int chances = 6;
        int u = 0;

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


        //runs specific method based on length
        if (selectedWord.length() == 7){
            
            char[] length7 = {'_', '_', '_', '_', '_', '_', '_'};
            for (int o = 0; o < selectedWord.length(); o++){
                length7[o] = selectedWord.charAt(o);
            }

            char[] length_7 = {'_', '_', '_', '_', '_', '_', '_'};
           

            
            obj7.length7(selectedWord, length7, u, length_7, chances);
                
            
    
}

        else if (selectedWord.length() == 6){
            
            char[] length6 = {'_', '_', '_', '_', '_', '_'};
            for (int o = 0; o < selectedWord.length(); o++){
                length6[o] = selectedWord.charAt(o);
            }

            char[] length_6 = {'_', '_', '_', '_', '_', '_'};
           
            
            
            obj6.length6(selectedWord, length6, u, length_6, chances);
        }

        else if (selectedWord.length() == 5){
            
            char[] length5 = {'_', '_', '_', '_', '_'};
            for (int o = 0; o < selectedWord.length(); o++){
                length5[o] = selectedWord.charAt(o);
            }

            char[] length_5 = {'_', '_', '_', '_', '_'};
           
            
            
            obj5.length5(selectedWord, length5, u, length_5, chances);
        }

        else if (selectedWord.length() == 4){
            char[] length4 = {'_', '_', '_', '_'};
            for (int o = 0; o < selectedWord.length(); o++){
                length4[o] = selectedWord.charAt(o);
            }

            char[] length_4 = {'_', '_', '_', '_'};
           
            
            
            obj4.length4(selectedWord, length4, u, length_4, chances);
        }
        
        


    }
}