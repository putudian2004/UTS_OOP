
package com.appnilaisiswa;

/**
 *
 * @author Luh Putu Dian Sariani (2201010254)
 * TGL : 2024-05-13
 */
public class DataNilai {
    private String namaSiswa;
    private int nilaiMatematika;
    private int nilaiIPA;
    private int nilaiBahasaIndonesia;

    // Constructor
    public DataNilai(String namaSiswa, int nilaiMatematika, int nilaiIPA, int nilaiBahasaIndonesia) {
        this.namaSiswa = namaSiswa;
        this.nilaiMatematika = nilaiMatematika;
        this.nilaiIPA = nilaiIPA;
        this.nilaiBahasaIndonesia = nilaiBahasaIndonesia;
    }

    // Getter dan Setter
    public String getNamaSiswa() {
        return namaSiswa;
    }

    public void setNamaSiswa(String namaSiswa) {
        this.namaSiswa = namaSiswa;
    }

    public int getNilaiMatematika() {
        return nilaiMatematika;
    }

    public void setNilaiMatematika(int nilaiMatematika) {
        this.nilaiMatematika = nilaiMatematika;
    }

    public int getNilaiIPA() {
        return nilaiIPA;
    }

    public void setNilaiIPA(int nilaiIPA) {
        this.nilaiIPA = nilaiIPA;
    }

    public int getNilaiBahasaIndonesia() {
        return nilaiBahasaIndonesia;
    }

    public void setNilaiBahasaIndonesia(int nilaiBahasaIndonesia) {
        this.nilaiBahasaIndonesia = nilaiBahasaIndonesia;
    }

    // Hitung Rata-rata
    public double hitungRataRata() {
        return (nilaiMatematika + nilaiIPA + nilaiBahasaIndonesia) / 3.0;
    }

    // Tampilkan Data
    public String toString() {
        return "Nama Siswa: " + namaSiswa + "\n" +
                "Nilai Matematika: " + nilaiMatematika + "\n" +
                "Nilai IPA: " + nilaiIPA + "\n" +
                "Nilai Bahasa Indonesia: " + nilaiBahasaIndonesia + "\n" +
                "Rata-rata: " + hitungRataRata();
    }
}
