package com.ug13.rumahsakit;

import java.awt.image.PixelGrabber;

public class Jadwal {
    private Pasien pasien;
    private Dokter dokter;
    private Suster suster;
    private Pelayanan pelayanan;
    private Boolean statusDaftar;
    private Boolean StatusScreening;

    public Dokter getDokter() {
        return dokter;
    }

    public Suster getSuster() {
        return suster;
    }

    public Pelayanan getPelayanan() {
        return pelayanan;
    }

    public Boolean getStatusDaftar() {
        return statusDaftar;
    }

    public Boolean getStatusScreening() {
        return StatusScreening;
    }

    public Jadwal(Pasien pasien) {
    }

    public Jadwal() {

    }

    public Jadwal(String abiel) {

    }

    public int getLevelPenyakit() {

        return getLevelPenyakit();
    }

    public PixelGrabber getPasien() {
        return getPasien();
    }
}
