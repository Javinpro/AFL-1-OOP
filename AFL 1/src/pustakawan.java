public class pustakawan {
    private int id_pus;
    private String nama;
    private String username;
    private String password;
    private char j_kel;
    private String no_telp;
    private String photo;
    private String level;
    private String email;
    
    public pustakawan(){}
    public pustakawan(int id_pus, String nama, String username, String password, char j_kel, String no_telp, String photo, String level, String email){
        this.id_pus = id_pus;
        this.nama = nama;
        this.username = username;
        this.password = password;
        this.j_kel = j_kel;
        this.no_telp = no_telp;
        this.photo = photo;
        this.level = level;
        this.email = email;
    }
    public int getId_pus() {
        return id_pus;
    }
    public void setId_pus(int id_pus) {
        this.id_pus = id_pus;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public char getJ_kel() {
        return j_kel;
    }
    public void setJ_kel(char j_kel) {
        this.j_kel = j_kel;
    }
    public String getNo_telp() {
        return no_telp;
    }
    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }
    public String getPhoto() {
        return photo;
    }
    public void setPhoto(String photo) {
        this.photo = photo;
    }
    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    

}
