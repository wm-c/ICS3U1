package javaTest;

/**
 * @author William Meathrel
 * March 9, 2020
 * 
 * Program that checks if two random numbers are the same
 * then prints out the amount of time it takes to get there.
 */



import java.util.Random;

public class double67{

    public Random random = new Random();
    public int randomNumber;
    public int preNumber;
    public int i = 1;


    public static void main(String[] args) {
        new double67();
    }

    public double67(){
        while(true){
            randomNumber = random.nextInt(101);
            if(randomNumber == 67 && preNumber == 67){
                System.out.println("true");
                break;
            }
            preNumber = randomNumber;
            System.out.println(i);
            i++;
        }
        
        
    }






}