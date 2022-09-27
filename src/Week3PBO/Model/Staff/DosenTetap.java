package Week3PBO.Model.Staff;

import Week3PBO.Model.MataKuliah.MatkulAjar;
import java.util.ArrayList;

public class DosenTetap extends Dosen{
    private int salary;

    public DosenTetap(int salary, String departemen, ArrayList<MatkulAjar> listMatkulDiajar, String nik, String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
        super(departemen, listMatkulDiajar, nik, nama, alamat, tempatLahir, tanggalLahir, telepon);
        this.salary = salary;
    }
    
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    @Override
    public String toString(){
        return super.toString() + "Gaji: " + salary;
    }
}
