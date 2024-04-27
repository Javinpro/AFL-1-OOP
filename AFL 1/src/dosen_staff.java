public class dosen_staff {
    private int nik;
    private String fak_dep;
    private String nama;
    private String prodi;

    public dosen_staff(){}
    public dosen_staff(int nik, String fak_dep, String nama, String prodi){
        this.nik = nik;
        this.fak_dep = fak_dep;
        this.nama = nama;
        this.prodi = prodi;
    }
    public int getNik() {
        return nik;
    }
    public void setNik(int nik) {
        this.nik = nik;
    }
    public String getFak_dep() {
        return fak_dep;
    }
    public void setFak_dep(String fak_dep) {
        this.fak_dep = fak_dep;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getProdi() {
        return prodi;
    }
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    
    
}