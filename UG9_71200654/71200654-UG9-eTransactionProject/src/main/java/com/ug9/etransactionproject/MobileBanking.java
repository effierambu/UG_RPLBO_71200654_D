package com.ug9.etransactionproject;

public class MobileBanking extends DigitalPayment {
    private boolean checkFee;
    private long feeAntarBank;
    private String noRekening;

    public MobileBanking(String nama, long saldo,String noRekening) {
        super(nama, saldo);
    }

    @Override
    public void transfer(DigitalPayment dp, long nominal) {


    }


    public String getNoRekening() {
        return noRekening;
    }

    public boolean isCheckFee() {
        return checkFee;
    }

    public void setCheckFee(boolean checkFee) {
        this.checkFee = checkFee;
    }

}
