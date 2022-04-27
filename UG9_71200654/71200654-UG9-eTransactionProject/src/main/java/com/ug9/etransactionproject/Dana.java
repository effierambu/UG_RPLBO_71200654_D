package com.ug9.etransactionproject;

public class Dana extends MobileWalet {
    public long danaFeeTransferBank;
    public Dana(String nama, long saldo, String noHp) {
        super(nama, saldo, noHp);
    }

    @Override
    public void transfer(DigitalPayment dp, long nominal) {
        super.transfer(dp, nominal);
    }
}
