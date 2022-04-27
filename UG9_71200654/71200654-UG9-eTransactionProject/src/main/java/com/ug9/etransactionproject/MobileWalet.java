package com.ug9.etransactionproject;

public class MobileWalet extends DigitalPayment{
    private  String noHp;
    private long feeTransferBank;

    public String getNoHp() {
        return noHp;
    }

    public void setFeeTransferBank(long feeTransferBank) {
        this.feeTransferBank = feeTransferBank;
    }

    public MobileWalet(String nama, long saldo,String noHp) {
        super(nama, saldo);
        this.noHp=noHp;
    }

    @Override
    public void transfer(DigitalPayment dp, long nominal) {
        long ssaldo=this.getSaldo();

    }
}
