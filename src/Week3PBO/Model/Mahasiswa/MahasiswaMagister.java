package Week3PBO.Model.Mahasiswa;

import java.util.ArrayList;
import Week3PBO.Model.MataKuliah.*;

public class MahasiswaMagister extends MahasiswaSarjana {
    private String judulTesis;

    public MahasiswaMagister(String judulTesis, ArrayList<MatkulAmbil> matakuliahAmbil, String nim, String jurusan, String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
        super(matakuliahAmbil, nim, jurusan, nama, alamat, tempatLahir, tanggalLahir, telepon);
        this.judulTesis = judulTesis;
    }

    public String getJudulTesis() {
        return judulTesis;
    }

    public void setJudulTesis(String judulTesis) {
        this.judulTesis = judulTesis;
    }
    
    @Override
    public String toString(){
        return super.toString() + "Judul Tesis: " + judulTesis + "\n";
    }
    
}
