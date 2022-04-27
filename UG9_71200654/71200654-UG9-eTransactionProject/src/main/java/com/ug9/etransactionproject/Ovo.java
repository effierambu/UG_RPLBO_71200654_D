package com.ug9.etransactionproject;

public class Ovo extends MobileWalet {
    private long ovoFeeTransferBank;

    public Ovo(String nama, long saldo, String noHp) {
        super(nama, saldo, noHp);
    }

    @Override
    public void transfer(DigitalPayment dp, long nominal) {
        super.transfer(dp, nominal);
    }
}
