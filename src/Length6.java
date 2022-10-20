// William Zammit
// Oct 20th 2022
// Hangman_Unit_2

import java.util.Scanner;

public class Length6 {
    public void length6(String selectedWord, char[] length6, int u, char[] length_6, int chances){

        Scanner input = new Scanner(System.in);
        String usedCharacters = "";

            while (u < chances){

            
            
            System.out.println("UsedCharacters: " + usedCharacters + "\n" + "" + length_6[0] +" "+ length_6[1]+" "+ length_6[2]+" "+ length_6[3]+" "+ length_6[4]+" "+ length_6[5]);
            System.out.println("Enter a Letter!");
            System.out.println("==============");
            String a1 = input.nextLine();
            
            
            
            System.out.println(usedCharacters.indexOf(a1));
                if (usedCharacters.indexOf(a1) >= 0){
                    System.out.println("You have already used this letter!");
                 
                
                
                } else {
                        usedCharacters += a1.charAt(0) + " "; 
                    }
                
                

            if (a1.charAt(0) == length6[0] ||
                a1.charAt(0) == length6[1] ||
                a1.charAt(0) == length6[2] ||
                a1.charAt(0) == length6[3] ||
                a1.charAt(0) == length6[4] ||
                a1.charAt(0) == length6[5]) {
            for (int i = 0; i < selectedWord.length(); i++){
            if (a1.charAt(0) == length6[i]){
                length_6[i] = a1.charAt(0);
            
            
            
            
            }
            if (length_6[0] != '_' 
             && length_6[1] != '_' 
             && length_6[2] != '_' 
             && length_6[3] != '_' 
             && length_6[4] != '_' 
             && length_6[5] != '_') {

                u = 6;
                System.out.println("" + length_6[0] +" "+ length_6[1]+" "+ length_6[2]+" "+ length_6[3]+" "+ length_6[4]+" "+ length_6[5]);
                System.out.println("Congratulations, You Win!!");
                break;
             }
            }
            
        }else {
                System.out.println("There are no " + a1 + "s");
                u++;
                if(u >= 6){
                    System.out.println("Game over.");
                }
            }
    

    }
}
}