package Week3PBO.View;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import Week3PBO.Model.User;
import Week3PBO.Model.Mahasiswa.*;
import Week3PBO.Model.Staff.*;
import Week3PBO.Controller.*;

public class PrintUserData {
    
    ControllerCheckData controllerCheck = new ControllerCheckData();
    ControllerGetData controllerGet = new ControllerGetData();
    
    public PrintUserData(ArrayList<User> listUser) {
        printData(listUser);
    }
    
    private String inputNama(){
        String username = JOptionPane.showInputDialog(null, "Masukkan nama: ");
        return username;
    }
    
    private void printData(ArrayList<User> listUser){
        String nama = inputNama();
        boolean adaNama = controllerCheck.checkNama(listUser, nama);
        if(adaNama == true){
            User temp = controllerGet.getUserFromNama(listUser, nama);
            String text = "Nama\t: " + temp.getNama() + "\n";
            if(temp instanceof Mahasiswa){
                Mahasiswa mhs = (Mahasiswa) temp;
                text += "Status\t: Mahasiswa\n";
                text += "NIM\t: " + mhs.getNim() + "\n";
                text += "Jurusan\t: " + mhs.getJurusan() + "\n";
            } else if(temp instanceof Karyawan){
                Karyawan staff = (Karyawan) temp;
                text += "Status\t: Karyawan\n";
                text +="NIK\t: " + staff.getNik() + "\n";
            } else {
                Dosen dosen = (Dosen) temp;
                if(dosen instanceof DosenTetap){
                    text += "Status\t: Dosen Tetap\n";
                } else {
                    text += "Status\t: Dosen Honorer\n";
                }
                text += "NIK\t: " + dosen.getNik() + "\n";
                text += "Departemen: " + dosen.getDepartemen() + "\n";
            }
            text += "Alamat\t: " + temp.getAlamat() + "\n";
            text += "Tempat Lahir : " + temp.getTempatLahir() + "\n";
            text += "Tanggal Lahir : " + temp.getTanggalLahir() + "\n";
            text += "Telepon\t: " + temp.getTelepon() + "\n";
            JOptionPane.showMessageDialog(null, text, "Data User",1);

        }
        else {
            JOptionPane.showMessageDialog(null, "Nama tidak ditemukan dalam sistem!", "Error",1);
        }
    }
}
