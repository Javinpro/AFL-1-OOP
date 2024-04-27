public class pengarang {
    private int id_pengarang;
    private String nama;
    private String alamat;
    private String email;
    private String no_telp;

    public pengarang(){}
    public pengarang(int id_pengarang, String nama, String alamat, String email, String no_telp){
        this.id_pengarang = id_pengarang;
        this.nama = nama;
        this.alamat = alamat;
        this.email = email;
        this.no_telp = no_telp;
    }
    public int getId_pengarang() {
        return id_pengarang;
    }
    public void setId_pengarang(int id_pengarang) {
        this.id_pengarang = id_pengarang;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNo_telp() {
        return no_telp;
    }
    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }

    
}
