public class Ferrari458Italia extends Car{
    String Merek = "Ferrari";
    String Jenis = "Super";
    String Warna = "Putih";
    int tahunProduksi = 2016;

    public Ferrari458Italia(int kecepatan, int gir, int rem, String merek, String jenis, String warna, int tahunProduksi) {
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
