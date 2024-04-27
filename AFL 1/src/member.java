public class member {
    private int id_member;
    private int nik;
    private String nim;
    private String p_denda;
    private int j_denda;

    public member(){}
    public member(int id_member, int nik, String nim, String p_denda, int j_denda){
        this.id_member = id_member;
        this.nik = nik;
        this.nim = nim;
        this.p_denda = p_denda;
        this.j_denda = j_denda;
    }
    public int getId_member() {
        return id_member;
    }
    public void setId_member(int id_member) {
        this.id_member = id_member;
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
    public String getP_denda() {
        return p_denda;
    }
    public void setP_denda(String p_denda) {
        this.p_denda = p_denda;
    }
    public int getJ_denda() {
        return j_denda;
    }
    public void setJ_denda(int j_denda) {
        this.j_denda = j_denda;
    }

    
    
}