package FIBONACCI;

public class Fibonacci {

    static int fibonacci (int n){
        if (n == 1 || n == 2){
            return 1;
        }
        else{
            return (fibonacci (n-1) + fibonacci (n-2));
            /*Fortune: You will be attacked next Wednesday at 3:15 p.m. by six samurai
sword wielding purple fish glued to Harley-Davidson motorcycles.

Oh, and have a nice day!
		-- Bryce Nesbitt '84*/
        }
    }
}
    