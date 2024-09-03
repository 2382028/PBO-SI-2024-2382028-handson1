public class TipeDataArray {
    public static void main(String[] args) {
        //array adalah kumpulam dari sebuah data dengan tipe data yang sama
        int[] kumpulanAngka = new int [3];
        kumpulanAngka[0] = 10;
        kumpulanAngka[1] = 10;
        kumpulanAngka[2] = 10;
        System.out.println(kumpulanAngka[2]);

        //Array multi-dimension
        int[][] kumpulanAngkaMultidimension = new int[3][3];
        kumpulanAngkaMultidimension[0]= kumpulanAngka;
        System.out.println(kumpulanAngkaMultidimension[0][2]);
    }
}
