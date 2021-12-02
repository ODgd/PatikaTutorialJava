package PatikaÖdevleri.Methods;

public class RecursiveFibonacci {

    //Fibonacci Sayısı: f(3) = f(1)+f(2), f(4) = f(3)+f(2)...f(1) ve f(2)'nin değeri 1'dir.
    //Aşağıdaki prog recursive kullanarak yapılmıştır. Recursive metod içinde tekrar metodun çağrılmasıdır.

    static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib(10));
    }
}
