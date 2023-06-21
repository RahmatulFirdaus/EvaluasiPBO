public class DodgeChallanger extends Car {
    String Merek = "Dodge";
    String Jenis = "Muscle";
    String Warna = "Merah";
    int tahunProduksi = 2023;

    public DodgeChallanger(int kecepatan, int gir, int rem, String merek, String jenis, String warna, int tahunProduksi) {
        super(kecepatan, gir, rem);
        Merek = merek;
        Jenis = jenis;
        Warna = warna;
        this.tahunProduksi = tahunProduksi;
    }

    void merekMobil(){
        System.out.println("Merek Mobil : "+Merek);
    }
    void jenisMobil(){
        System.out.println("Jenis Mobil : "+Jenis);
    }
    void warnaMobil(){
        System.out.println("Warna Mobil : "+Warna);
    }
    void tahunProduksiMobil(){
        System.out.println("Tahun Produksi : "+tahunProduksi);
    }


}
