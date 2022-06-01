package com.ug13.rumahsakit;

public class Pasien extends Jadwal {
    private String nama;
    private int usia ;
    private String alamat;
    private String penyakit;
    private int levelpenyakit;
    private String status;

    public Pasien() {

    }

    public String getNama() {
        return nama;
    }

    public int getUsia() {
        return usia;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getPenyakit() {
        return penyakit;
    }

    public int getLevelpenyakit() {
        return levelpenyakit;
    }

    public String getStatus() {
        return status;
    }

    public Pasien(String test, int i, String di_mana_saja, Object Pasien) {
        super("Abiel");

        System.out.print("Masukan Nama Anda:");
    }
}

