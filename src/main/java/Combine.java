import java.util.ArrayList;

public class Combine {

    public static void combine(Integer[] array1, Integer[] array2){

        ArrayList<Integer> combined = new ArrayList();

        for(int i = 0 ; i < array1.length; i++){
            combined.add(array1[i]);

            for(int x = i; x <= i; x++){

                combined.add(array2[x]);
            }

        }

        System.out.println(combined);
    }
}
