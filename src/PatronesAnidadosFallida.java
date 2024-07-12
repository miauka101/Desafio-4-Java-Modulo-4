import java.util.Scanner;

public class PatronesAnidadosFallida {
    //Si quieres ignoras esta parte, solo quiero que quede guardado en el repositorio, me demore muchos dias en poder sacarlo asique borrarlo me da pena XD
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();

        PatronesCuadradoVacio(n); //Patron 1
        PatronesEnZ(n); //Patron 2
        PatronesEnX(n); //Patron 3
        PatronesCuadradoDesviado(n); //Patron 4
    }



    public static String PatronesCuadradoVacio(int n) {
        // Generar e imprimir los patrones directamente
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                int m = n - j; // espacios internos totales del cuadrado
                if (i >= m) {
                    for (int k = 0; k < j; k++) {
                        if (i == m || i == n - 1 || k == 0 || k == j - 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                } else {
                    for (int k = 0; k < j; k++) {
                        System.out.print(" ");
                    }
                }
                System.out.print("   "); // espacio horizontal entre patrones
            }
            System.out.println();
        }

        // Imprimir en la ultima fila los n correspondientes
        for (int j = 1; j <= n; j++) {
            for (int k = 0; k < j; k++) {
                if (k == 0) {
                    System.out.print("n=" + j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" "); // espacio entre las etiquetas para que n quede al inicio
        }
        System.out.println("\n");
        return "";
    }

        public static void PatronesEnZ(int n) {
            // Genera la Z de asteriscos para el valor de n dado
            for (int k = 1; k <= n; k++) {
                for (int i = 0; i < k; i++) {
                    for (int j = 0; j < k; j++) {
                        // Imprimir asterisco en la primera fila, última fila o diagonal de la Z
                        if (i == 0 || i == k - 1 || j == k - 1 - i) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                System.out.println(); // Separador entre diferentes tamaños
            }
            System.out.println("\n");
        }



    public static void PatronesEnX(int n) {
            // Genera la x de x para el valor de n dado
            for (int i = 0; i < n; i++) {
                for (int j = 1; j <= n; j++) {
                    int m = n - j; // espacios internos totales del cuadrado
                    if (i >= m) {
                        for (int k = 0; k < j; k++) {
                            if (i == m || i == n - 1 || k == 1 || k == j ) {
                                System.out.print("x");
                            } else if(k==j-2) {
                                System.out.print("x");
                            } else {
                                System.out.print(" ");
                            }

                        }
                    } else {
                        for (int k = 0; k < j; k++) {
                            System.out.print(" ");
                        }
                    }
                    System.out.print("   "); // espacio horizontal entre patrones
                }
                System.out.println();
            }

            // Imprimir en la ultima fila los n correspondientes
            for (int j = 1; j <= n; j++) {
                for (int k = 0; k < j; k++) {
                    if (k == 0) {
                        System.out.print("n=" + j);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print(" "); // espacio entre las etiquetas para que n quede al inicio
            }
            System.out.println("\n");
        }

    public static void PatronesCuadradoDesviado(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                int m = n - j;
                if (i >= m) {
                    for (int k = 0; k < j; k++) {
                        if (i == m || i == n - 1 || k == 0 || k == j - 1) {
                            System.out.print("*");
                        } else if (i==0||k==j) {
                            System.out.print("*");
                        } else {
                            System.out.print("*");
                        }
                    }

                    }else if (i==m||j==0) {
                        System.out.print("*");
                    } else {
                    for (int k = 0; k < j; k++) {
                        System.out.print(" ");
                    }
                }
                System.out.print("   "); // espacio horizontal entre patrones
            }
            System.out.println();
        }

        // Imprimir en la ultima fila los n correspondientes
        for (int j = 1; j <= n; j++) {
            for (int k = 0; k < j; k++) {
                if (k == 0) {
                    System.out.print("n=" + j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" "); // espacio entre las etiquetas para que n quede al inicio
        }
        System.out.println();
    }

}




