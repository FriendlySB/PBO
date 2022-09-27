package Week3PBO.Model.Mahasiswa;


public class MahasiswaDoktor extends Mahasiswa{
    private String judulPenelitian;
    private int nilaiSidang1;
    private int nilaiSidang2;
    private int nilaiSidang3;

    public MahasiswaDoktor(String judulPenelitian, int nilaiSidang1, int nilaiSidang2, int nilaiSidang3, String nim, String jurusan, String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
        super(nim, jurusan, nama, alamat, tempatLahir, tanggalLahir, telepon);
        this.judulPenelitian = judulPenelitian;
        this.nilaiSidang1 = nilaiSidang1;
        this.nilaiSidang2 = nilaiSidang2;
        this.nilaiSidang3 = nilaiSidang3;
    }

    public String getJudulPenelitian() {
        return judulPenelitian;
    }

    public void setJudulPenelitian(String judulPenelitian) {
        this.judulPenelitian = judulPenelitian;
    }

    public int getNilaiSidang1() {
        return nilaiSidang1;
    }

    public void setNilaiSidang1(int nilaiSidang1) {
        this.nilaiSidang1 = nilaiSidang1;
    }

    public int getNilaiSidang2() {
        return nilaiSidang2;
    }

    public void setNilaiSidang2(int nilaiSidang2) {
        this.nilaiSidang2 = nilaiSidang2;
    }

    public int getNilaiSidang3() {
        return nilaiSidang3;
    }

    public void setNilaiSidang3(int nilaiSidang3) {
        this.nilaiSidang3 = nilaiSidang3;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nJudul Penelitian: " + judulPenelitian + 
                "\nNilai Sidang 1: " + nilaiSidang1 + "\nNilai Sidang 2: " 
                + nilaiSidang2 +  "\nNilai Sidang 3: " + nilaiSidang3 + "\n";
    }
}
