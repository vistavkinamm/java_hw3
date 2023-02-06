import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class hw3{

    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        ArrayList<Integer>list2 = new ArrayList<>();

        Random rnd = new Random();

        for (int i=0; i<10; i++){
            list.add(rnd.nextInt(10));
        }

        for (int i=0; i<10; i++){
            list2.add(rnd.nextInt(10));
        }

        list.forEach(nik -> System.out.print(nik + " "));
        System.out.println();

        list2.forEach(nik -> System.out.print(nik + " "));
        System.out.println();

        list.retainAll(list2);
        list.forEach(nik -> System.out.print(nik + " "));

        Collections.sort(list);

        System.out.println(list);
    }
}