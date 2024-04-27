public class mahasiswa {
    private String nim;
    private String nama;
    private String fak_dep;
    private String prodi;

    public mahasiswa(){}
    public mahasiswa(String nim, String nama, String fak_dep, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.fak_dep = fak_dep;
        this.prodi = prodi;
    }
    public String getNim() {
        return nim;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getFak_dep() {
        return fak_dep;
    }
    public void setFak_dep(String fak_dep) {
        this.fak_dep = fak_dep;
    }
    public String getProdi() {
        return prodi;
    }
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    
}
