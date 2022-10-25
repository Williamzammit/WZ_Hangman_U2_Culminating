// William Zammit
// Oct 20th 2022
// Hangman_Unit_2

import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.FileWriter; 

public class App {



    public static void main(String[] args) throws Exception {

        try{
        File EWords = new File("Easy_Difficulty.txt");
        File MWords = new File("Medium_Difficulty.txt");
        File HWords = new File("Hard_Difficulty.txt");
        if (EWords.createNewFile()){
            System.out.println("New File created:" + EWords.getName());
        } else {
            System.out.println("Easy file already exists");
        }
        if (MWords.createNewFile()){
            System.out.println("New File created:" + MWords.getName());
        } else {
            System.out.println("Medium file already exists");
        }
        if (HWords.createNewFile()){
            System.out.println("New File created:" + HWords.getName());
        } else {
            System.out.println("Hard file already exists");
        }
        }catch(IOException e){
            System.out.println("FILE ERROR");
            e.printStackTrace();
        }

        //Writing to the files
        try{
            FileWriter easyWriter = new FileWriter("Easy_Difficulty.txt");
            FileWriter mediumWriter = new FileWriter("Medium_Difficulty.txt");
            FileWriter hardWriter = new FileWriter("Hard_Difficulty.txt");
            easyWriter.write("david" + "\n" + "aiden" + "\n" + "william" + "\n" + "liam" + "\n" + "wilson" + "\n" + "john");
            easyWriter.close();
            System.out.println("Successfully wrote to the easy file");
            mediumWriter.write("mouse" + "\n" + "compute" + "\n" + "java" + "\n" + "keyboard" + "\n" + "monitor" + "\n" + "coding");
            mediumWriter.close();
            System.out.println("Successfully wrote to the medium file");
            hardWriter.write("wooden" + "\n" + "hangman" + "\n" + "tailor" + "\n" + "letter" + "\n" + "mother" + "\n" + "coffee");
            hardWriter.close();
            System.out.println("Successfully wrote to the hard file");
        } catch(IOException e){
            System.out.println("A writing error occured with the easy file");
            e.printStackTrace();
        }

        
        //initializing variables
        Scanner input = new Scanner(System.in);
        WordGuessing myObj = new WordGuessing();
        String selectedWord = "";
        int chances = 6;
        int u = 0;
        char[] myCharArray = {'_'};

        //get user input to determine difficulty
        System.out.println("Select Difficulty: Easy (e), Medium (m), Hard (h)");
        String difficulty = input.nextLine();
        if (difficulty.charAt(0) == 'h'){
            System.out.println("You have selected Hard, these words are completely random so good luck.");
            selectedWord = Files.readAllLines(Paths.get("Hard_Difficulty.txt")).get((int)(Math.random() * 7));

        } else if (difficulty.charAt(0) == 'm'){
            System.out.println("You have selected Medium, these words are focused on technology.");
            selectedWord = Files.readAllLines(Paths.get("Medium_Difficulty.txt")).get((int)(Math.random() * 7));

        } else {
            System.out.println("You have selected Easy, these words are students in the ICSU3/4 class.");
            selectedWord = Files.readAllLines(Paths.get("Easy_Difficulty.txt")).get((int)(Math.random() * 7));
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

            File EDelete = new File("Easy_Difficulty.txt");
            File MDelete = new File("Medium_Difficulty.txt");
            File HDelete = new File("Hard_Difficulty.txt");
            if (EDelete.delete()) { 
                System.out.println("Deleted the file: " + EDelete.getName());
              } else {
                System.out.println("Failed to delete the file.");
              }
            if (MDelete.delete()) { 
              System.out.println("Deleted the file: " + MDelete.getName());
            } else {
              System.out.println("Failed to delete the file.");
            } 
            if (HDelete.delete()) { 
              System.out.println("Deleted the file: " + HDelete.getName());
            } else {
              System.out.println("Failed to delete the file.");
            } 

    }
}