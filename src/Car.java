public class Car {
    int kecepatan = 200;
    int gir = 3;
    int rem;

    void ubahGir(int pertambahanGir){
        pertambahanGir = 2;
        gir = gir + pertambahanGir;
        System.out.println("Gir sekarang : "+gir);
    }
    void ubahKecepatan(int pertambahanKecepatan){
        pertambahanKecepatan = 50;
        kecepatan = kecepatan + pertambahanKecepatan;
        System.out.println("Kecepatan Mobil : "+kecepatan);
    }
    void rem(int pakemRem){
        rem = rem + pakemRem;
    }

    public Car(int kecepatan, int gir, int rem) {
        this.kecepatan = kecepatan;
        this.gir = gir;
        this.rem = rem;
    }
}
