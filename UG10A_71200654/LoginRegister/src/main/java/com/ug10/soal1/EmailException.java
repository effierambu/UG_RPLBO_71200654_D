package com.ug10.soal1;

public class EmailException extends User{
    private String emCode;
    private String errMessege;
    private EmailException (String emCode){
        super();
        this.emCode=emCode;
        if (emCode==null){
            this.errMessege="Password Tidak boleh kosong";

        }
        if (emCode==null){
            this.errMessege="Format email harus valid";
        }
    }

}
