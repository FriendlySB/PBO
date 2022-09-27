package Week3PBO.View;

import Week3PBO.Model.User;
import Week3PBO.Model.Mahasiswa.*;
import Week3PBO.Model.MataKuliah.*;
import Week3PBO.Model.Staff.*;
import Week3PBO.Model.Presensi.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MainMenu {
    
    public MainMenu(){
        menuScreen();
    }
    
    private void menuScreen(){
        ArrayList<User>listUser = new ArrayList<>();
        ArrayList<MataKuliah>listMatkul = new ArrayList<>();
        ArrayList<MatkulAmbil>listMatkulAmbil = new ArrayList<>();
        ArrayList<MatkulAjar>listMatkulAjar = new ArrayList<>();
        ArrayList<Presensi>listPresensi = new ArrayList<>();
        ArrayList<Presensi>listPresensi2 = new ArrayList<>();
        ArrayList<Presensi>listPresensi3 = new ArrayList<>();
        ArrayList<PresensiStaff>listPresensiStaff = new ArrayList<>();
        ArrayList<PresensiStaff>listPresensiStaff2 = new ArrayList<>();
        ArrayList<PresensiStaff>listPresensiStaff3 = new ArrayList<>();
        
        //Insert data mata kuliah
        listMatkul.add(new MataKuliah("IF-001","Algoritma",4));
        listMatkul.add(new MataKuliah("IF-002","Prak. Algoritma",1));
        listMatkul.add(new MataKuliah("IF-003","Web Design",2));
        listMatkul.add(new MataKuliah("IF-004","Kalkulus I",2));
        listMatkul.add(new MatkulPilihan(10,"IF-100","Game Dev",4));
        listMatkul.add(new MatkulPilihan(12,"IF-101","Gsme Design",3));
        listMatkul.add(new MatkulPilihan(10,"IF-102","Kapita Selekta",3));
        
        //Buat data dummy
        //Data user 1
        //Presensi
        listPresensi.add(new Presensi("2022-09-19",1));
        listPresensi.add(new Presensi("2022-09-20",1));
        listPresensi.add(new Presensi("2022-09-22",1));
        listPresensi2.add(new Presensi("2022-09-19",1));
        listPresensi2.add(new Presensi("2022-09-20",1));
        listPresensi2.add(new Presensi("2022-09-22",1));
        listPresensi3.add(new Presensi("2022-09-19",1));
        listPresensi3.add(new Presensi("2022-09-20",0));
        listPresensi3.add(new Presensi("2022-09-22",0));
        
        //MatkulAmbil
        listMatkulAmbil.add(new MatkulAmbil(listMatkul.get(0),new ArrayList<>(listPresensi),56,75,80));
        listMatkulAmbil.add(new MatkulAmbil(listMatkul.get(1),new ArrayList<>(listPresensi2),77,76,81));
        listMatkulAmbil.add(new MatkulAmbil(listMatkul.get(2),new ArrayList<>(listPresensi3),40,30,50));
        
        listUser.add(new MahasiswaSarjana(new ArrayList<>(listMatkulAmbil),"1121001","Informatika"
        ,"Jordan","Jalan A No.123","Jakarta","11-11-2002","081234567890"));
        listPresensi.clear();
        listPresensi2.clear();
        listPresensi3.clear();
        listMatkulAmbil.clear();
        
        //Data user 2
        //Presensi
        listPresensi.add(new Presensi("2022-09-19",0));
        listPresensi.add(new Presensi("2022-09-20",0));
        listPresensi.add(new Presensi("2022-09-22",1));
        listPresensi2.add(new Presensi("2022-09-19",1));
        listPresensi2.add(new Presensi("2022-09-20",0));
        listPresensi2.add(new Presensi("2022-09-22",1));
        listPresensi3.add(new Presensi("2022-09-19",1));
        listPresensi3.add(new Presensi("2022-09-20",1));
        listPresensi3.add(new Presensi("2022-09-22",1));
        
        //MatkulAmbil
        listMatkulAmbil.add(new MatkulAmbil(listMatkul.get(0),new ArrayList<>(listPresensi),60,75,80));
        listMatkulAmbil.add(new MatkulAmbil(listMatkul.get(1),new ArrayList<>(listPresensi2),90,75,91));
        listMatkulAmbil.add(new MatkulAmbil(listMatkul.get(2),new ArrayList<>(listPresensi3),70,80,90));
        
        listUser.add(new MahasiswaSarjana(new ArrayList<>(listMatkulAmbil),"1121002","Informatika"
        ,"Joanna","Jalan B No.123","Bandung","01-11-2003","08123456789"));
        listPresensi.clear();
        listPresensi2.clear();
        listPresensi3.clear();
        listMatkulAmbil.clear();
        
        //Data user 3
        //Presensi
        listPresensi.add(new Presensi("2022-09-19",1));
        listPresensi.add(new Presensi("2022-09-20",1));
        listPresensi.add(new Presensi("2022-09-22",1));
        listPresensi2.add(new Presensi("2022-09-19",1));
        listPresensi2.add(new Presensi("2022-09-20",1));
        listPresensi2.add(new Presensi("2022-09-22",1));
        listPresensi3.add(new Presensi("2022-09-19",1));
        listPresensi3.add(new Presensi("2022-09-20",1));
        listPresensi3.add(new Presensi("2022-09-22",1));
        
        //MatkulAmbil
        listMatkulAmbil.add(new MatkulAmbil(listMatkul.get(0),new ArrayList<>(listPresensi),60,90,90));
        listMatkulAmbil.add(new MatkulAmbil(listMatkul.get(1),new ArrayList<>(listPresensi2),77,76,81));
        listMatkulAmbil.add(new MatkulAmbil(listMatkul.get(2),new ArrayList<>(listPresensi3),33,27,30));
        
        listUser.add(new MahasiswaSarjana(new ArrayList<>(listMatkulAmbil),"1121003","Informatika"
        ,"Mikhail","Jalan C No.123","Pontianak","31-12-2003","08123456789"));
        listPresensi.clear();
        listPresensi2.clear();
        listPresensi3.clear();
        listMatkulAmbil.clear();
        
        //Data user 4
        //Presensi
        listPresensi.add(new Presensi("2022-09-19",1));
        listPresensi.add(new Presensi("2022-09-20",1));
        listPresensi.add(new Presensi("2022-09-22",1));
        listPresensi2.add(new Presensi("2022-09-19",1));
        listPresensi2.add(new Presensi("2022-09-20",1));
        listPresensi2.add(new Presensi("2022-09-22",1));
        listPresensi3.add(new Presensi("2022-09-19",1));
        listPresensi3.add(new Presensi("2022-09-20",1));
        listPresensi3.add(new Presensi("2022-09-22",1));
        
        //MatkulAmbil
        listMatkulAmbil.add(new MatkulAmbil(listMatkul.get(2),new ArrayList<>(listPresensi),70,70,70));
        listMatkulAmbil.add(new MatkulAmbil(listMatkul.get(3),new ArrayList<>(listPresensi2),97,76,81));
        listMatkulAmbil.add(new MatkulAmbil(listMatkul.get(4),new ArrayList<>(listPresensi3),80,60,70));
        
        listUser.add(new MahasiswaMagister("Tesis Lorem Ipsum",new ArrayList<>(listMatkulAmbil),"1116018","Informatika"
        ,"Oleg","Jalan D No.456","Chernihiv","11-11-1998","08123456789"));
        listPresensi.clear();
        listPresensi2.clear();
        listPresensi3.clear();
        listMatkulAmbil.clear();
        
        //Data user 5
        listUser.add(new MahasiswaDoktor("Penerapan IF dalam Peperangan",75,80,88,"1112015","Informatika"
        ,"Nicholas","Jalan X No.123","Medan","18-01-1990","08123456789"));
        
        //Data user 6
        //Presensi
        listPresensiStaff.add(new PresensiStaff(3,"2022-09-19",1));
        listPresensiStaff.add(new PresensiStaff(3,"2022-09-20",1));
        listPresensiStaff.add(new PresensiStaff(3,"2022-09-22",0));
        listPresensiStaff2.add(new PresensiStaff(2,"2022-09-19",1));
        listPresensiStaff2.add(new PresensiStaff(2,"2022-09-20",1));
        listPresensiStaff2.add(new PresensiStaff(2,"2022-09-22",0));
        listPresensiStaff3.add(new PresensiStaff(2,"2022-09-19",1));
        listPresensiStaff3.add(new PresensiStaff(2,"2022-09-20",1));
        listPresensiStaff3.add(new PresensiStaff(2,"2022-09-22",1));
        
        //MatkulAjar
        listMatkulAjar.add(new MatkulAjar(listMatkul.get(0),new ArrayList<>(listPresensiStaff)));
        listMatkulAjar.add(new MatkulAjar(listMatkul.get(1),new ArrayList<>(listPresensiStaff2)));
        listMatkulAjar.add(new MatkulAjar(listMatkul.get(2),new ArrayList<>(listPresensiStaff3)));
        
        listUser.add(new DosenTetap(1000000,"Informatika",new ArrayList<>(listMatkulAjar),"1100001",
                "Marlina","Jalan G No.123","Jakarta","11-11-1986","081234567890"));
        listPresensiStaff.clear();
        listPresensiStaff2.clear();
        listPresensiStaff3.clear();
        listMatkulAjar.clear();
        
        //Data user 7
        //Presensi
        listPresensiStaff.add(new PresensiStaff(3,"2022-09-19",1));
        listPresensiStaff.add(new PresensiStaff(3,"2022-09-20",1));
        listPresensiStaff.add(new PresensiStaff(3,"2022-09-22",1));
        listPresensiStaff2.add(new PresensiStaff(2,"2022-09-19",1));
        listPresensiStaff2.add(new PresensiStaff(2,"2022-09-20",1));
        listPresensiStaff2.add(new PresensiStaff(2,"2022-09-22",1));
        listPresensiStaff3.add(new PresensiStaff(2,"2022-09-19",1));
        listPresensiStaff3.add(new PresensiStaff(2,"2022-09-20",1));
        listPresensiStaff3.add(new PresensiStaff(2,"2022-09-22",1));
        
        //MatkulAjar
        listMatkulAjar.add(new MatkulAjar(listMatkul.get(1),new ArrayList<>(listPresensiStaff)));
        listMatkulAjar.add(new MatkulAjar(listMatkul.get(2),new ArrayList<>(listPresensiStaff2)));
        listMatkulAjar.add(new MatkulAjar(listMatkul.get(3),new ArrayList<>(listPresensiStaff3)));
        
        listUser.add(new DosenTetap(1500000,"Informatika",new ArrayList<>(listMatkulAjar),"1100002",
                "Tjahjanto","Jalan T No.123","Solo","30-05-1962","081234567890"));
        listPresensiStaff.clear();
        listPresensiStaff2.clear();
        listPresensiStaff3.clear();
        listMatkulAjar.clear();
        
        //Data user 8
        //Presensi
        listPresensiStaff.add(new PresensiStaff(3,"2022-09-19",1));
        listPresensiStaff.add(new PresensiStaff(3,"2022-09-20",0));
        listPresensiStaff.add(new PresensiStaff(3,"2022-09-22",0));
        listPresensiStaff2.add(new PresensiStaff(2,"2022-09-19",1));
        listPresensiStaff2.add(new PresensiStaff(2,"2022-09-20",0));
        listPresensiStaff2.add(new PresensiStaff(2,"2022-09-22",1));
        listPresensiStaff3.add(new PresensiStaff(2,"2022-09-19",1));
        listPresensiStaff3.add(new PresensiStaff(2,"2022-09-20",1));
        listPresensiStaff3.add(new PresensiStaff(2,"2022-09-22",0));
        
        //MatkulAjar
        listMatkulAjar.add(new MatkulAjar(listMatkul.get(4),new ArrayList<>(listPresensiStaff)));
        listMatkulAjar.add(new MatkulAjar(listMatkul.get(5),new ArrayList<>(listPresensiStaff2)));
        listMatkulAjar.add(new MatkulAjar(listMatkul.get(6),new ArrayList<>(listPresensiStaff3)));
        
        listUser.add(new DosenHonorer(200000,"Informatika",new ArrayList<>(listMatkulAjar),"1100003",
                "Herman","Jalan R No.123","Salatiga","29-02-1996","081234567890"));
        listPresensiStaff.clear();
        listPresensiStaff2.clear();
        listPresensiStaff3.clear();
        listMatkulAjar.clear();
        
        
        //Data user 9
        //Presensi
        listPresensiStaff.add(new PresensiStaff(3,"2022-09-01",1));
        listPresensiStaff.add(new PresensiStaff(3,"2022-09-02",1));
        listPresensiStaff.add(new PresensiStaff(3,"2022-09-05",1));
        listPresensiStaff.add(new PresensiStaff(2,"2022-09-06",1));
        listPresensiStaff.add(new PresensiStaff(2,"2022-09-07",1));
        listPresensiStaff.add(new PresensiStaff(2,"2022-09-08",1));
        listPresensiStaff.add(new PresensiStaff(2,"2022-09-09",1));
        listPresensiStaff.add(new PresensiStaff(2,"2022-09-12",1));
        listPresensiStaff.add(new PresensiStaff(2,"2022-09-13",1));
        listPresensiStaff.add(new PresensiStaff(2,"2022-09-14",1));
        listPresensiStaff.add(new PresensiStaff(2,"2022-09-15",1));
        listPresensiStaff.add(new PresensiStaff(3,"2022-09-16",1));
        listPresensiStaff.add(new PresensiStaff(3,"2022-09-19",1));
        listPresensiStaff.add(new PresensiStaff(3,"2022-09-20",1));
        listPresensiStaff.add(new PresensiStaff(2,"2022-09-21",1));
        listPresensiStaff.add(new PresensiStaff(2,"2022-09-22",1));
        listPresensiStaff.add(new PresensiStaff(2,"2022-09-23",1));
        listPresensiStaff.add(new PresensiStaff(2,"2022-09-26",1));
        listPresensiStaff.add(new PresensiStaff(2,"2022-09-27",1));
        listPresensiStaff.add(new PresensiStaff(2,"2022-09-28",1));
        listPresensiStaff.add(new PresensiStaff(2,"2022-09-29",1));
        listPresensiStaff.add(new PresensiStaff(2,"2022-09-30",1));
        
        listUser.add(new Karyawan(1500000,new ArrayList<>(listPresensiStaff),"1100004",
                "Adit","Jalan O No.123","Cimahi","29-02-1990","081234567890"));
        listPresensiStaff.clear();
        
        //Data user 10
        //Presensi
        listPresensiStaff.add(new PresensiStaff(3,"2022-09-01",1));
        listPresensiStaff.add(new PresensiStaff(3,"2022-09-02",1));
        listPresensiStaff.add(new PresensiStaff(3,"2022-09-05",1));
        listPresensiStaff.add(new PresensiStaff(2,"2022-09-06",1));
        listPresensiStaff.add(new PresensiStaff(2,"2022-09-07",1));
        listPresensiStaff.add(new PresensiStaff(2,"2022-09-08",1));
        listPresensiStaff.add(new PresensiStaff(2,"2022-09-09",1));
        listPresensiStaff.add(new PresensiStaff(2,"2022-09-12",1));
        listPresensiStaff.add(new PresensiStaff(2,"2022-09-13",1));
        listPresensiStaff.add(new PresensiStaff(2,"2022-09-14",0));
        listPresensiStaff.add(new PresensiStaff(2,"2022-09-15",1));
        listPresensiStaff.add(new PresensiStaff(3,"2022-09-16",0));
        listPresensiStaff.add(new PresensiStaff(3,"2022-09-19",1));
        listPresensiStaff.add(new PresensiStaff(3,"2022-09-20",0));
        listPresensiStaff.add(new PresensiStaff(2,"2022-09-21",1));
        listPresensiStaff.add(new PresensiStaff(2,"2022-09-22",1));
        listPresensiStaff.add(new PresensiStaff(2,"2022-09-23",0));
        listPresensiStaff.add(new PresensiStaff(2,"2022-09-26",1));
        listPresensiStaff.add(new PresensiStaff(2,"2022-09-27",1));
        listPresensiStaff.add(new PresensiStaff(2,"2022-09-28",0));
        listPresensiStaff.add(new PresensiStaff(2,"2022-09-29",0));
        listPresensiStaff.add(new PresensiStaff(2,"2022-09-30",0));
        
        listUser.add(new Karyawan(1500000,new ArrayList<>(listPresensiStaff),"1100005",
                "Burhan","Jalan O No.123","Cimahi","29-02-1990","081234567890"));
        listPresensiStaff.clear();
        
        //Staff temp = (Staff) listUser.get(7);
        //JOptionPane.showMessageDialog(null, temp.getNik(), "Error",1);
        
        int menu = 0;
        while(menu != 8){
            menu = Integer.parseInt
            (JOptionPane.showInputDialog(null, "1.Print UserData\n2.Print Nilai Akhir\n"
                    + "3.Print Rata-Rata Nilai Akhir\n4.Print Mahasiswa Tidak Lulus MK\n"
                    + "5.Print Matkul Ambil dan Presensi\n6.Print Jam Mengajar Dosen\n"
                    + "7.Print Gaji Staff\n8.Exit","Main Menu",1));
            switch(menu){
                case 1:
                    new PrintUserData(listUser);
                    break;
                case 2:
                    new PrintNilaiAkhir(listUser);
                    break;
                case 3:
                    new PrintRataRataNilaiAkhir(listUser);
                    break;
                case 4:
                    new PrintMahasiswaTidakLulus(listUser);
                    break;
                case 5:
                    new PrintMatkulAmbil(listUser);
                    break;
                case 6:
                    new PrintJamMengajarDosen(listUser);
                    break;
                case 7:
                    new PrintGajiStaff(listUser);
                    break;
                default:
                    break;
            }
        }
    }
}
