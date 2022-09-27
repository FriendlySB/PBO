package Week3PBO.Model.Staff;

import Week3PBO.Model.MataKuliah.MatkulAjar;
import java.util.ArrayList;

public class DosenHonorer extends Dosen{
    int honorPerSKS;

    public DosenHonorer(int honorPerSKS, String departemen, ArrayList<MatkulAjar> listMatkulDiajar, String nik, String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
        super(departemen, listMatkulDiajar, nik, nama, alamat, tempatLahir, tanggalLahir, telepon);
        this.honorPerSKS = honorPerSKS;
    }

    
    public int getHonorPerSKS() {
        return honorPerSKS;
    }

    public void setHonorPerSKS(int honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }
    
    @Override
    public String toString(){
        return super.toString() + "Honor/SKS: " + honorPerSKS;
    }
}
