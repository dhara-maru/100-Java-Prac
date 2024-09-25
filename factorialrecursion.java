//Factorial using recursion

class factorialrecursion {

    static int factorial(int n) {
        // int n = 5;             //it will give error bcoz we haven't passed args. 
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);        //bcoz this method in recursion accepts an argument. 
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));

    }
}
