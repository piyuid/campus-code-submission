public class soal3 {
    public static void main(String[] argumen){
        System.out.println("================================================");
        System.out.println("Nama : Leo Puji Christyanto");
        System.out.println("NPM : 10419083");
        System.out.println("Kelas : 208");
        System.out.println("================================================");
        System.out.println("Soal 3 - Program Menampilkan Angka Tertentu");
        System.out.println("================================================");

        int x, total;
        total = 0;

        for(x = 0; x <= 10; x++) {
            total = total + x;
            System.out.print( x + " ");
        }
        System.out.print("= " + total);
    }
}
