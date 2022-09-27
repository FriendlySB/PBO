package Week3PBO.Model.Presensi;

public class PresensiStaff extends Presensi{
    private int jam;
    
    public PresensiStaff(int jam, String tanggal, int status) {
        super(tanggal, status);
        this.jam = jam;
    }

    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }
    
    @Override
    public String toString(){
        return super.toString() + " Jam: " + jam;
    }
}
