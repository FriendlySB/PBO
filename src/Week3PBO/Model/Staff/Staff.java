package Week3PBO.Model.Staff;

import Week3PBO.Model.User;

public abstract class Staff extends User{
    private String nik;

    public Staff(String nik, String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
        super(nama, alamat, tempatLahir, tanggalLahir, telepon);
        this.nik = nik;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }
    
    @Override
    public String toString(){
        return "NIK: " + nik + "\n" + super.toString();
    }
}
