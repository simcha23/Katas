public class Isosceles {

    public static void isosceles(int number){

        for (int i = 1; i <= number; i++) {
            for (int x =i; x <number; x++) {
                System.out.print(" ");
            }
            for (int z = 1; z < (i*2); z++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}
