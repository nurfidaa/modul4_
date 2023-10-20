package ProjectPerusahaan;

class Pegawai {
    private String NIP;
    private String nama;
    private String alamat;
    private int tahunMasuk;
    private double gajiPokok;

    public Pegawai(String NIP, String nama, String alamat, int tahunMasuk, double gajiPokok) {
        this.NIP = NIP;
        this.nama = nama;
        this.alamat = alamat;
        this.tahunMasuk = tahunMasuk;
        this.gajiPokok = gajiPokok;
    }

    public String getNIP() {
        return NIP;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getTahunMasuk() {
        return tahunMasuk;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public double HitungGajiAkhir() {
        return gajiPokok;
    }

    public void tampilkanInfo() {
        System.out.println("NIP: " + NIP);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Tahun Masuk: " + tahunMasuk);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}
