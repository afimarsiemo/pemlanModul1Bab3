public class Student {
    private String nama;
    private String alamat;
    private int umur;
    private double kelasMatematika;
    private double kelasBahasaInggris;
    private double kelasIlmuPengetahuanAlam;
    private double rataRata;
    private static int jumlahObjek = 0;
    
    public Student(){
        nama = "";
        alamat = "";
        umur = 0;
        jumlahObjek++;
    }
    
    public Student(String n, String a, int ag, double math, double english, double science){
        nama = n;
        alamat = a;
        umur = ag;
        kelasMatematika = math;
        kelasBahasaInggris = english;
        kelasIlmuPengetahuanAlam = science;
        jumlahObjek++;
    }
    
    public void setNama(String n){
        nama = n;
    }

    public void setAlamat(String a){
        alamat = a;
    }
    
    public void setUmur(int ag){
        umur = ag;
    }
    
    public void setMatematika(int math){
        kelasMatematika = math;
    }
    
    public void setBahasaInggris(int english){
        kelasBahasaInggris = english;
    }

    public void setIlmuPengetahuanAlam(int science){
        kelasIlmuPengetahuanAlam = science;
    }
    
    private double getRataRata(){
        double result = 0;
        result = (kelasMatematika + kelasIlmuPengetahuanAlam + kelasBahasaInggris) / 3;
        return result;
    }

    public boolean statusAkhir(){
        if(getRataRata() >= 60){
            return true;

        }else {
            return false;
        }
    }

    public static void jumlahObjek(){
        System.out.println("Jumlah objek yang telah dibuat: " + jumlahObjek);
    }
    
    public void displayMessage(){
        System.out.println("Siswa dengan nama " + nama);
        System.out.println("beralamat di " + alamat);
        System.out.println("berumur " + umur);
        System.out.println("mempunyai nilai rata rata " + getRataRata());

        if(statusAkhir()){
            System.out.println("Status Akhir : Lulus");
        } else {
            System.out.println("Status Akhir : Tidak Lulus");
        }
    }

}