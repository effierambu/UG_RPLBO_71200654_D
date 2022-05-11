package com.ug10.soal1;

public class UsernameException extends User{
    private String emCode;
    private String errMessege;
    private UsernameException (String emCode){
        super();
        this.emCode=emCode;
        if (emCode==null){
            this.errMessege="Username Tidak boleh kosong";

        }

        }

}
