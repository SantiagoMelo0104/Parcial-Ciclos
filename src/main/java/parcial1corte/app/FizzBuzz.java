package parcial1corte.app;

public class FizzBuzz {
    public static String multiplos(int number){
        String answer = "";
        if(number % 3 == 0){
            answer = "es multiplo de 3";
        } else if (number % 5 == 0) {
            answer = "es multiplo de 5";
        } else if (number % 3 == 0 && number %5 == 0) {
            answer = "es multiplo de 3 y 5";
        }else {
            answer = " no es multiplo";
        }
        return answer;
    }
    public static String fizz_buzz( int number){
        String result = FizzBuzz.multiplos(number);
        String word = "";
        if (result == "es multiplo de 3"){
            word = "Fizz";
        } else if (result == "es multiplo de 3") {
            word = "Buzz";
        } else if (result == "es multiplo de 3 y 5") {
            word = "FizzBuzz";
        } else {
            word = String.valueOf(number);
        }
        return word;
    }

}
