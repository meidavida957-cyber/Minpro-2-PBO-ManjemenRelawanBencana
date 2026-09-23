package com.mycompany.minpro.pbo.manajemenrelawanbencana;

import com.mycompany.minpro.pbo.manajemenrelawanbencana.controller.ManajemenRelawan;
import com.mycompany.minpro.pbo.manajemenrelawanbencana.model.Relawan;
import com.mycompany.minpro.pbo.manajemenrelawanbencana.model.RelawanMedis;
import com.mycompany.minpro.pbo.manajemenrelawanbencana.model.RelawanLogistik;
import com.mycompany.minpro.pbo.manajemenrelawanbencana.model.Bencana;
import com.mycompany.minpro.pbo.manajemenrelawanbencana.view.Menu;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ManajemenRelawan manajemen = new ManajemenRelawan();
        Menu menu = new Menu();

        int pilihan;

        do {

            menu.tampilkanMenu();

            System.out.print("Pilih menu: ");

            try {
                pilihan = Integer.parseInt(input.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka.");
                pilihan = 0;
            }

            switch (pilihan) {

                case 1:
                    manajemen.tampilkanRelawan();
                    break;

                case 2:
                    manajemen.tampilkanBencana();
                    break;

                case 3:
                    
                    System.out.println("\n===== TAMBAH RELAWAN =====");

                    System.out.println("1. Relawan Umum");
                    System.out.println("2. Relawan Medis");
                    System.out.println("3. Relawan Logistik");

                    System.out.print("Pilih jenis relawan: ");
                    int jenisRelawan;

                    try {
                        jenisRelawan = Integer.parseInt(input.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Input harus berupa angka.");
                        break;
                    }

                    if (jenisRelawan < 1 || jenisRelawan > 3) {
                        System.out.println("Jenis relawan tidak tersedia.");
                        break;
                    }

                    System.out.println("Contoh ID: R002");
                    System.out.print("ID Relawan: ");
                    String id = input.nextLine();
                    
                    if (!id.matches("R\\d{3}")) {
                        System.out.println("Format ID tidak valid. Gunakan format R001.");
                        break;
                    }

                    System.out.print("Nama: ");
                    String nama = input.nextLine();

                    System.out.print("Alamat: ");
                    String alamat = input.nextLine();

                    System.out.print("No. HP: ");
                    String noHp = input.nextLine();
                    
                    if (nama.isEmpty()) {
                        System.out.println("Nama tidak boleh kosong.");
                        break;
                    }

                    if (alamat.isEmpty()) {
                        System.out.println("Alamat tidak boleh kosong.");
                        break;
                    }

                    if (!noHp.matches("\\d{10,13}")) {
                        System.out.println("No. HP harus berupa angka 10-13 digit.");
                        break;
                    }

                    System.out.print("Keahlian: ");
                    String keahlian = input.nextLine();

                    if (id.isEmpty() || nama.isEmpty()) {
                        System.out.println("ID dan nama tidak boleh kosong.");
                        break;
                    }

                    Relawan relawan;

                    if (jenisRelawan == 1) {

                        relawan = new Relawan(
                                id,
                                nama,
                                alamat,
                                noHp,
                                keahlian
                        );

                    } else if (jenisRelawan == 2) {

                        System.out.print("Spesialisasi: ");
                        String spesialisasi = input.nextLine();

                        relawan = new RelawanMedis(
                                id,
                                nama,
                                alamat,
                                noHp,
                                keahlian,
                                spesialisasi
                        );

                    } else {

                        System.out.print("Jenis Logistik: ");
                        String jenisLogistik = input.nextLine();

                        relawan = new RelawanLogistik(
                                id,
                                nama,
                                alamat,
                                noHp,
                                keahlian,
                                jenisLogistik
                        );
                    }

                    manajemen.tambahRelawan(relawan);

                    break;

                case 4:

                    System.out.println("\n===== TAMBAH BENCANA =====");

                    System.out.println("Contoh ID: B002");
                    System.out.print("ID Bencana: ");
                    String idBencana = input.nextLine();
                    
                    if (!idBencana.matches("B\\d{3}")) {
                        System.out.println("Format ID tidak valid. Gunakan format B001.");
                        break;
                    }

                    System.out.print("Nama Bencana: ");
                    String namaBencana = input.nextLine();

                    System.out.print("Lokasi: ");
                    String lokasi = input.nextLine();

                    System.out.print("Jenis Bencana: ");
                    String jenis = input.nextLine();

                    System.out.print("Status: ");
                    String status = input.nextLine();

                    if (idBencana.isEmpty() || namaBencana.isEmpty()) {
                        System.out.println("ID dan nama bencana tidak boleh kosong.");
                    } else {

                        Bencana bencana = new Bencana(
                                idBencana,
                                namaBencana,
                                lokasi,
                                jenis,
                                status
                        );

                        manajemen.tambahBencana(bencana);
                    }

                    break;

                case 5:

                    System.out.print("Masukkan ID relawan yang ingin dihapus: ");

                    String idHapusRelawan = input.nextLine();

                    manajemen.hapusRelawan(idHapusRelawan);

                    break;

                case 6:

                    System.out.print("Masukkan ID bencana yang ingin dihapus: ");

                    String idHapusBencana = input.nextLine();

                    manajemen.hapusBencana(idHapusBencana);

                    break;

                case 7:

                    System.out.println("\n===== TAMBAH PENEMPATAN =====");

                    System.out.println("Contoh ID Relawan: R001");
                    System.out.print("Masukkan ID Relawan: ");
                    String idRelawan = input.nextLine();

                    System.out.println("Contoh ID Bencana: B001");
                    System.out.print("Masukkan ID Bencana: ");
                    String idBencanaPenempatan = input.nextLine();

                    manajemen.tambahPenempatan(
                            idRelawan,
                            idBencanaPenempatan
                    );

                    break;
                
                case 8:

                    manajemen.tampilkanPenempatan();

                    break;
                    
                case 9:

                    System.out.println("\nProgram selesai.");
                    break;
                    
            }
            
                } while (pilihan != 9);
    
                input.close();
                
    }
}