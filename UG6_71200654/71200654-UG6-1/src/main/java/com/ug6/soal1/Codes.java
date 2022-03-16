package com.ug6.soal1;

public class Codes {
    private String GD;
    private String DR;
    private String FD;
    private String DG;

    public Codes(String GD, String DR, String FD, String DG) {
        this.GD = GD;
        this.DR = DR;
        this.FD = FD;
        this.DG = DG;
    }

    public Codes(String GD){
        this(GD,"Minuman","Makanan","Barang Digital");
    }


    public String getGD() {
        return GD;
    }

    public void setGD(String GD) {
        this.GD = GD;
    }

    public String getDR() {
        return DR;
    }

    public void setDR(String DR) {
        this.DR = DR;
    }

    public String getFD() {
        return FD;
    }

    public void setFD(String FD) {
        this.FD = FD;
    }

    public String getDG() {
        return DG;
    }

    public void setDG(String DG) {
        this.DG = DG;
    }
}
