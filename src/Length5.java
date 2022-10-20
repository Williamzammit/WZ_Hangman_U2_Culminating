// William Zammit
// Oct 20th 2022
// Hangman_Unit_2

import java.util.Scanner;

public class Length5 {
    public void length5(String selectedWord, char[] length5, int u, char[] length_5, int chances){

        Scanner input = new Scanner(System.in);
        String usedCharacters = "";

            while (u < chances){

            
            
            System.out.println("UsedCharacters: " + usedCharacters + "\n" + "" + length_5[0] +" "+ length_5[1]+" "+ length_5[2]+" "+ length_5[3]+" "+ length_5[4]);
            System.out.println("Enter a Letter!");            
            System.out.println("============");
            String a1 = input.nextLine();
            
            
            
            
                if (usedCharacters.indexOf(a1) >= 0){
                    System.out.println("You have already used this letter!");
                 
                
                
                } else {
                        usedCharacters += a1.charAt(0) + " "; 
                    }
                
                

                if (a1.charAt(0) == length5[0] ||
                a1.charAt(0) == length5[1] ||
                a1.charAt(0) == length5[2] ||
                a1.charAt(0) == length5[3] ||
                a1.charAt(0) == length5[4]) {
            for (int i = 0; i < selectedWord.length(); i++){
            if (a1.charAt(0) == length5[i]){
                length_5[i] = a1.charAt(0);
            
            
            
            
            }
            if (length_5[0] != '_' 
             && length_5[1] != '_' 
             && length_5[2] != '_' 
             && length_5[3] != '_' 
             && length_5[4] != '_') {

                u = 6;
                System.out.println("" + length_5[0] +" "+ length_5[1]+" "+ length_5[2]+" "+ length_5[3]+" "+ length_5[4]);
                System.out.println("Congratulations, You Win!!");
                break;
             }
            }
            
        }else {
                System.out.println("There are no " + a1.charAt(0) + "s");
                u++;
                if(u >= 6){
                    System.out.println("Game over.");
                }
            }
    

    }
} 
}