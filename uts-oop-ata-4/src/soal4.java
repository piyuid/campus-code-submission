public class soal4 {
    public static void main(String[] args) {
        System.out.println("================================================");
        System.out.println("Nama : Leo Puji Christyanto");
        System.out.println("NPM : 10419083");
        System.out.println("Kelas : 208");
        System.out.println("================================================");
        System.out.println("Soal 4 - Membuat Bintang Segitiga dengan looping");
        System.out.println("================================================");

        int w,x,y,z;

        for (w = 1; w <= 4; w++) {
            for ( x = 8; x >= w; x--) {
                System.out.print(" ");
            }

            for ( y = 1; y <= w; y++) {
                System.out.print("*");
            }
            for ( z = 1; z <= w-1; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
