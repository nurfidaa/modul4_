package ProjectPerusahaan;
class Satpam extends Pegawai {
    private int jamLembur;
    public Satpam(String NIP, String nama, String alamat, int tahunMasuk, double gajiPokok, int jamLembur) {
        super(NIP, nama, alamat, tahunMasuk, gajiPokok);
        this.jamLembur = jamLembur;
    }
    public double HitungGajiAkhir() {
        double bonus = jamLembur * 10000;
        return super.getGajiPokok() + bonus;
    }
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jam Lembur: " + jamLembur);
    }
}
