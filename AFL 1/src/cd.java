public class cd {
    private int kd_cd;
    private String judul;
    private int tahun_terbit;
    private int j_total;
    private int j_tersedia;
    private int j_pinjam;
    private int j_rusak;

    public cd(){}
    public cd(int kd_cd, String judul, int tahun_terbit, int j_total, int j_tersedia, int j_pinjam, int j_rusak){
        this.kd_cd = kd_cd;
        this.judul = judul;
        this.tahun_terbit = tahun_terbit;
        this.j_total = j_total;
        this.j_tersedia = j_tersedia;
        this.j_pinjam = j_pinjam;
        this.j_rusak = j_rusak;
    }
    public int getKd_cd() {
        return kd_cd;
    }
    public void setKd_cd(int kd_cd) {
        this.kd_cd = kd_cd;
    }
    public String getJudul() {
        return judul;
    }
    public void setJudul(String judul) {
        this.judul = judul;
    }
    public int getTahun_terbit() {
        return tahun_terbit;
    }
    public void setTahun_terbit(int tahun_terbit) {
        this.tahun_terbit = tahun_terbit;
    }
    public int getJ_total() {
        return j_total;
    }
    public void setJ_total(int j_total) {
        this.j_total = j_total;
    }
    public int getJ_tersedia() {
        return j_tersedia;
    }
    public void setJ_tersedia(int j_tersedia) {
        this.j_tersedia = j_tersedia;
    }
    public int getJ_pinjam() {
        return j_pinjam;
    }
    public void setJ_pinjam(int j_pinjam) {
        this.j_pinjam = j_pinjam;
    }
    public int getJ_rusak() {
        return j_rusak;
    }
    public void setJ_rusak(int j_rusak) {
        this.j_rusak = j_rusak;
    }

    
}
