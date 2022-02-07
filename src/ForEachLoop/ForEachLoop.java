package ForEachLoop;

import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args) {
        // for each = traversing technique to iterate through all the elements in an array / collection
        //              less steps, more read
        //              less flexible

        //String[] animals = {"cat", "dog", "rat", "bird"};
        ArrayList<String> animals = new ArrayList<String>();

        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("bird");

        for(String i : animals) {   // For every string index in(:) for animals
            System.out.println(i);

        }

    }
}
