package Week3PBO.Controller;

import Week3PBO.Model.Presensi.PresensiStaff;
import Week3PBO.Model.Presensi.PresensiInterface;
import Week3PBO.Model.MataKuliah.*;
import Week3PBO.Model.Staff.*;
import java.util.ArrayList;

public class ControllerProcessData implements PresensiInterface{
    
    public double hitungNilaiAkhir(int n1, int n2, int n3){
        return ((double)n1 + (double)n2 + (double)n3)/3;
    } 
    
    public int hitungJamAjar(MatkulAjar matkul){
        int jamAjar = 0;
        ArrayList<PresensiStaff> presensi = matkul.getListPresensiStaff();
        for(int i = 0; i < presensi.size();i++){
            PresensiStaff temp = presensi.get(i);
            if(temp.getStatus() == Hadir){
                jamAjar += temp.getJam();
            }
        }
        return jamAjar;
    }
    
    public int hitungUnit(ArrayList<PresensiStaff> listPresensi){
        int unit = 0;
        for(int i = 0; i < listPresensi.size(); i++){
            PresensiStaff presensi = listPresensi.get(i);
            if(presensi.getStatus() == Hadir){
                unit++;
            }
        }
        
        return unit;
    }
    
    public int hitungGaji(Staff staff){
        int gaji = 0;
        int unit = 0;
        if(staff instanceof Karyawan){
            Karyawan karyawan = (Karyawan)staff;
            unit = hitungUnit(karyawan.getListPresensiStaff());
            double tempGaji = (double)unit/22 * (double)karyawan.getSalary();
            gaji = (int) tempGaji;
        } else {
            Dosen dosen = (Dosen) staff;
            for(int i = 0; i < dosen.getListMatkulDiajar().size(); i++){
                MatkulAjar temp = dosen.getListMatkulDiajar().get(i);
                unit += hitungUnit(temp.getListPresensiStaff());
            }
            if(dosen instanceof DosenHonorer){
                DosenHonorer dosenHonorer = (DosenHonorer) dosen;
                gaji = unit * dosenHonorer.getHonorPerSKS();
            } else {
                DosenTetap dosenTetap = (DosenTetap) dosen;
                gaji = dosenTetap.getSalary() + (unit * 250000);
            }
        }
        return gaji;
    }
}
