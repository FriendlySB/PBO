package Week3PBO.View;

import Week3PBO.Controller.*;
import Week3PBO.Model.User;
import Week3PBO.Model.Staff.*;
import Week3PBO.Model.MataKuliah.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PrintJamMengajarDosen {
    ControllerCheckData controllerCheck = new ControllerCheckData();
    ControllerGetData controllerGet = new ControllerGetData();
    ControllerProcessData controllerProcess = new ControllerProcessData();

    public PrintJamMengajarDosen(ArrayList<User> listUser) {
        printJamMengajarDosen(listUser);
    }

    private String inputNIK(){
        String nik = JOptionPane.showInputDialog(null, "Masukkan NIK: ");
        return nik;
    }
    
    private void printJamMengajarDosen(ArrayList<User> listUser){
        String nik = inputNIK();
        boolean adaNIK = controllerCheck.checkNIK(listUser, nik);
        if(adaNIK){
            Staff staff = controllerGet.getStaffFromNIK(listUser, nik);
            if(staff instanceof Karyawan){
                JOptionPane.showMessageDialog(null, "NIK tersebut adalah milik karyawan", "Error",0);
                return;
            }
            Dosen dosen = (Dosen) staff;
            int jamMengajar = 0;
            ArrayList<MatkulAjar> matkulAjar = dosen.getListMatkulDiajar();
            String text = "NIK\t:" + dosen.getNik() + "\nNama\t: " + dosen.getNama() + "\n";
            for(int i = 0; i < matkulAjar.size();i++){
                jamMengajar += controllerProcess.hitungJamAjar(matkulAjar.get(i));
            }
            text += "Total jam mengajar dosen adalah " + jamMengajar + " jam";
            JOptionPane.showMessageDialog(null,text, "Jam Mengajar",1);
        } else {
            JOptionPane.showMessageDialog(null, "NIK tidak ditemukan dalam sistem!", "Error",0);
        }
    }
}
