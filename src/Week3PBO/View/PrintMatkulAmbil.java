package Week3PBO.View;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import Week3PBO.Model.User;
import Week3PBO.Model.Mahasiswa.*;
import Week3PBO.Model.MataKuliah.*;
import Week3PBO.Controller.*;


public class PrintMatkulAmbil {
    
    ControllerCheckData controllerCheck = new ControllerCheckData();
    ControllerGetData controllerGet = new ControllerGetData();
    ControllerProcessData controllerProcess = new ControllerProcessData();

    public PrintMatkulAmbil(ArrayList<User> listUser) {
        printMatkulAmbil(listUser);
    }
    
    private String inputNIM(){
        String nim = JOptionPane.showInputDialog(null, "Masukkan NIM: ");
        return nim;
    }
    
    private void printMatkulAmbil(ArrayList<User> listUser){
        String nim = inputNIM();
        boolean adaNIM = controllerCheck.checkNIM(listUser, nim);
        if(adaNIM){
            Mahasiswa mhs = controllerGet.getMhsFromNIM(listUser, nim);
            if(mhs instanceof MahasiswaDoktor){
                JOptionPane.showMessageDialog(null, "Mahasiswa ini adalah mahasiswa "
                        + "doktor dan tidak mempunyai mata kuliah yang diambil", "Error",0);
                return;
            } 
            MahasiswaSarjana mhsSarjana = (MahasiswaSarjana) mhs;
            ArrayList<MatkulAmbil> matkulAmbil = mhsSarjana.getMatakuliahAmbil();
            for(int i = 0; i < matkulAmbil.size(); i++){
                String text = "NIM\t: " + mhsSarjana.getNim() + "\nNama\t: " + mhsSarjana.getNama() + "\n";
                text += "Mata Kuliah " + matkulAmbil.get(i).getMatkulAmbil().getNama() 
                        + "\nPresensi\n" + controllerGet.getPresensiFromMatkulAmbil(matkulAmbil.get(i));
                JOptionPane.showMessageDialog(null, text, matkulAmbil.get(i).getMatkulAmbil().getNama(),1);
            }
        } else {
            JOptionPane.showMessageDialog(null, "NIM tidak ditemukan dalam sistem!", "Error",0);
        }
    }
    
}
