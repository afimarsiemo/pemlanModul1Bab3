import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("           IDENTITAS MAHASISWA           ");
        System.out.println("=========================================");
        System.out.println("Nama    : Afimarsiemo Abdhira Mahdi");
        System.out.println("NIM     : 255150707111002");
        System.out.println("Kelas   : TI-A");
        System.out.println("=========================================");
        System.out.println();

        // Scanner input = new Scanner(System.in);

        // System.out.print("Masukkan jumlah siswa: ");
        // int jumlah = input.nextInt();
        // input.nextLine();

        // Student[] siswa = new Student[jumlah];

        // for(int i = 0; i < jumlah; i++){
        //     System.out.println("\nData siswa ke-" + (i+1));

        //     System.out.print("Nama                  : ");
        //     String nama = input.nextLine();

        //     System.out.print("Alamat                : ");
        //     String alamat = input.nextLine();

        //     System.out.print("Umur                  : ");
        //     int umur = input.nextInt();

        //     System.out.print("Nilai Matematika      : ");
        //     int math = input.nextInt();

        //     System.out.print("Nilai Bahasa Inggris  : ");
        //     int english = input.nextInt();

        //     System.out.print("Nilai IPA             : ");
        //     int science = input.nextInt();
        //     input.nextLine();

        //     siswa[i] = new Student(nama, alamat, umur, math, english, science);
        // }

        // System.out.println("\n===== DATA SISWA =====");

        // for(int i = 0; i < jumlah; i++){
        //     siswa[i].displayMessage();
        //     System.out.println("----------------------");
        // }

        // input.close();
        
        Student abdul = new Student();
            abdul.setNama("Abdul");
            abdul.setAlamat("Jl. Merdeka No. 1");
            abdul.setUmur(20);
            abdul.setMatematika(85);
            abdul.setBahasaInggris(90);
            abdul.setIlmuPengetahuanAlam(80);
            abdul.displayMessage();

        System.out.println("-----------------------------");
            Student budi = new Student("Budi", "Jl. Sudirman No. 2", 22, 0, 0, 0);
            budi.setMatematika(75);
            budi.setBahasaInggris(80);
            budi.setIlmuPengetahuanAlam(70);
            budi.displayMessage();

        System.out.println("-----------------------------");
            abdul = new Student("abdul", "Jl. Thamrin No. 3", 21, 0, 0, 0);
            abdul.displayMessage();

        System.out.println("-----------------------------");
            budi.setAlamat("Jl. Gatot Subroto No. 4");
            budi.setUmur(23);
            budi.displayMessage();

        Student s1 = new Student("Abdul", "Jakarta", 20, 85, 90, 80);
        Student s2 = new Student("Budi", "Bandung", 21, 70, 75, 80);
        Student s3 = new Student("Cindy", "Surabaya", 22, 88, 92, 85);

        s1.displayMessage();
        s2.displayMessage();
        s3.displayMessage();

        Student.jumlahObjek();

    }
}