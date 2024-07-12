import java.util.Scanner;

public class PatronesAnidados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un valor para n:");
        int n = sc.nextInt();

        mostrarPatron1(n);
        System.out.println();
        mostrarPatron2(n);
        System.out.println();
        mostrarPatron3(n);
        System.out.println();
        mostrarPatron4(n);
    }


        static void mostrarPatron1 (int n) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (i==0 || i==n-1 || j == 0 || j == n-1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
        }

        static void mostrarPatron2 (int n) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (i== 0 || i==n-1 || j==n-1-i) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
        }

        static void mostrarPatron3(int n) {
            for (int i=0; i < n; i++) {
                for (int j=0; j<n; j++){
                    if (j==i || j==n-1-i) {
                        System.out.print("x");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        static void mostrarPatron4 (int n) {
            for (int i = 0; i < n; i++) {
                if (i>= 1) {
                    System.out.print(" ");
                }
                for (int j = 0; j < n; j++) {
                    if ((i == 0 || i==n-1) && j < n-1) {
                            System.out.print("*");
                    } else if (i > 0 && i < n-1 && j < n-2) {
                        System.out.print("*");
                    } else if (j>=n-2) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
}

