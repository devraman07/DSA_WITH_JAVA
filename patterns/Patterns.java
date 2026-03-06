package patterns;

public class Patterns {

    public static void printStars() {
        for (int line = 1; line <= 4; line++) {
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
    }

    public static void invertedStar() {
        int n = 4;
        for(int line = 1; line <= n; line++ ) {
            for(int stars = 1; stars <= n-line+1; stars++) {
               System.out.print("*");
            }
             System.out.println(" ");
        }
       
    }

    public static void HalfPyramid() {
        for(int i = 1; i <= 4 ; i++) {
            for( int j = 1 ; j <=i; j++) {
                System.out.print(j);
            }
             System.out.println(" ");
        }
    }

    public static void Charracter() {
        char Charracter = 'A';
        for(int line = 1; line <= 4; line++) {
            
            for(int ch = 1; ch <= line ; ch++) {
                 System.out.print(Charracter);
                 Charracter++;
            }
            System.out.println(' ');
        }
    }

    public static void main(String args[]) {
        // printStars();
        // invertedStar();
        // HalfPyramid();
        Charracter();
    }
}