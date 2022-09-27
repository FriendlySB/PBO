package Week3PBO.Model.MataKuliah;

public class MatkulPilihan extends MataKuliah{
    private int jumlahMinMahasiswa;

    public MatkulPilihan(int jumlahMinMahasiswa, String kode, String nama, int sks) {
        super(kode, nama, sks);
        this.jumlahMinMahasiswa = jumlahMinMahasiswa;
    }

    public int getJumlahMinMahasiswa() {
        return jumlahMinMahasiswa;
    }

    public void setJumlahMinMahasiswa(int jumlahMinMahasiswa) {
        this.jumlahMinMahasiswa = jumlahMinMahasiswa;
    }
    
    @Override
    public String toString(){
        return super.toString() + "  Jumlah minimum : " + jumlahMinMahasiswa;
    }
}
