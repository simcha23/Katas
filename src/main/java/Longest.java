import java.util.ArrayList;

public class Longest {

    public String[] str;


    public Longest(){};

    public Longest(String[] str){ this.str = str;}

    public ArrayList<String> longest(){

        ArrayList<String> st = new ArrayList<>();
        ArrayList<String> elements = new ArrayList<>();

        String name = "";
        int size = 0;

        for(int i = 0; i < str.length; i++){
            if(str[i].length() >= size){

                size = str[i].length();
                name = str[i];
                st.add(name);
            }

        }

        for(int z = 0; z < st.size(); z++){
            if(name.length() == st.get(z).length()){

                System.out.println(st.get(z));
                elements.add(st.get(z));

            }
        }
        System.out.println("");

        return elements;

    }

}
