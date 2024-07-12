import java.util.Scanner;

public class Patrones {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

        System.out.println("¿Que largo quieres de la secuencia de patrones?: ");
        int n = sc.nextInt();

        System.out.println("El primer patrón es: ");
        for (int i=1; i<=n; i++)
            if (i % 2 == 0) { //si el numero es par se coloca '.'
                System.out.printf(".");
            } else {
                System.out.printf("*");//sino, un '*'
            }

        System.out.println();

        System.out.println("El segundo patrón es: ");
        for (int i=1; i<=n; i++) {
            int num = i % 4;
                if (num == 0) { // para que cuando sea divisible en 4, muestra 4
                System.out.printf("4");
                } else if (i%4==1) { //si el resto es 1, se imprime 1
                    System.out.printf("1");
                }  else if (i%4==2) { //si el resto es 2, se imprime 2
                    System.out.printf("2");
                } else { //en otra situacion, se imprime 3
                    System.out.printf("3");
                }
        }

        System.out.println();

        System.out.println("El tercer patrón es: ");
        for (int i=1; i<=n; i++) {
            int num = i % 3;
            if (num == 0) { // para que cuando sea divisible en 3, muestra '*'
                System.out.printf("*");
            } else if (i%4==1) { //si el resto es 1, se imprime '|'
                System.out.printf("|");
            }  else { //en otra situacion,  se imprime '|'
                System.out.printf("|");

        }

     }
  }
}


