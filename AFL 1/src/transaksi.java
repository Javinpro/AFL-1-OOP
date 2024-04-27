import java.util.Date;
public class transaksi {
    private int kd_transaksi;
    private Date tgl_pinjam;
    private Date tgl_kembali;
    private Date tgl_transaksi;
    private int total_denda;
    private String jenis_pembayaran;
    private int total_barang_rusak;
    private int total_bayar;
    private String status_buku;
    private int total_pinjam;
    private int id_pus;
    private int ISBN_ISSN;
    private int nik;
    private String nim;
    private int id_member;

    public transaksi(){}
    public transaksi(int kd_transaksi, Date tgl_pinjam, Date tgl_kembali, Date tgl_transaksi, int total_denda, String jenis_pembayaran, int total_barang_rusak, int total_bayar, String status_buku, int total_pinjam, int id_pus, int ISBN_ISSN, int nik, String nim, int id_member){
        this.kd_transaksi = kd_transaksi;
        this.tgl_pinjam = tgl_pinjam;
        this.tgl_kembali = tgl_kembali;
        this.tgl_transaksi = tgl_transaksi;
        this.total_denda = total_denda;
        this.jenis_pembayaran = jenis_pembayaran;
        this.total_barang_rusak = total_barang_rusak;
        this.total_bayar = total_bayar;
        this.status_buku = status_buku;
        this.total_pinjam = total_pinjam;
        this.id_pus = id_pus;
        this.ISBN_ISSN = ISBN_ISSN;
        this.nik = nik;
        this.nim = nim;
        this.id_member = id_member;
    }
    public int getKd_transaksi() {
        return kd_transaksi;
    }
    public void setKd_transaksi(int kd_transaksi) {
        this.kd_transaksi = kd_transaksi;
    }
    public Date getTgl_pinjam() {
        return tgl_pinjam;
    }
    public void setTgl_pinjam(Date tgl_pinjam) {
        this.tgl_pinjam = tgl_pinjam;
    }
    public Date getTgl_kembali() {
        return tgl_kembali;
    }
    public void setTgl_kembali(Date tgl_kembali) {
        this.tgl_kembali = tgl_kembali;
    }
    public Date getTgl_transaksi() {
        return tgl_transaksi;
    }
    public void setTgl_transaksi(Date tgl_transaksi) {
        this.tgl_transaksi = tgl_transaksi;
    }
    public int getTotal_denda() {
        return total_denda;
    }
    public void setTotal_denda(int total_denda) {
        this.total_denda = total_denda;
    }
    public String getJenis_pembayaran() {
        return jenis_pembayaran;
    }
    public void setJenis_pembayaran(String jenis_pembayaran) {
        this.jenis_pembayaran = jenis_pembayaran;
    }
    public int getTotal_barang_rusak() {
        return total_barang_rusak;
    }
    public void setTotal_barang_rusak(int total_barang_rusak) {
        this.total_barang_rusak = total_barang_rusak;
    }
    public int getTotal_bayar() {
        return total_bayar;
    }
    public void setTotal_bayar(int total_bayar) {
        this.total_bayar = total_bayar;
    }
    public String getStatus_buku() {
        return status_buku;
    }
    public void setStatus_buku(String status_buku) {
        this.status_buku = status_buku;
    }
    public int getTotal_pinjam() {
        return total_pinjam;
    }
    public void setTotal_pinjam(int total_pinjam) {
        this.total_pinjam = total_pinjam;
    }
    public int getId_pus() {
        return id_pus;
    }
    public void setId_pus(int id_pus) {
        this.id_pus = id_pus;
    }
    public int getISBN_ISSN() {
        return ISBN_ISSN;
    }
    public void setISBN_ISSN(int iSBN_ISSN) {
        ISBN_ISSN = iSBN_ISSN;
    }
    public int getNik() {
        return nik;
    }
    public void setNik(int nik) {
        this.nik = nik;
    }
    public String getNim() {
        return nim;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public int getId_member() {
        return id_member;
    }
    public void setId_member(int id_member) {
        this.id_member = id_member;
    }

    


}
