package com.ug6.soal1;

public class Goods {
    private String Informasibarang;
    private String Kodebarang;
    private String Namabarang;
    private int Jumlahbarang;

    public Goods(String informasibarang, String kodebarang, String namabarang, int jumlahbarang) {
        Informasibarang = informasibarang;
        Kodebarang = kodebarang;
        Namabarang = namabarang;
        Jumlahbarang = jumlahbarang;
    }

    public String getInformasibarang() {
        return Informasibarang;
    }

    public void setInformasibarang(String informasibarang) {
        Informasibarang = informasibarang;
    }

    public String getKodebarang() {
        return Kodebarang;
    }

    public void setKodebarang(String kodebarang) {
        Kodebarang = kodebarang;
    }

    public String getNamabarang() {
        return Namabarang;
    }

    public void setNamabarang(String namabarang) {
        Namabarang = namabarang;
    }

    public int getJumlahbarang() {
        return Jumlahbarang;
    }

    public void setJumlahbarang(int jumlahbarang) {
        Jumlahbarang = jumlahbarang;
    }
}
