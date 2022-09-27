package Week3PBO.Model.Mahasiswa;

import Week3PBO.Model.User;

public abstract class Mahasiswa extends User {
    private String nim;
    private String jurusan;

    public Mahasiswa(String nim, String jurusan, String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
        super(nama, alamat, tempatLahir, tanggalLahir, telepon);
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    
    @Override
    public String toString(){
        return "NIM: " + nim + "\nJurusan: " + jurusan + "\n" + super.toString();
    }
}
