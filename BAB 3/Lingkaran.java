public class Lingkaran {
    int radius;

    public Lingkaran (int r) {
        this.radius = r;
    }

    public Lingkaran(String r) {
        this.radius = parsing(r);
    }

    public int parsing(String nilai) {
        return Integer.parseInt(nilai);
    }
    
    public void setRadius (int r) {
        this.radius = r;
    }

    public int getRadius () {
        return radius;
    }

    public double hitungLuas () {
        double luas = 3.14 * radius * radius;
        return luas;
    }

    public void displayMessage () {
        System.out.println("Hitung Luas Lingkaran : " + hitungLuas());
    }
}
