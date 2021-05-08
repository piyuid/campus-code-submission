import java.util.Scanner;

public class soal5 {
    static int faktorial(int x){
        int hasil = 1;
        for (int y = x; y > 0; y--) {
            hasil *=y;
        }
        return hasil;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("================================================");
        System.out.println("Nama : Leo Puji Christyanto");
        System.out.println("NPM : 10419083");
        System.out.println("Kelas : 208");
        System.out.println("================================================");
        System.out.println("Soal 5 - Memcari Hasil Faktorial suatu inputan Angka");
        System.out.println("================================================");
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();
        System.out.println("Faktorial " + angka + "! yaitu "+ faktorial(angka));
    }
}
