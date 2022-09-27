package Week3PBO.View;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import Week3PBO.Model.User;
import Week3PBO.Model.Mahasiswa.*;
import Week3PBO.Controller.*;
import java.text.DecimalFormat;

public class PrintNilaiAkhir {
    
    ControllerCheckData controllerCheck = new ControllerCheckData();
    ControllerGetData controllerGet = new ControllerGetData();
    ControllerProcessData controllerProcess = new ControllerProcessData();
    
    public PrintNilaiAkhir(ArrayList<User> listUser) {
        printNilaiAkhir(listUser);
    }
    
    private String inputNIM(){
        String nim = JOptionPane.showInputDialog(null, "Masukkan NIM: ");
        return nim;
    }
    
    private String inputKodeMK(){
        String kodeMK = JOptionPane.showInputDialog(null, "Masukkan Kode MK: ");
        return kodeMK;
    }
    
    private void printNilaiAkhir(ArrayList<User> listUser) {
        String nim = inputNIM();
        boolean adaNIM = controllerCheck.checkNIM(listUser, nim);
        if(adaNIM){
            DecimalFormat df = new DecimalFormat("0.00");
            Mahasiswa mhs = controllerGet.getMhsFromNIM(listUser, nim);
            String text = "Nama Mahasiswa\t: " + mhs.getNama() + "\n"
                        + "NIM\t: " + mhs.getNim() + "\nJurusan\t: "
                        + mhs.getJurusan() + "\n";
            if(mhs instanceof MahasiswaDoktor){
                MahasiswaDoktor mhsDoktor = (MahasiswaDoktor)mhs;
                int n1 = mhsDoktor.getNilaiSidang1();
                int n2 = mhsDoktor.getNilaiSidang2();
                int n3 = mhsDoktor.getNilaiSidang3();
                double nilaiAkhir = controllerProcess.hitungNilaiAkhir(n1,n2,n3);
                text += "Nilai Sidang 1\t:" + n1 + "\nNilai Sidang 2\t: " + n2 
                        +"\nNilai Sidang 3\t: " + n3 + "\nNilai Akhir\t: " 
                        + df.format(nilaiAkhir) + "\n";
                JOptionPane.showMessageDialog(null, text, "Nilai Akhir",1);
            } else {
                MahasiswaSarjana mhsSarjana = (MahasiswaSarjana) mhs;
                String kodeMK = inputKodeMK();
                boolean adaMK = controllerCheck.checkKodeMK(mhsSarjana,kodeMK);
                if(adaMK == true){
                    int arrNilai[] = controllerGet.getNilaiFromMatkulAmbil(mhsSarjana, kodeMK);
                    double nilaiAkhir = controllerProcess.hitungNilaiAkhir(arrNilai[0], arrNilai[1], arrNilai[2]);
                    text += "Nilai 1\t:" + arrNilai[0] + "\nNilai 2\t: " + arrNilai[1] 
                        +"\nNilai 3\t: " + arrNilai[2] + "\nNilai Akhir\t: " 
                        + df.format(nilaiAkhir)+ "\n";
                    JOptionPane.showMessageDialog(null, text, "Nilai Akhir " + kodeMK + " "
                            + controllerGet.getNamaMatkulFromKodeMK(mhsSarjana, kodeMK),1);
                } else {
                    JOptionPane.showMessageDialog(null, "Mahasiswa tidak mengambil mata kuliah ini!", "Error",0);
                    return;
                }
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "NIM tidak ditemukan dalam sistem!", "Error",1);
        }
    }
}
