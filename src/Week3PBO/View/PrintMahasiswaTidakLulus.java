package Week3PBO.View;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import Week3PBO.Model.User;
import Week3PBO.Model.Mahasiswa.*;
import Week3PBO.Controller.*;

public class PrintMahasiswaTidakLulus {
    
    ControllerCheckData controllerCheck = new ControllerCheckData();
    ControllerGetData controllerGet = new ControllerGetData();
    ControllerProcessData controllerProcess = new ControllerProcessData();
    
    public PrintMahasiswaTidakLulus(ArrayList<User> listUser) {
        hitungMahasiswaTidakLulus(listUser);
    }
    
    private String inputKodeMK(){
        String kodeMK = JOptionPane.showInputDialog(null, "Masukkan Kode MK: ");
        return kodeMK;
    }
    
    private void hitungMahasiswaTidakLulus(ArrayList<User> listUser){
        int mahasiswaTidakLulus = 0;
        int totalMahasiswa = 0;
        String kodeMK = inputKodeMK();
        String namaMK = "";
        for(int i = 0; i < listUser.size(); i++){
            if(listUser.get(i) instanceof MahasiswaSarjana){
                MahasiswaSarjana mhsSarjana = (MahasiswaSarjana) listUser.get(i);
                boolean adaMK = controllerCheck.checkKodeMK(mhsSarjana,kodeMK);
                if(adaMK == true){
                    int arrNilai[] = controllerGet.getNilaiFromMatkulAmbil(mhsSarjana, kodeMK);
                    double nilaiAkhir = controllerProcess.hitungNilaiAkhir(arrNilai[0], arrNilai[1], arrNilai[2]);
                    namaMK = controllerGet.getNamaMatkulFromKodeMK(mhsSarjana, kodeMK);
                    totalMahasiswa++;
                    if(nilaiAkhir < 56){
                        mahasiswaTidakLulus++;
                    }
                }
            }
        }
        if(totalMahasiswa == 0){
            JOptionPane.showMessageDialog(null, "Kode MK tidak ditemukan dalam sistem!", "Error",0);
        }
        JOptionPane.showMessageDialog(null, mahasiswaTidakLulus + " dari "
                + totalMahasiswa + " tidak lulus mata kuliah " + namaMK, "Hasil",1);
    }
}
