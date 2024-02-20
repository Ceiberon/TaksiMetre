import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kullanıcıdan mesafeyi (KM) al
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gidilen mesafeyi (KM) giriniz: ");
        double mesafe = scanner.nextDouble();

        // Taksimetre ücretini hesapla
        double taksimetreUcreti = 10 + (mesafe * 2.20);

        // Minimum ücret kontrolü
        if (taksimetreUcreti < 20) {
            taksimetreUcreti = 20;
        }

        // Sonucu ekrana yazdır
        System.out.println("Taksimetre tutarı: " + taksimetreUcreti + " TL");
    }


}