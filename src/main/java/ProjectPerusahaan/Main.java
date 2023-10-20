package ProjectPerusahaan;

public class Main {
    public static void main(String[] args) {
        Satpam satpam1 = new Satpam("2211103052", "Gafian Putra", "Purwokerto", 2022, 7500000, 10);
        Sales sales1 = new Sales("2211106053", "Gefanda Aliya", "Temanggung", 2021, 5500000, 20);
        Manajer manajer1 = new Manajer("2211104075", "Himawari Kusuma", "Madiun", 2023, 6000000, "Keuangan");

        System.out.println("Data Satpam:");
        satpam1.tampilkanInfo();
        System.out.println("Gaji Akhir: " + satpam1.HitungGajiAkhir());

        System.out.println("\nData Sales:");
        sales1.tampilkanInfo();
        System.out.println("Gaji Akhir: " + sales1.HitungGajiAkhir());

        System.out.println("\nData Manajer:");
        manajer1.tampilkanInfo();
        System.out.println("Gaji Akhir: " + manajer1.HitungGajiAkhir());
    }
}
