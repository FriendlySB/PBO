package Week3PBO.Model;

public abstract class User {
    private String nama;
    private String alamat;
    private String tempatLahir;
    private String tanggalLahir;
    private String telepon;

    public User(String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.telepon = telepon;
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

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
    
    public String toString(){
        return "Nama : " + nama + "\nAlamat: " + alamat + "\nTempat Lahir: " + tempatLahir 
                + "\nTgl Lahir: " + tanggalLahir +"\nTelepon: " + telepon;
    }
    
}
