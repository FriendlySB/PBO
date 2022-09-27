package Week3PBO.View;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import Week3PBO.Model.User;
import Week3PBO.Model.Mahasiswa.*;
import Week3PBO.Controller.*;
import java.text.DecimalFormat;

public class PrintRataRataNilaiAkhir {
    
    ControllerCheckData controllerCheck = new ControllerCheckData();
    ControllerGetData controllerGet = new ControllerGetData();
    ControllerProcessData controllerProcess = new ControllerProcessData();
    
    public PrintRataRataNilaiAkhir(ArrayList<User> listUser) {
        printRataRataNA(listUser);
    }
    
    private String inputKodeMK(){
        String kodeMK = JOptionPane.showInputDialog(null, "Masukkan Kode MK: ");
        return kodeMK;
    }
    
    private void printRataRataNA(ArrayList<User> listUser){
        DecimalFormat df = new DecimalFormat("0.00");
        String kodeMK = inputKodeMK();
        String namaMK = "";
        double totalNilai = 0;
        int jumlahMahasiswa = 0;
        for(int i = 0; i < listUser.size();i++){
            if(listUser.get(i) instanceof MahasiswaSarjana){
                MahasiswaSarjana mhsSarjana = (MahasiswaSarjana)listUser.get(i);
                boolean adaMK = controllerCheck.checkKodeMK(mhsSarjana,kodeMK);
                if(adaMK == true){
                    int arrNilai[] = controllerGet.getNilaiFromMatkulAmbil(mhsSarjana, kodeMK);
                    totalNilai += controllerProcess.hitungNilaiAkhir(arrNilai[0], arrNilai[1], arrNilai[2]);
                    namaMK = controllerGet.getNamaMatkulFromKodeMK(mhsSarjana, kodeMK);
                    jumlahMahasiswa++;
                }
            }
        }
        double averageNilai = 0;
        if(jumlahMahasiswa > 0){
            averageNilai = totalNilai/jumlahMahasiswa;
        }
        String text = kodeMK + " " + namaMK + "\nJumlah Mahasiswa\t: " 
                + jumlahMahasiswa + "\nNilai Rata-Rata\t: " + df.format(averageNilai);
        JOptionPane.showMessageDialog(null, text, "Rata-Rata Nilai Akhir",1);
        
    }
}
