// William Zammit
// Oct 20th 2022
// Hangman_Unit_2

import java.util.Scanner;

public class Length7 {
    public void length7(String selectedWord, char[] length7, int u, char[] length_7, int chances){

        Scanner input = new Scanner(System.in);
        String usedCharacters = "";

            while (u < chances){



            System.out.println("UsedCharacters: " + usedCharacters + "\n" + "" + length_7[0] +" "+ length_7[1]+" "+ length_7[2]+" "+ length_7[3]+" "+ length_7[4]+" "+ length_7[5]+" "+ length_7[6]);
            System.out.println("Enter a Letter!");
            System.out.println("===============");
            String a1 = input.nextLine();



            
                if (usedCharacters.indexOf(a1) >= 0){
                    System.out.println("You have already used this letter!");



                } else {
                        usedCharacters += a1.charAt(0) + " "; 
                    }



            if (a1.charAt(0) == length7[0] ||
                a1.charAt(0) == length7[1] ||
                a1.charAt(0) == length7[2] ||
                a1.charAt(0) == length7[3] ||
                a1.charAt(0) == length7[4] ||
                a1.charAt(0) == length7[5] ||
                a1.charAt(0) == length7[6]) {
            for (int i = 0; i < selectedWord.length(); i++){
            if (a1.charAt(0) == length7[i]){
                length_7[i] = a1.charAt(0);




            }
            if (length_7[0] != '_' 
             && length_7[1] != '_' 
             && length_7[2] != '_' 
             && length_7[3] != '_' 
             && length_7[4] != '_' 
             && length_7[5] != '_' 
             && length_7[6] != '_') {

                u = 6;
                System.out.println("" + length_7[0] +" "+ length_7[1]+" "+ length_7[2]+" "+ length_7[3]+" "+ length_7[4]+" "+ length_7[5]+" "+ length_7[6]);
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