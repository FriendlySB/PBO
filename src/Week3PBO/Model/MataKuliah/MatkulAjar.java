package Week3PBO.Model.MataKuliah;

import java.util.ArrayList;
import Week3PBO.Model.Presensi.PresensiStaff;

public class MatkulAjar {
    private MataKuliah matkulDiajar;
    private ArrayList<PresensiStaff>listPresensiStaff;

    public MatkulAjar(MataKuliah matkulDiajar, ArrayList<PresensiStaff> listPresensiStaff) {
        this.matkulDiajar = matkulDiajar;
        this.listPresensiStaff = listPresensiStaff;
    }

    public MataKuliah getMatkulDiajar() {
        return matkulDiajar;
    }

    public void setMatkulDiajar(MataKuliah matkulDiajar) {
        this.matkulDiajar = matkulDiajar;
    }

    public ArrayList<PresensiStaff> getListPresensiStaff() {
        return listPresensiStaff;
    }

    public void setListPresensiStaff(ArrayList<PresensiStaff> listPresensiStaff) {
        this.listPresensiStaff = listPresensiStaff;
    }
    
    @Override
    public String toString(){
        String data = "Mata kuliah\n" + matkulDiajar.getKode() + " " 
                + matkulDiajar.getNama() + " " + matkulDiajar.getSks() + " SKS\n";
        for(int i = 0; i < listPresensiStaff.size(); i++){
            PresensiStaff temp = listPresensiStaff.get(i);
            data += "Pertemuan " + (i + 1) + " " + temp.toString() + "\n";
        }
        return data;
    }
}
