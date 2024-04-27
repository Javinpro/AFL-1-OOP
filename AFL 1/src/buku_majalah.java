public class buku_majalah {
    private int ISBN_ISSN;
    private String judul;
    private int tahun_terbit;
    private String edisi;
    private String jenis_sampul;
    private int j_rusak;
    private int j_pinjam;
    private int j_tersedia;
    private int j_total;

    public buku_majalah(){}

    public buku_majalah(int ISBN_ISSN, String judul, int tahun_terbit, String edisi, String jenis_sampul, int j_rusak, int j_pinjam, int j_tersedia, int j_total){
        this.ISBN_ISSN = ISBN_ISSN;
        this.judul = judul;
        this.tahun_terbit = tahun_terbit;
        this.edisi = edisi;
        this.jenis_sampul = jenis_sampul;
        this.j_rusak = j_rusak;
        this.j_pinjam = j_pinjam;
        this.j_tersedia = j_tersedia;
        this.j_total = j_total;
    }

    public int getISBN_ISSN() {
        return ISBN_ISSN;
    }

    public void setISBN_ISSN(int iSBN_ISSN) {
        ISBN_ISSN = iSBN_ISSN;
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

    public String getEdisi() {
        return edisi;
    }

    public void setEdisi(String edisi) {
        this.edisi = edisi;
    }

    public String getJenis_sampul() {
        return jenis_sampul;
    }

    public void setJenis_sampul(String jenis_sampul) {
        this.jenis_sampul = jenis_sampul;
    }

    public int getJ_rusak() {
        return j_rusak;
    }

    public void setJ_rusak(int j_rusak) {
        this.j_rusak = j_rusak;
    }

    public int getJ_pinjam() {
        return j_pinjam;
    }

    public void setJ_pinjam(int j_pinjam) {
        this.j_pinjam = j_pinjam;
    }

    public int getJ_tersedia() {
        return j_tersedia;
    }

    public void setJ_tersedia(int j_tersedia) {
        this.j_tersedia = j_tersedia;
    }

    public int getJ_total() {
        return j_total;
    }

    public void setJ_total(int j_total) {
        this.j_total = j_total;
    }

    
}
