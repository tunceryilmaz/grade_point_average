

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fizik = input.nextInt();
        System.out.println("fizik notu : " + fizik);
        int turkce = input.nextInt();
        System.out.println("turkce notu : " + turkce);
        int matematik = input.nextInt();
        System.out.println("matematik notu : " + matematik);
        int muzik = input.nextInt();
        System.out.println("muzik notu : " + muzik);
        int toplam = muzik + matematik + turkce + fizik;
        double sonuc = (double)toplam / 4.0;
        System.out.println("ortalama :" + sonuc);
        String durum = sonuc >= 60.0 ? "Geçti" : "Kaldı";
        System.out.println(durum);
    }
}
