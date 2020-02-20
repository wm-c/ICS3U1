// package threewords;
/**
 * William Meathrel 
 * January 19, 2020
 * Three Words
 */


import java.util.Scanner;

public class ThreeWord {

    // Creates new Instance of ThreeWord
    public static void main(String[] args) {
        new ThreeWord();
    }

    // Starts a scanner and asks for input pass that into the searcher
    public ThreeWord(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Phrase: ");
        String input = scanner.nextLine();

        ThreeCharacterInput(input);
        
    }

    // overload for ThreeCharaterInput
    public static void ThreeCharacterInput(String input){
        ThreeCharacterInput(input, 3);
    }


    /**
     * Splits the text then runs it through the character finder
     * 
     * @param input string to be searched
     * @param letterCount number of letters to be allowed
     */
    public static void ThreeCharacterInput(String input, int letterCount){

        // splits into a list at spacess
        String[] words = input.split(" ");
        
        // runs each string in the words array through the finder
        for (String string : words) {
            ThreeCharacterFinder(string, letterCount);
        }
        
    }

    /**
     * Finds the words with 3 letters in a row
     * 
     * @param intakes a string to be searched
     * @param letterCount number of letters to be allowed
     */
    public static void ThreeCharacterFinder(String threeCharacters, int letterCount){

        // Creates a empty string for characters and sets count to zero
        String runningCharacter = "";
        int count = 0;

        // Runs for each letter in the string
        for(int i = 0; i < threeCharacters.length(); i++){
            // if the characters are the same increase the count
            if((threeCharacters.charAt(i) + "").equals(runningCharacter)){
                count++;
                // if it has appeared the letterCount printout word and end for this word
                if(count == letterCount - 1){
                    System.out.println(threeCharacters);
                    break;
                }
            }else{
                // set character to new character
                // sets count to zero
                runningCharacter = threeCharacters.charAt(i) + "";
                count = 0;
            }
            
            
        }
    }

    


}