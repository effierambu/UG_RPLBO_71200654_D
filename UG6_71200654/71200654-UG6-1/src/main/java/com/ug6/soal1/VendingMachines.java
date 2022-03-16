package com.ug6.soal1;

public class VendingMachines {
    private String Kodevendingmachine;
    private int Kapasitas;
    private String Information;
    private int Nominaluang;

    public VendingMachines(String kodevendingmachine, int kapasitas, String information, int nominaluang) {
        Kodevendingmachine = kodevendingmachine;
        Kapasitas = kapasitas;
        Information = information;
        Nominaluang = nominaluang;
    }

    public VendingMachines(String kodevendingmachine) {
        this("vdio",30,"ya(ya) atau tidak(n)",5000);
    }


    public String getKodevendingmachine() {
        return Kodevendingmachine;
    }

    public void setKodevendingmachine(String kodevendingmachine) {
        Kodevendingmachine = kodevendingmachine;
    }

    public int getKapasitas() {
        return Kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        Kapasitas = kapasitas;
    }

    public String getInformation() {
        return Information;
    }

    public void setInformation(String information) {
        Information = information;
    }

    public int getNominaluang() {
        return Nominaluang;
    }

    public void setNominaluang(int nominaluang) {
        Nominaluang = nominaluang;
    }
}
