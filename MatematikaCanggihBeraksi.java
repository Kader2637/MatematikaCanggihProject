package matematika;

import java.util.Scanner;

public class MatematikaCanggihBeraksi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MatematikaCanggih mtk = new MatematikaCanggih();
        mtk.pilihan();

        System.out.print("\nMasukkan Pilihan anda : ");
        int pilihan = input.nextInt();

        System.out.print("Masukkan angka 1 : ");
        int angka1 = input.nextInt();

        System.out.print("Masukkan angka 2 : ");
        int angka2 = input.nextInt();

        mtk.getpilihan(pilihan , angka1,angka2);
    }

}
