import java.util.Scanner;

public class Triangulo {

    public static String tipoTriangulo(int a, int b, int c) {

        if (a == b && b == c) {
            return "Equilatero";
        } else if (a == b || a == c || b == c) {
            return "Isosceles";
        } else {
            return "Escaleno";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese lado 1:");
        int a = sc.nextInt();

        System.out.println("Ingrese lado 2:");
        int b = sc.nextInt();

        System.out.println("Ingrese lado 3:");
        int c = sc.nextInt();

        System.out.println("El triangulo es: " + tipoTriangulo(a,b,c));
    }
}