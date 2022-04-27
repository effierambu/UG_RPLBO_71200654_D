package com.ug9.etransactionproject;

public class BniMo extends MobileBanking{

    public BniMo(String nama, long saldo, String noRekening) {
        super(nama, saldo, noRekening);
    }

    @Override
    public void transfer(DigitalPayment dp, long nominal) {
        super.transfer(dp, nominal);
    }
}
