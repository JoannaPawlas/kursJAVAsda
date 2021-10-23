import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class Homework {
    public static void main(String[] args) {
//        System.out.println("Podaj swoje nazwisko:");
//        String name = new Scanner(System.in).nextLine();
//        System.out.println(name.replace("a", "e"));


//        String sentence = "Potrafię coraz więcej z programowania";
//        String [] sentence2 = sentence.split("");
//        for (int i = 0; i < sentence2.length; i++){
//            System.out.println(sentence2[i]);

//
//        int[] array = new int[10];
//        Random rand = new Random();
//        for (int i = 0; i < array.length; i++)
//            array[i] = rand.nextInt(100) + 1;
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//// in reverse order
//        for (int i = array.length - 1; i >= 0; i--)
//            System.out.print(array[i] + " ");
//        System.out.println();

//        int i = 579, rev = 0;
//        System.out.println("Początkowa liczba: " + i);
//        while (i != 0) {
//            int digit = i % 10;
//            rev = rev * 10 + digit;
//            i /= 10;
//        }
//            System.out.println("Odwrócona liczba: " + rev);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(25);
        numbers.add(3);
        numbers.add(93);
        numbers.add(4);

        Collections.sort (numbers);

        System.out.println(numbers);

        Collections.reverse(numbers);

        System.out.println(numbers);



        }





        }









