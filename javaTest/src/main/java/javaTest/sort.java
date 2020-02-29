package javaTest;
import java.util.Random;
import java.util.Arrays;


public class sort{
    private int length = 10000;
    private int[] sortArray = new int[length];
    private Random random = new Random();
    public static void main(String[] args) {
        new sort();
    }


    public sort(){
        int int1;
        int int2;
        boolean perfect = false;
        for(int i = 0; i<length; i++){
            sortArray[i] = random.nextInt(1001);
        }
        System.out.println(Arrays.toString(sortArray));
        while(!perfect){
            perfect = true;
            for (int i = 0; i<length - 1; i++) {
                if(sortArray[i] > sortArray[i + 1]){
                    int1 = sortArray[i];
                    int2 = sortArray[i+1];
                    sortArray[i] = int2;
                    sortArray[i+1] = int1;
                    perfect = false;
                }
                
            }
        }
        System.out.println("--------------------");
        System.out.println(Arrays.toString(sortArray));
        
    }


}