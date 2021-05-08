import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, y;
        int matriksA[][] = new int[4][4];
        int matriksB[][] = new int[4][4];
        int total[][] = new int[4][4];

        System.out.println("================================================");
        System.out.println("Nama : Leo Puji Christyanto");
        System.out.println("NPM : 10419083");
        System.out.println("Kelas : 208");
        System.out.println("================================================");
        System.out.println("Soal 2 - Program Penjumlahan suatu Matriks berukuran 3 x 3");
        System.out.println("================================================");
        System.out.println("Input Block pada Matriks A dan B sesuai index nya :");

        for (x = 1; x < 4; x++) {
            for (y = 1; y < 4; y++) {
                System.out.print("Matriks A " + x + "." + y + "= ");
                matriksA[x][y] = input.nextInt();
            }
        }
        System.out.println();

        for (x = 1; x < 4; x++) {
            for (y = 1; y < 4; y++) {
                System.out.print("Matriks B " + x + "." + y + "= ");
                matriksB[x][y] = input.nextInt();
            }
        }

        for (x = 1; x < 4; x++) {
            for (y = 1; y < 4; y++) {
                total[x][y] = matriksA[x][y] + matriksB[x][y];
            }
        }
        System.out.println("\n Matrik A yang sudah di input \n");
        for (x = 1; x < 4; x++) {
            for (y = 1; y < 4; y++) {
                System.out.print("  " + matriksA[x][y]);
            }
            System.out.println();
        }

        System.out.println("\n Matrik B yang sudah di input \n");
        for (x = 1; x < 4; x++) {
            for (y = 1; y < 4; y++) {
                System.out.print("  " + matriksB[x][y]);
            }
            System.out.println();
        }
        System.out.println("\n Hasil Penjumlahan Matrik A + Matrik B\n");
        for (x = 1; x < 4; x++) {
            for (y = 1; y < 4; y++) {
                System.out.print("  " + total[x][y]);
            }
            System.out.println();
        }
    }
}
