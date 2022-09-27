package Week3PBO.Model.Staff;

import java.util.ArrayList;
import Week3PBO.Model.MataKuliah.MatkulAjar;

public abstract class Dosen extends Staff{
    private String departemen;
    private ArrayList<MatkulAjar> listMatkulDiajar;

    public Dosen(String departemen, ArrayList<MatkulAjar> listMatkulDiajar, String nik, String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
        super(nik, nama, alamat, tempatLahir, tanggalLahir, telepon);
        this.departemen = departemen;
        this.listMatkulDiajar = listMatkulDiajar;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public ArrayList<MatkulAjar> getListMatkulDiajar() {
        return listMatkulDiajar;
    }

    public void setListMatkulDiajar(ArrayList<MatkulAjar> listMatkulDiajar) {
        this.listMatkulDiajar = listMatkulDiajar;
    }
    
    @Override
    public String toString(){
        String data = "\nDepartemen: " + departemen + "\nList mata kuliah yang diajarkan\n";
        for(int i = 0; i < listMatkulDiajar.size(); i++){
            data += listMatkulDiajar.toString();
        }
        return super.toString() + data;
    }
}
