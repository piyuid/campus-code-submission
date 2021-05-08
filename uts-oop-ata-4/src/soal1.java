import java.util.Scanner;

public class soal1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int bilangan, hasil=0;
        System.out.println("================================================");
        System.out.println("Nama : Leo Puji Christyanto");
        System.out.println("NPM : 10419083");
        System.out.println("Kelas : 208");
        System.out.println("================================================");
        System.out.println("Soal 1 - Program menentukan Bilangan Prima atau Bukan");
        System.out.println("================================================");
        System.out.print("Masukan Angka yang diinginkan: ");
        bilangan = input.nextInt();

        System.out.println("================================================");
        for (int i = 2; i <= bilangan; i++) {
            if (bilangan % i==0) {
                hasil++;
            }
        }

        if (hasil==1) {
            System.out.println("Angka " + bilangan + " Salah satu Bilangan Prima!");
        } else {
            System.out.println("Angka " + bilangan + " Bukan dari suatu Bilangan Prima!");
        }
    }
}
