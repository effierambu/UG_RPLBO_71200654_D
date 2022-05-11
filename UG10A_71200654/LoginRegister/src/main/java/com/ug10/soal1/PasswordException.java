package com.ug10.soal1;

public class PasswordException extends User {
    private int errCode;
    private String errMessage;
    public void PasswordException(int errCode, Object errorMessage) {
        this.errCode = errCode;
        if (errCode == 1) {
            this.errMessage = "Password tidak  boleh Kosong!";
        } else if (errCode == 2) {
            this.errMessage = "Password har2us terdiri dari 7 karakter!";
        } else if (errCode == 3) {
            this.errMessage = "Password minimal harus mengandung 1 karakter huruf kecil,huruf besar,simbol,dan angka";
        } else if (errCode == 4) {
            this.errMessage = "Password tidak boleh sama dengan username";
        } else if (errCode == 4) {
            this.errMessage = "Password harus sama dengan konfirmasi password";
        }
        }
    }




