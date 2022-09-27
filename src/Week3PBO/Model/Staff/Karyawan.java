package Week3PBO.Model.Staff;

import Week3PBO.Model.Presensi.PresensiStaff;
import java.util.ArrayList;

public class Karyawan extends Staff {
    private int salary;
    private ArrayList<PresensiStaff> listPresensiStaff;

    public Karyawan(int salary, ArrayList<PresensiStaff> listPresensiStaff, String nik, String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
        super(nik, nama, alamat, tempatLahir, tanggalLahir, telepon);
        this.salary = salary;
        this.listPresensiStaff = listPresensiStaff;
    }

    

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public ArrayList<PresensiStaff> getListPresensiStaff() {
        return listPresensiStaff;
    }

    public void setListPresensiStaff(ArrayList<PresensiStaff> listPresensiStaff) {
        this.listPresensiStaff = listPresensiStaff;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\n Gaji: " + salary; 
    }
}
