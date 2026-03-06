package functions;

public class function {

    public static int product(int a, int b) {
        int ans = a * b;
        return ans;
    }

    public static int findFactorial(int n) {
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static int binomialCoefficient(int n, int r) {

        int x = n - r;

        int nfactorial = 1;
        int rfactorial = 1;
        int xfactorial = 1;

        // n!
        for (int i = 1; i <= n; i++) {
            nfactorial = nfactorial * i;
        }

        // r!
        for (int j = 1; j <= r; j++) {
            rfactorial = rfactorial * j;
        }

        // (n-r)!
        for (int k = 1; k <= x; k++) {
            xfactorial = xfactorial * k;
        }

        int binomial = nfactorial / (rfactorial * xfactorial);

        return binomial;
    }

    // public static int binomialCoefficient(int n , int r) {
    //   return findFactorial(n) / (findFactorial(r) - findFactorial( n - r));
    // }

    public static void main(String args[]) {
        // int a = 5;
        // int b = 10;

        // int prod = product( a , b);

        // System.out.println(prod);
        // int n = 6;
        // int result = findFactorial(n);

        // System.out.println("the factorial of" + " " + n + " " + "is:" + " " + result);
        int n = 5;
        int r =2;

        int result = binomialCoefficient(n, r);

        System.out.println("Binominal coffecient for" + " " + n + " " + "and" + " " +  r + " " + "is:" + " " + result);
    } 
}
