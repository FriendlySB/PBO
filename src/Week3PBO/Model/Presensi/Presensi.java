package Week3PBO.Model.Presensi;

public class Presensi implements PresensiInterface{
    private String tanggal;
    private int status;

    public Presensi(String tanggal, int status) {
        this.tanggal = tanggal;
        this.status = status;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    @Override
    public String toString(){
        String kehadiran;
        if(status == Hadir){
            kehadiran = "Hadir";
        } else {
            kehadiran = "Absen";
        }
        return "Tanggal: " + tanggal + "  Status: " + kehadiran;
    }
}
