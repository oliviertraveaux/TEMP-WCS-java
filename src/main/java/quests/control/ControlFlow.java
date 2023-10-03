package quests.control;

public class ControlFlow {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;

        do {
           if(b > 10) {
               b = 1;
               a++;
           } else {
               int produit = a * b;
               System.out.printf("Le produit de %1d * %d = %d %n", a, b, produit);
               b++;
           }
        } while (a <= 10);
    }
}
