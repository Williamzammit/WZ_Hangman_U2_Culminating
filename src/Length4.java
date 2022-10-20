// William Zammit
// Oct 20th 2022
// Hangman_Unit_2

import java.util.Scanner;

public class Length4 {
    public void length4(String selectedWord, char[] length4, int u, char[] length_4, int chances){

        //initializes variables
        Scanner input = new Scanner(System.in);
        String usedCharacters = "";

            while (u < chances){


            //prints out info and gets input for the users guess
            System.out.println("UsedCharacters: " + usedCharacters + "\n" + "" + length_4[0] +" "+ length_4[1]+" "+ length_4[2]+" "+ length_4[3]);
            System.out.println("Enter a Letter!");
            System.out.println("===========");
            String a1 = input.nextLine();



                //checks to see if the character has already been used
                if (usedCharacters.indexOf(a1) >= 0){
                    System.out.println("You have already used this letter!");
                 
                
                
                } else {
                        usedCharacters += a1.charAt(0) + " "; 
                    }
                
                
            //checks to see if your input matches one of the array values and assigns that value to your guess
            if (a1.charAt(0) == length4[0] ||
                a1.charAt(0) == length4[1] ||
                a1.charAt(0) == length4[2] ||
                a1.charAt(0) == length4[3]) {
            for (int i = 0; i < selectedWord.length(); i++){
            if (a1.charAt(0) == length4[i]){
                length_4[i] = a1.charAt(0);
            
            
            
            //checks to see if all values have been changed, if so you win the game 
            }
            if (length_4[0] != '_' 
             && length_4[1] != '_' 
             && length_4[2] != '_' 
             && length_4[3] != '_') {

                u = 6;
                System.out.println("" + length_4[0] +" "+ length_4[1]+" "+ length_4[2]+" "+ length_4[3]);
                System.out.println("Congratulations, You Win!!");
                break;
             }
            }
            //checks to see if the "u" value if greater than 6(the number of chances you have)
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