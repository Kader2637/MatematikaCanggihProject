package matematika;

public class MatematikaCanggih extends Matematika{

    public int modulus(int angka1, int angka2) {
            return angka1 % angka2;
    }

    public void pilihan(){
        System.out.println("\n=========Selamat datang di aplikasi matematika==========");
        System.out.println("\n1. Pertambahan");
        System.out.println("2. Perkalian");
        System.out.println("3. Modulus atau Sisa bagi");
    }

    public void getpilihan(int pilihan , int angka1 , int angka2){
        switch (pilihan) {
            case 1:
                System.out.println("\nHasil Pertambahan: " + angka1 + " + " + angka2 + " = " + pertambahan(angka1, angka2));
                break;
            case 2:
                System.out.println("\nHasil Perkalian: " + angka1 + " * " + angka2 + " = " + perkalian(angka1, angka2));
                break;
            case 3:
                if (angka2 == 0) {
                    System.out.println("Error: Pembagi tidak boleh 0");
                } else {
                    System.out.println("\nHasil Modulus: " + angka1 + " % " + angka2 + " = " + modulus(angka1, angka2));
                }
                break;
            default:
                System.out.println("\nPilihan Tidak Valid!!");
        }
    }
}
