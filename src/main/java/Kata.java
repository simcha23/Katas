import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Kata {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println(hello("Mr Mahlangu!\n"));

        EvenOrOdd evenOrOdd = new EvenOrOdd();
        System.out.println("Enter an Integer number: (Even or Odd) \n");
        int num1 = scan.nextInt();

        System.out.println( num1 + " is an " + evenOrOdd.evenOrOdd(num1) + "\n");

        Square square = new Square();
        System.out.println("Enter an Integer number: (Square) \n");
        int num2 = scan.nextInt();

        square.square(num2);

        Triangle triangle = new Triangle();
        System.out.println("Enter an Integer number: (Triangle) \n");
        int num3 = scan.nextInt();

        triangle.triangle(num3);

        Isosceles isosceles = new Isosceles();
        System.out.println("Enter an Integer number: (Isosceles) \n");
        int num4 = scan.nextInt();

        isosceles.isosceles(num4);

        String[] arrayLongest = new String[]{"the","quick","brown", "fox", "ate", "my", "chickens","contents"};
        Longest lg = new Longest(arrayLongest);

        for (String element:lg.longest()) {
            System.out.println(element);
        }



        System.out.println();

        Combine combine = new Combine();
        Integer[] array1 = {11,22,33,44};
        Integer[] array2 = {1,2,3,4};
        combine.combine(array1, array2);

            String[] arrayFrame = new String[]{"My","Name","is", "Simcar", "Mahlangu", "An", "Information","Technology","Specialist"};
        Frame frame = new Frame(arrayFrame);
        frame.frame();

    }

    public static String hello(String greeting){

        return "\nHello " + greeting;
    }





}
