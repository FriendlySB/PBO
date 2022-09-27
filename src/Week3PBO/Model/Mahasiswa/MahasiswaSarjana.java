package Week3PBO.Model.Mahasiswa;

import java.util.ArrayList;
import Week3PBO.Model.MataKuliah.*;

public class MahasiswaSarjana extends Mahasiswa{
    private ArrayList<MatkulAmbil> matakuliahAmbil;

    public MahasiswaSarjana(ArrayList<MatkulAmbil> matakuliahAmbil, String nim, String jurusan, String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
        super(nim, jurusan, nama, alamat, tempatLahir, tanggalLahir, telepon);
        this.matakuliahAmbil = matakuliahAmbil;
    }

    public ArrayList<MatkulAmbil> getMatakuliahAmbil() {
        return matakuliahAmbil;
    }

    public void setMatakuliahAmbil(ArrayList<MatkulAmbil> matakuliahAmbil) {
        this.matakuliahAmbil = matakuliahAmbil;
    }
    
    @Override
    public String toString(){
        String data = super.toString() + "\n";
        for(int i = 0; i < matakuliahAmbil.size(); i++){
            MatkulAmbil temp = matakuliahAmbil.get(i);
            data += "Matkul " + (i+1) + "\n" + temp.toString() + "\n";
        }
        return data;
    }
}
