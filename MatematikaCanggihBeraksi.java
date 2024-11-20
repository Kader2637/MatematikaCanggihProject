package matematika;

import java.util.Scanner;

public class MatematikaCanggihBeraksi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MatematikaCanggih mtk = new MatematikaCanggih();
        mtk.pilihan();

        System.out.print("\nMasukkan Pilihan anda : ");
        mtk.pilihan = input.nextInt();

        System.out.print("Masukkan angka 1 : ");
        mtk.angka1 = input.nextInt();

        System.out.print("Masukkan angka 2 : ");
        mtk.angka2 = input.nextInt();

        mtk.getpilihan();
    }

}
