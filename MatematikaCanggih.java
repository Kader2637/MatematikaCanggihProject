package matematika;

public class MatematikaCanggih extends Matematika{

     int pilihan;

    public void pilihan(){
        System.out.println("\n=========Selamat datang di aplikasi matematika==========");
        System.out.println("\n1. Pengurangan");
        System.out.println("2. Pertambahan");
        System.out.println("3. Modulus / Sisa bagi");
    }

    public void getpilihan(){
        switch (pilihan){
            case 1 ->
                    System.out.println("\nHasil Pengurangan " + angka1 +  " - " + angka2 + " = "  + pengurangan());
            case 2 ->
                    System.out.println("\nHasil Pertambahan " + angka1 +  " + " + angka2 + " = "  +  pertambahan());
            case 3 ->
                    System.out.println("\nHasil Modulus " + angka1 +  " % " + angka2 + " = " +  modulus());
            default ->
                    System.out.println("\nPilihan Tidak valid!!");
        };
    }
}
