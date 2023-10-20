package ProjectPerusahaan;
class Sales extends Pegawai {
    private int jumlahPelanggan;
    public Sales(String NIP, String nama, String alamat, int tahunMasuk, double gajiPokok, int jumlahPelanggan) {
        super(NIP, nama, alamat, tahunMasuk, gajiPokok);
        this.jumlahPelanggan = jumlahPelanggan;
    }
    public double HitungGajiAkhir() {
        double komisi = jumlahPelanggan * 50000;
        return super.getGajiPokok() + komisi;
    }
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pelanggan: " + jumlahPelanggan);
    }
}
