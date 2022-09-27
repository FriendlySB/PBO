package Week3PBO.View;

import Week3PBO.Controller.*;
import Week3PBO.Model.User;
import Week3PBO.Model.Staff.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PrintGajiStaff {
    ControllerCheckData controllerCheck = new ControllerCheckData();
    ControllerGetData controllerGet = new ControllerGetData();
    ControllerProcessData controllerProcess = new ControllerProcessData();

    public PrintGajiStaff(ArrayList<User> listUser) {
        printGaji(listUser);
    }
    
    private String inputNIK(){
        String nik = JOptionPane.showInputDialog(null, "Masukkan NIK: ");
        return nik;
    }
    
    private void printGaji(ArrayList<User> listUser){
        String nik = inputNIK();
        boolean adaNIK = controllerCheck.checkNIK(listUser, nik);
        if(adaNIK){
            Staff staff = controllerGet.getStaffFromNIK(listUser, nik);
            String text = "NIK\t: " + staff.getNik() + "\nNama\t: " + staff.getNama() 
                    + "\nGaji staff adalah Rp. " + controllerProcess.hitungGaji(staff);
            JOptionPane.showMessageDialog(null, text, "Laporan Gaji",1);
        } else {
            JOptionPane.showMessageDialog(null, "NIK tidak ditemukan dalam sistem!", "Error",0);
        }
    }
    
}
