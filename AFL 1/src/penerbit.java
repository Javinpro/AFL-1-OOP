public class penerbit {
    private int id_penerbit;
    private String nama;
    private String alamat;
    private String email;
    private String no_telp;

    public penerbit(){}
    public penerbit(int id_penerbit, String nama, String alamat, String email, String no_telp){
        this.id_penerbit = id_penerbit;
        this.nama = nama;
        this.alamat = alamat;
        this.email = email;
        this.no_telp = no_telp;
    }
    public int getId_penerbit() {
        return id_penerbit;
    }
    public void setId_penerbit(int id_penerbit) {
        this.id_penerbit = id_penerbit;
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
