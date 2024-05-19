
package com.appnilaisiswa;

import java.util.Scanner;

/**
 *
 * @author Luh Putu Dian Sariani (2201010254)
 * TGL : 2024-05-13
 */
public class App {
    private static final Scanner scanner = new Scanner(System.in);
    private static final DataNilai[] dataNilai = new DataNilai[100]; // Array untuk menyimpan data nilai
    private static int jumlahData = 0; // Menampung jumlah data yang telah diinputkan

    public static void main(String[] args) {
        int pilihan;

        do {
            tampilkanMenu();
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Konsumsi enter

            switch (pilihan) {
                case 1 -> tambahData();
                case 2 -> tampilkanData();
                case 3 -> ubahData();
                case 4 -> hapusData();
                case 0 -> System.out.println("Keluar dari aplikasi.");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }

    private static void tampilkanMenu() {
        System.out.println("\nMenu Aplikasi Nilai Siswa:");
        System.out.println("1. Tambah Data");
        System.out.println("2. Tampilkan Data");
        System.out.println("3. Ubah Data");
        System.out.println("4. Hapus Data");
        System.out.println("0. Keluar");
        System.out.print("Masukkan pilihan: ");
    }

    private static void tambahData() {
        if (jumlahData < dataNilai.length) {
            System.out.print("Masukkan nama siswa: ");
            String namaSiswa = scanner.nextLine();

            System.out.print("Masukkan nilai Matematika: ");
            int nilaiMatematika = scanner.nextInt();
            scanner.nextLine(); // Konsumsi enter

            System.out.print("Masukkan nilai IPA: ");
            int nilaiIPA = scanner.nextInt();
            scanner.nextLine(); // Konsumsi enter

            System.out.print("Masukkan nilai Bahasa Indonesia: ");
            int nilaiBahasaIndonesia = scanner.nextInt();
            scanner.nextLine(); // Konsumsi enter

            DataNilai newData = new DataNilai(namaSiswa, nilaiMatematika, nilaiIPA, nilaiBahasaIndonesia);
            dataNilai[jumlahData] = newData;
            jumlahData++;

            System.out.println("Data berhasil ditambahkan!");
        } else {
            System.out.println("Penyimpanan data penuh!");
        }
    }
    
    private static void tampilkanData() {
        if (jumlahData == 0) {
            System.out.println("Data belum ada!");
        } else {
            for (int i = 0; i < jumlahData; i++) {
                System.out.println("\nData ke-" + (i + 1));
                System.out.println(dataNilai[i]);
            }
        }
    }

    private static void ubahData() {
        if (jumlahData == 0) {
            System.out.println("Data belum ada!");
        } else {
            System.out.print("Masukkan nomor data yang ingin diubah: ");
            int index = scanner.nextInt();
            scanner.nextLine(); // Konsumsi enter

            if (index > 0 && index <= jumlahData) {
                System.out.print("Masukkan nama baru: ");
                String namaBaru = scanner.nextLine();

                System.out.print("Masukkan nilai Matematika baru: ");
                int nilaiMatematikaBaru = scanner.nextInt();
                scanner.nextLine(); // Konsumsi enter

                System.out.print("Masukkan nilai IPA baru: ");
                int nilaiIPABaru = scanner.nextInt();
                scanner.nextLine(); // Konsumsi enter

                System.out.print("Masukkan nilai Bahasa Indonesia baru: ");
                int nilaiBahasaIndonesiaBaru = scanner.nextInt();
                scanner.nextLine(); // Konsumsi enter

                dataNilai[index - 1] = new DataNilai(namaBaru, nilaiMatematikaBaru, nilaiIPABaru, nilaiBahasaIndonesiaBaru);
                System.out.println("Data berhasil diubah!");
            } else {
                System.out.println("Nomor data tidak valid!");
            }
        }
    }
    
    private static void hapusData() {
        if (jumlahData == 0) {
            System.out.println("Data belum ada!");
        } else {
            System.out.print("Masukkan nomor data yang ingin dihapus: ");
            int index = scanner.nextInt();
            scanner.nextLine(); // Konsumsi enter

            if (index > 0 && index <= jumlahData) {
                // Geser elemen array setelah data yang dihapus
                for (int i = index - 1; i < jumlahData - 1; i++) {
                    dataNilai[i] = dataNilai[i + 1];
                }

                jumlahData--;
                System.out.println("Data berhasil dihapus!");
            } else {
                System.out.println("Nomor data tidak valid!");
            }
        }
    }  
}
