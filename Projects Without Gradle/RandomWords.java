// package RandomWords; this is what the package would be

/**
 * William Meathrel
 * Period 3
 * Monday February 18
 * 
 * I Removed the package to make it run without the use of gradle
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class RandomWords{

    // Creates a static instance of random
    public static Random random = new Random();

    // Creates a list of vowels
    public static List<Character> Vowels = Arrays.asList('A', 'E', 'I', 'O', 'U');



    // Main Function
    public static void main(String[] args) {
        // Prints out a random word 10 times
        for(int i = 0; i < 10; i++){
            System.out.println(randomWord());
        }
    }


    public static char randomChar(){

        // gets a random number between 0-25 for each letter
        int randomNumber = random.nextInt(26);

        // gets the ascii code by adding 65
        randomNumber += 65;
        
        // Turn the number to a char and returns it
        return (char) randomNumber;
    }

    public static String randomWord(){
        // Sets variables
        int position;
        StringBuilder stringBuilder = new StringBuilder();

        // loop gets constiants while less than 6 in list
        while(stringBuilder.length() < 6) {
            // gets a random char
            char randomChar = randomChar();

            // if its not a vowel add it... Could do this with a list, but choose to do this instead
            if(!Vowels.contains(randomChar))
                stringBuilder.append(randomChar);

        }
        // runs between 1 and 2 times and replaces a letter with a random vowel
        for (int i = 0; i < 1 + random.nextInt(2); i++) {
            position = random.nextInt(5);
            stringBuilder.replace(position, position + 1, Vowels.get(random.nextInt(5)).toString());
        }
        
            
       
        // returns the random word
        return stringBuilder.toString();
    }



}