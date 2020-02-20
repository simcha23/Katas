public class Frame extends Longest {

    public String[] array;

    public Frame(String[] array){
        super(array);
        this.array = array;
    }
    public  void frame(){

        int n = longest().get(0).length() + 4;

        for (int x = 0; x < n; x++){
            System.out.print("*");
        }

        System.out.println();

        for (int i = 0; i < array.length; i++){

            System.out.print("* "+array[i]);

            int gap = ((n - array[i].length()) -4 + 1);

            for (int z = 0; z < gap; z++){

                System.out.print(" ");

                if (z == gap -1){

                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int x = 0; x < n; x++){

            System.out.print("*");
        }

        System.out.println();
    }

}
