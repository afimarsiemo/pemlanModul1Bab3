public class LingkaranMain {
    public static void main(String[] args){
        System.out.println("=========================================");
        System.out.println("           IDENTITAS MAHASISWA           ");
        System.out.println("=========================================");
        System.out.println("Nama    : Afimarsiemo Abdhira Mahdi");
        System.out.println("NIM     : 255150707111002");
        System.out.println("Kelas   : TI-A");
        System.out.println("=========================================");


        Lingkaran l = new Lingkaran(3);
        l.displayMessage();

        Lingkaran l2 = new Lingkaran(4);
        l2.displayMessage();

        Lingkaran Lstring = new Lingkaran("7");
        Lstring.displayMessage();

    }
}