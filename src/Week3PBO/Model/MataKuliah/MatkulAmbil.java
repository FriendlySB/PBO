package Week3PBO.Model.MataKuliah;

import java.util.ArrayList;
import Week3PBO.Model.Presensi.Presensi;

public class MatkulAmbil {
    private MataKuliah matkulAmbil;
    private ArrayList<Presensi> presensi;
    private int n1;
    private int n2;
    private int n3;

    public MatkulAmbil(MataKuliah matkulAmbil, ArrayList<Presensi> presensi, int n1, int n2, int n3) {
        this.matkulAmbil = matkulAmbil;
        this.presensi = presensi;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public MataKuliah getMatkulAmbil() {
        return matkulAmbil;
    }

    public void setMatkulAmbil(MataKuliah matkulAmbil) {
        this.matkulAmbil = matkulAmbil;
    }

    public ArrayList<Presensi> getPresensi() {
        return presensi;
    }

    public void setPresensi(ArrayList<Presensi> presensi) {
        this.presensi = presensi;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }
    
    @Override
    public String toString(){
        String data = matkulAmbil.toString() + "\nPresensi \n";
        for(int i = 0; i < presensi.size(); i++){
            Presensi temp = presensi.get(i);
            data += "Pertemuan " + (i + 1) + " " + temp.toString()+ "\n";
        }
        return data + "Nilai 1: " + n1 + "\nNilai 2: " + n2 + "\nNilai 3: " + n3;
    }
}
