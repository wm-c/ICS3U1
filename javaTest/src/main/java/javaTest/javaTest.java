package javaTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class javaTest{

    public static Random random = new Random();
    public static List<Character> Vowels = Arrays.asList('A', 'E', 'I', 'O', 'U');




    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            System.out.println(randomWord());
        }
    }


    public static char randomChar(){
        int randomNumber = random.nextInt(26);
        randomNumber += 65;
        char randomChar = (char) randomNumber;
        
        return randomChar;
    }

    public static String randomWord(){
        int position;
        StringBuilder stringBuilder = new StringBuilder();
        while(stringBuilder.length() < 6) {
            char randomChar = randomChar();
            if(!Vowels.contains(randomChar))
                stringBuilder.append(randomChar);

        }
        for (int i = 0; i < 1 + random.nextInt(2); i++) {
            position = random.nextInt(5);
            stringBuilder.replace(position, position + 1, Vowels.get(random.nextInt(5)).toString());
        }
        
            
       

       return stringBuilder.toString();
    }



}