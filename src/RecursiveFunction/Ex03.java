package RecursiveFunction;

public class Ex03 {
    public int factorial(int num) {
        if (num <= 1) return 1;

        return num * factorial(num-1);
    }
}
