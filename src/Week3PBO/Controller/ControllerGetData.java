package Week3PBO.Controller;

import Week3PBO.Model.Mahasiswa.Mahasiswa;
import Week3PBO.Model.Mahasiswa.MahasiswaSarjana;
import Week3PBO.Model.Staff.*;
import Week3PBO.Model.MataKuliah.*;
import Week3PBO.Model.User;
import Week3PBO.Model.Presensi.*;
import java.util.ArrayList;

public class ControllerGetData implements PresensiInterface{
    public User getUserFromNama(ArrayList<User> listUser, String nama){
        User temp;
        for(int i = 0; i < listUser.size();i++){
            if(listUser.get(i).getNama().equals(nama)){
                return listUser.get(i);
            }
        }
        return null;
    }
    
    public Mahasiswa getMhsFromNIM(ArrayList<User> listUser, String nim){
        for(int i = 0; i < listUser.size();i++){
            if(listUser.get(i) instanceof Mahasiswa){
                Mahasiswa mhs = (Mahasiswa) listUser.get(i);
                if(mhs.getNim().equals(nim)){
                    return mhs;
                }
            }
        }
        return null;
    }
    
    public Staff getStaffFromNIK(ArrayList<User> listUser, String nik){
        for(int i = 0; i < listUser.size();i++){
            if(listUser.get(i) instanceof Staff){
                Staff staff = (Staff) listUser.get(i);
                if(staff.getNik().equals(nik)){
                    return staff;
                }
            }
        }
        return null;
    }
    
    public int[] getNilaiFromMatkulAmbil(MahasiswaSarjana mhs, String kodeMK){
        ArrayList<MatkulAmbil> matkulDiambil = mhs.getMatakuliahAmbil();
        for(int i = 0; i < matkulDiambil.size(); i++){
            if(matkulDiambil.get(i).getMatkulAmbil().getKode().equals(kodeMK)){
                MatkulAmbil temp = matkulDiambil.get(i);
                int arrNilai[] = {temp.getN1(),temp.getN2(),temp.getN3()};
                return arrNilai;
            }
        }        
        return null;
    }
    
    public String getNamaMatkulFromKodeMK(MahasiswaSarjana mhs, String kodeMK){
        ArrayList<MatkulAmbil> matkulDiambil = mhs.getMatakuliahAmbil();
        for(int i = 0; i < matkulDiambil.size(); i++){
            if(matkulDiambil.get(i).getMatkulAmbil().getKode().equals(kodeMK)){
                MatkulAmbil temp = matkulDiambil.get(i);
                return temp.getMatkulAmbil().getNama();
            }
        }        
        return null;
    }
    
    public ArrayList<MatkulAmbil> getMatkulAmbilFromMhsSarjana(MahasiswaSarjana mhsSarjana){
        ArrayList<MatkulAmbil> matkulAmbil = mhsSarjana.getMatakuliahAmbil();
        return matkulAmbil;
    }
    
    public String getPresensiFromMatkulAmbil(MatkulAmbil matkulAmbil){
        ArrayList<Presensi> presensi = matkulAmbil.getPresensi();
        String text = "";
        for(int i = 0; i < presensi.size();i++){
            String status = "Alpha";
            if(presensi.get(i).getStatus() == Hadir){
                status = "Hadir";
            }
            text += "Tanggal " + presensi.get(i).getTanggal() + " " + status + "\n";
        }
        return text;
    }
    
    public String getPresensiFromMatkulAjar(){
        String text = "";
        return text;
    }
}