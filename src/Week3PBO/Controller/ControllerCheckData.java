package Week3PBO.Controller;

import Week3PBO.Model.Mahasiswa.Mahasiswa;
import Week3PBO.Model.Mahasiswa.MahasiswaSarjana;
import Week3PBO.Model.Staff.*;
import Week3PBO.Model.User;
import Week3PBO.Model.MataKuliah.*;
import java.util.ArrayList;

public class ControllerCheckData {
    public boolean checkNama(ArrayList<User> listUser, String nama){
        for(int i = 0; i < listUser.size();i++){
            if(listUser.get(i).getNama().equals(nama)){
                return true;
            }
        }
        return false;
    }
    
    public boolean checkNIM(ArrayList<User> listUser, String nim){
        for(int i = 0; i < listUser.size();i++){
            if(listUser.get(i) instanceof Mahasiswa){
                Mahasiswa mhs = (Mahasiswa) listUser.get(i);
                if(mhs.getNim().equals(nim)){
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean checkNIK(ArrayList<User> listUser, String nik){
        for(int i = 0; i < listUser.size();i++){
            if(listUser.get(i) instanceof Staff){
                Staff staff = (Staff) listUser.get(i);
                if(staff.getNik().equals(nik)){
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean checkKodeMK(MahasiswaSarjana mhs, String kodeMK){
        ArrayList<MatkulAmbil> matkulDiambil = mhs.getMatakuliahAmbil();
        for(int i = 0; i < matkulDiambil.size(); i++){
            if(matkulDiambil.get(i).getMatkulAmbil().getKode().equals(kodeMK)){
                return true;
            }
        }        
        return false;
    }
    
    
}
