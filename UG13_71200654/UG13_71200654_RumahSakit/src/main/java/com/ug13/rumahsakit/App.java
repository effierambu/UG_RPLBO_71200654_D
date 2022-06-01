package com.ug13.rumahsakit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        System.out.println("===========================================PROSES INISIALISASI============================================");
        System.out.println();
        Pasien pasien = null;
        Jadwal jadwal = new Jadwal(pasien);
        Pasien illegal = new Pasien("test", 21, "di mana saja", pasien);
        Pelayanan pelayanan = new Pelayanan("Andi");
        Suster suster = new Suster("Siti");
        Dokter dokter = new Dokter("Budi", "Organ Dalam", "A123");
        pasien = pelayanan.registrasi();
        pelayanan.mengaturJadwal(pasien, dokter, jadwal);
        System.out.println("===========================================PROSES UJI COBA PASIEN DAN JADWAL ILLEGAL============================================");
        System.out.println();
        suster.screening(illegal, jadwal);
        dokter.memeriksa(illegal, jadwal);
        System.out.println("===========================================PROSES UJI COBA PASIEN DAN JADWAL ILLEGAL BERHASIL============================================");
        System.out.println();
        System.out.println("===========================================PROSES SCREENING SUSTER============================================");
        System.out.println();
        suster.screening(pasien, jadwal);
        System.out.println("===========================================PROSES SCREENING SUTER BERHASIL============================================");
        System.out.println();
        System.out.println("===========================================PROSES PEMERIKSAAN DOKTER============================================");
        System.out.println();
        int x = (int) pasien.getLevelPenyakit();
        for (int i = 0; i <= x; i++) {
            dokter.memeriksa(pasien, jadwal);
            dokter.cekStatus(pasien);
        }
        System.out.println("===========================================PROSES PEMERIKSAAN DOKTER BERHASIL============================================");
        System.out.println();

        System.out.println(jadwal.getPasien().getStatus());
        System.out.println(jadwal.getPasien().getPixels());
    }
}


