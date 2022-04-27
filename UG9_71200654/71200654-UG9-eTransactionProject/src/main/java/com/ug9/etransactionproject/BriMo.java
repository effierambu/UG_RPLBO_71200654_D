package com.ug9.etransactionproject;

public class BriMo extends MobileBanking{

    public BriMo(String nama, long saldo, String noRekening) {
        super(nama, saldo, noRekening);

    }

    @Override
    public void transfer(DigitalPayment dp, long nominal) {
        super.transfer(dp, nominal);
    }
}
