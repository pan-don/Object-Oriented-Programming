package Guided;

public class MobilAction {

    public static void main(String args[]) {
        Mobil mobil1 = new Mobil();
        mobil1.warna = "Hitam";
        mobil1.tahunProduksi = 1991;
        
        System.out.println("Mobil 1 warna: "+mobil1.warna);
        System.out.println("Mobil 1 tahun: "+mobil1.tahunProduksi);
    }
}
