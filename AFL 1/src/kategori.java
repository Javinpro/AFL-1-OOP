public class kategori {
    private int kd_kat;
    private String nama;
    private String deskripsi;

    public kategori(){}
    public kategori(int kd_kat, String nama, String deskripsi){
        this.kd_kat = kd_kat;
        this.nama = nama;
        this.deskripsi = deskripsi;
    }
    public int getKd_kat() {
        return kd_kat;
    }
    public void setKd_kat(int kd_kat) {
        this.kd_kat = kd_kat;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getDeskripsi() {
        return deskripsi;
    }
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    
}
