import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {
    public static void main(String[] args) {

        //print the sum
        int[] myArray = {3,5,1,2,7,9,8,13,25,32};
        int sum = 0;
        for(int i: myArray) {
            sum += i;
        }
        System.out.println("Sum of myArray = " + sum);

        //numbers greater than 10
        int value = 10;
        for(int i = 0; i < myArray.length; i++) {
            if(value <= myArray[i])
            System.out.println(myArray[i]);
        }

        //create array, shuffle
        ArrayList<String> people = new ArrayList<String>();
        people.add("Nancy");
        people.add("Jinichi");
        people.add("Fujibayashi");
        people.add("Momochi");
        people.add("Ishikawa");
        Collections.shuffle(people);
        System.out.println(people);

        //names that are longer than 5 characters
        for(int i = 0; i < people.size(); i++) {
            if(people.get(i).length() > 5) {
            System.out.println(people.get(i));
            }
        }

        //array with all letters of alphabet
        Random r = new Random();
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for(char ch = 'a'; ch <= 'z'; ++ch) {
            alphabet.add(ch);
        }

        int randonNum = r.nextInt(26);
        System.out.println(alphabet);
        Collections.shuffle(alphabet);
        System.out.println(alphabet);
        System.out.println(alphabet.get(0));
        System.out.println(alphabet.get(25));
        System.out.println(randonNum);
        System.out.println(alphabet.get(randonNum));
    }

    public static int[] randonRan() {
        int[] rand = new int[10];
        Random ran = new Random();
        for(int i = 0; i < rand.length; i++) {
            rand[i] = ran.nextInt(45) + 55;
            System.out.println(rand);
        }
        return(rand);
    }
}