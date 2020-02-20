public class EvenOrOdd {

    public  String evenOrOdd(int number){

        String answer;
        if(number % 2 == 0){
            answer = "Even number";
        }
        else {
            answer = "Odd number";
        }
        return answer;
    }
}
