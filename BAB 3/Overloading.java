import java.util.Scanner;

public class Overloading {
    public static void HitungLuas(int a, int b) {
        int nilai =a*b;
        System.out.println("Maka Hasil Luas : " + nilai);
    }

    public static void HitungLuas (double valeu1, double valeu2) {
        double nilai = valeu1 * valeu2;
        System.out.println("Maka Hasil Luas : " + nilai);
    }    

    public static void main (String[] args) {

        System.out.println("=========================================");
        System.out.println("           IDENTITAS MAHASISWA           ");
        System.out.println("=========================================");
        System.out.println("Nama    : Afimarsiemo Abdhira Mahdi");
        System.out.println("NIM     : 255150707111002");
        System.out.println("Kelas   : TI-A");
        System.out.println("=========================================");
        System.out.println();

        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai integer 1 : ");
        int integer1 = in.nextInt();
        System.out.print("Masukkan nilai integer 2 : ");
        int integer2 = in.nextInt();
        HitungLuas(integer1, integer2);

        System.out.print("Masukkan nilai double 1 : ");
        double double1 = in.nextDouble();
        System.out.print("Masukkan nilai double 2 : ");
        double double2 = in.nextDouble();
        HitungLuas(double1, double2);

        in.close();

    }
    
}
