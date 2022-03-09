package com.ug5a.soal1;

import sun.rmi.server.UnicastServerRef;

public class TransPay
{
    private String nama;
    private long saldo;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    public void topUp(long saldo){
        this.saldo += saldo;
    }
}


