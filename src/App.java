public class App {
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(args[0]);
        int x = 0;
        int fib = 1;
        int temp;

        for (int i = 0; i < n-1; i++)
        {
            temp = fib;
            fib+=x;
            x = temp;
        }

        System.out.println("The " + n + "th term of the fibonacci sequence is " + fib);
    }
}