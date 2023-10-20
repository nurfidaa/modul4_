package ProjectPerusahaan;
class Manajer extends Pegawai {
    private String divisi;

    public Manajer(String NIP, String nama, String alamat, int tahunMasuk, double gajiPokok, String divisi) {
        super(NIP, nama, alamat, tahunMasuk, gajiPokok);
        this.divisi = divisi;
    }
    public double HitungGajiAkhir() {
        int tahunKerja = 2015 - super.getTahunMasuk();
        double tunjangan = 0.0;
        if (tahunKerja >= 5) {
            tunjangan = super.getGajiPokok() * 0.10;
        } else if (tahunKerja >= 3) {
            tunjangan = super.getGajiPokok() * 0.05;
        }
        return super.getGajiPokok() + tunjangan;
    }
}
