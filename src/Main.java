import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kilo;
        double boy,vucutKitleIndex;
        System.out.println("Lutfen boyunuzu santim cinsinden giriniz.");
        boy = scanner.nextDouble();
        System.out.println("Lutfen kilonuzu girin.");
        kilo = scanner.nextInt();
        vucutKitleIndex = kilo*10000/(boy*boy);
        System.out.println("Vucut kitle indeksiniz = "+vucutKitleIndex+"'dir.");



    }
}