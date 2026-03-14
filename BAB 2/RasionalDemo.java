public class RasionalDemo {
    public static void main(String[] args) {
       Rasional R1 = new Rasional(1, 2);
       Rasional R2 = new Rasional(1, 3);
       Rasional R3 = new Rasional(1, 2);
       Rasional R4 = new Rasional(1, 3);

        System.out.println("=========================================");
        System.out.println("           IDENTITAS MAHASISWA           ");
        System.out.println("=========================================");
        System.out.println("Nama    : Afimarsiemo Abdhira Mahdi");
        System.out.println("NIM     : 255150707111002");
        System.out.println("Kelas   : TI-A");
        System.out.println("=========================================");
        System.out.println();

        System.out.println("R1.isRasional: " + R1.isRasional());
        System.out.println("R2.isRasional: " + R2.isRasional());
        System.out.println();
        System.out.println("R1 > R2 : " + R1.moreThan(R2));
        System.out.println("R1 < R2 : " + R1.lessThan(R2));
        System.out.println("R1 >= R2 : " + R1.lessThanEqual(R2));
        System.out.println("R1 <= R2 : " + R1.greaterThanEqual(R2));
        System.out.println();
        System.out.print("R1 : ");
        R1.cetak();
        System.out.print("R2 : ");
        R2.cetak();
        System.out.println();
        R1.Sederhana();
        R2.Sederhana();
        System.out.print("R1 : ");
        R1.cetak();
        System.out.print("R2 : ");
        R2.cetak();
        System.out.println();
        
        R3.minus(R4);
        System.out.println("R1 - R2 : "); 
        R3.cetak();

        R3 = new Rasional(1, 2);
        R3.kali(R4);
        System.out.println("R1 * R2 : ");
        R3.cetak(); 

        R3 = new Rasional(1, 2);
        R3.bagi(R4);
        System.out.print("R1 / R2 : ");
        R3.cetak();
        System.out.println();
        
        System.out.println("Setelah dilakukan Cast ke double menjadi : ");
        System.out.println("R1 : " + R1.Cast());
        System.out.println("R2 : " + R2.Cast());
        System.out.println();
        R1.negasi();
        System.out.println("Unary- dari R1 : ");
        R1.cetak();
        System.out.println();
        
        R1.unaryPlus(R2);
        System.out.println("Nilai dari 'R1 += R2' : ");
        R1.cetak();
        System.out.println();
    }
}
