public class Rasional {
    private int pembilang, penyebut;

    public Rasional() {
        this.pembilang = 0;
        this.penyebut = 0;
    }   

    public Rasional(int pbl, int pyb) {
        pembilang = pbl;
        penyebut = pyb;
    }

    public boolean isRasional() {
        return penyebut != 0;
    }

    public void Sederhana() {
        int temp, a, b;

    if (penyebut ==0) {
        return;
    }

    a = (pembilang < penyebut) ? penyebut : pembilang;
    b = (pembilang < penyebut) ? pembilang : penyebut;

    for (; b != 0; ) {
        temp = a % b;
        a = b;
        b = temp;
    }

    pembilang /= a;
    penyebut /= a;
    }

    public void minus (Rasional A) {
        pembilang = pembilang * A.penyebut - penyebut * A.pembilang;
        penyebut = penyebut * A.penyebut;
    }

    public void kali (Rasional A) {
        pembilang = pembilang * A.pembilang;
        penyebut = penyebut * A.penyebut;
    }

    public void bagi (Rasional A) {
        pembilang = pembilang * A.penyebut;
        penyebut = penyebut * A.pembilang;
    }

    public double Cast() {
        return (penyebut == 0.0) ? 0.0 : (double) pembilang / (double) penyebut;
    }

    public boolean moreThan (Rasional A) {
        return (pembilang * A.penyebut > penyebut * A.pembilang);
    }

    public boolean lessThan (Rasional A) {
        return (pembilang * A.penyebut < penyebut * A.pembilang);
    }

    public boolean lessThanEqual (Rasional A) {
        return (pembilang * A.penyebut <= penyebut * A.pembilang);
    }

    public boolean greaterThanEqual (Rasional A) {
        return (pembilang * A.penyebut >= penyebut * A.pembilang);
    }

    public void negasi() {
        pembilang =- pembilang;
    }
    public void unaryPlus(Rasional A) {
        pembilang = pembilang * A.penyebut + penyebut * A.pembilang;
        penyebut *= A.penyebut;
    }

    public void cetak() {
        System.out.println(pembilang + "/" + penyebut);
    }
}
