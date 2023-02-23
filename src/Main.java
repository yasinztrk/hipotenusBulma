import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double dik,kısa,uzun,cevre,alan;
        Scanner input= new Scanner(System.in);

        System.out.print("Kısa Kenar :");
        kısa=input.nextDouble();

        System.out.print("Uzun Kenar :");
        uzun=input.nextDouble();

        System.out.print("Dik Kenar :");
        dik=input.nextDouble();

        alan=(dik*uzun)/2;
        cevre=(dik+kısa+uzun);

        System.out.println("Üçgenin Alanı :"+alan);
        System.out.println("Üçgenin Çevresi :"+cevre);

    }
}