package Week1PrakPBO;

import javax.swing.JOptionPane;

class Pasien {
    String nama;
    JenisKamar rawatinap[] = new JenisKamar[10];
    JenisPerawatan[] perawatan = new JenisPerawatan[5];
    boolean pakaiBPJS;
    public Pasien (String nama, Boolean bpjs){
        this.nama = nama;
        this.pakaiBPJS = bpjs;
    }
}

class JenisKamar {
    String kelas;
    int hargaPerHari;

    public JenisKamar(String kelas, int harga){
        this.kelas = kelas;
        this.hargaPerHari = harga;
    }
}

class JenisPerawatan {
    String nama;
    int biaya;

    public JenisPerawatan(String nama, int biaya){
        this.nama = nama;
        this.biaya = biaya;
    }
}

public class Modul1_1121018_FriendlySejatiBunardi {

    static Pasien patients[] = new Pasien[150];
    static int counterPatients = 0; //Melacak index pasien terakhir yang tercatat di array patients
    
    //Array ini menampung kamar yang tersedia di RS beserta biayanya
    static JenisKamar daftarKamar[] = {
        new JenisKamar("VIP",5000),
        new JenisKamar("I",3000),
        new JenisKamar("II",2000),
        new JenisKamar("III",1000)
    };
    //Array ini menampung perawatan yang tersedia di RS beserta biayanya
    static JenisPerawatan daftarPerawatan[] = {
        new JenisPerawatan("Operasi",20000),
        new JenisPerawatan("Intensive Care",15000),
        new JenisPerawatan("X-Ray",10000),
        new JenisPerawatan("USG",8000),
        new JenisPerawatan("Terapi Otot",5000)
    };

    static void inputPasien(String nama, boolean statusBPJS){
        patients[counterPatients] = new Pasien(nama,statusBPJS);
    }
    
    static void inputDataKamarPasien(int tipeKamar, int index){
        //Mengambil nama dan harga kamar dari daftarKamar
        String kamar = daftarKamar[tipeKamar].kelas;
        int harga = daftarKamar[tipeKamar].hargaPerHari;
        patients[counterPatients].rawatinap[index] = new JenisKamar(kamar,harga);
    }
    
    static void inputDataPerawatanPasien(int jenisPerawatan, int index){
        //Mengambil nama dan biaya perawatan dari daftarPerawatan
        String perawatan = daftarPerawatan[jenisPerawatan].nama;
        int harga = daftarPerawatan[jenisPerawatan].biaya;
        patients[counterPatients].perawatan[index] = new JenisPerawatan(perawatan,harga);
    }
    
    static void hitungBiayaPasien(int indexPasien){
        String pesan = "Total tagihan pasien\n";
        pesan += "Nama\t: " + patients[indexPasien].nama + "\n";
        if(patients[indexPasien].pakaiBPJS == true){
            pesan += "Status BPJS\t: Menggunakan BPJS\n";
        }
        else {
            pesan += "Status BPJS\t: Tidak menggunakan BPJS\n";
        }
        int biayaRawatInap = hitungBiayaRawatInap(indexPasien);
        int biayaPerawatan = hitungBiayaPerawatan(indexPasien);
        int total = biayaRawatInap + biayaPerawatan;
        pesan += "Biaya Rawat Inap\t: Rp." + biayaRawatInap + "\n";
        pesan += "Biaya Perawatan\t: Rp." + biayaPerawatan + "\n";
        pesan += "Biaya Total\t: Rp." + total + "\n";
        JOptionPane.showMessageDialog(null, pesan);
    }
    
    static int hitungBiayaRawatInap(int indexPasien){
        int total = 0;
        if(patients[indexPasien].pakaiBPJS == false){ //Jika pasien tidak menggunakan BPJS, maka biaya rawat inap tidak dihitung
            for(int i = 0; i < 10; i++){
                total += patients[indexPasien].rawatinap[i].hargaPerHari;
            }
        }
        return total;
    }
    static int hitungBiayaPerawatan(int indexPasien){
        int total = 0;
        for(int i = 0; i < 5; i++){
            total += patients[indexPasien].perawatan[i].biaya;
        }
        return total;
    }
    
    static void hitungPendapatanRS(){
        int pendapatan = 0;
        for(int i = 0; i < counterPatients; i++){
            pendapatan += hitungBiayaRawatInap(i) + hitungBiayaPerawatan(i);
        }
        JOptionPane.showMessageDialog(null, "Total pendapatan RS saat ini adalah Rp." + pendapatan);
    }
    
    static void hitungJumlahPasienPadaPerawatan(int jenisPerawatan){
        String namaPerawatan = daftarPerawatan[jenisPerawatan].nama;
        int jumlah = 0;
        for(int i = 0; i < counterPatients; i++){
            for(int j = 0; j < 5; j++){
                if (patients[i].perawatan[j].nama.equals(namaPerawatan)) {
                    jumlah++;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Jumlah pasien yang menerima perawatan "+ namaPerawatan + " adalah " + jumlah);
    }
    public static void main(String args[]) {
        int menu = 0;
        while(menu != 5){
            menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Pilih menu:\n1. Input pasien"
                    + "\n2. Hitung biaya perawatan pasien\n3. Hitung pendapatan RS\n4. Hitung jumlah pasien pada perawatan\n5. Exit"));
            switch(menu){
                case 1:
                    //Input nama dan status BPJS pasien
                    String nama = JOptionPane.showInputDialog(null, "Input nama pasien");
                    Boolean bpjs = false;
                    int status = JOptionPane.showConfirmDialog(null, "Apakah pasien menggunakan BPJS?");
                    if (status == JOptionPane.YES_OPTION) {
                        bpjs = true;
                    }
                    inputPasien(nama, bpjs);
                    //Input tipe kamar untuk tiap hari
                    for(int i = 0; i < 10; i++){
                        int tipeKamar = Integer.parseInt(JOptionPane.showInputDialog(null, "Input tipe kamar pasien pada hari "
                                + "ke-" + (i + 1) + " :\n1.Kelas VIP\n2.Kelas I\n3.Kelas II\n4.Kelas III"));
                        inputDataKamarPasien(tipeKamar - 1, i);
                    }
                    
                    //Input perawatan yang diterima pasien
                    boolean exitPerawatan = false;
                    int jumlahPerawatan = 0;
                    while (exitPerawatan == false && jumlahPerawatan != 6){
                        int jenisPerawatan = Integer.parseInt(JOptionPane.showInputDialog(null, "Input jenis perawatan pasien :\n"
                                + "1.Operasi\n2.Intensive Care\n3.X-Ray\n4.USG\n5.Terapi Otot\n6. Exit"));
                        if(jenisPerawatan == 6){
                            exitPerawatan = true;
                            //Inisialisasi objek dengan data dummy agar tidak nullpointer
                            for(int i = jumlahPerawatan; i < 5; i++){
                                patients[counterPatients].perawatan[i] = new JenisPerawatan("",0);
                            }
                        }
                        else {
                            inputDataPerawatanPasien(jenisPerawatan - 1, jumlahPerawatan);
                            jumlahPerawatan++;
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Data pasien " + nama + " telah berhasil diinput ke sistem");
                    counterPatients++;
                    break;
                case 2:
                    if(counterPatients == 0){
                        JOptionPane.showMessageDialog(null, "Belum ada pasien yang terdaftar di RS!");
                        break;
                    }
                    String listPasien = "Pilih pasien yang akan di cek biaya totalnya\n";
                    for(int i = 0; i < counterPatients; i++){
                        listPasien += (i + 1) + ". " + patients[i].nama + "\n";
                    }
                    int nomorPasien = Integer.parseInt(JOptionPane.showInputDialog(null, listPasien));
                    hitungBiayaPasien(nomorPasien - 1);
                    break;
                case 3:
                    hitungPendapatanRS();
                    break;
                case 4:
                    int jenisPerawatan = Integer.parseInt(JOptionPane.showInputDialog(null, "Input perawatan yang akan dihitung :\n"
                                + "1.Operasi\n2.Intensive Care\n3.X-Ray\n4.USG\n5.Terapi Otot"));
                    hitungJumlahPasienPadaPerawatan(jenisPerawatan - 1);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Terima Kasih");
                    break;
            }
        }
    }
}
