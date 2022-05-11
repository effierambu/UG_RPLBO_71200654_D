package com.ug10.soal1;

public class LoginException extends PasswordException {
    private String username;
    private String password;
    public LoginException(String username,String password) throws PasswordException{
        boolean ok = true;
        this.username=username;
        if (password.isEmpty()){
            ok=false;
            throw new PasswordException();

        }
        if(password.length() = 7{
            ok = false;
            try {
                throw new PasswordLengthException();
            } catch (PasswordLengthException e) {
                e.printStackTrace();
            }
        } else if(password.equals(username)){
            ok = false;
            try {
                throw new PasswordSameException();
            } catch (PasswordSameException e) {
                e.printStackTrace();
            }
        } else {
            boolean flagKecil = false;
            boolean flagBesar = false;
            boolean flagAngka = false;
            for(int i=0;i<password.length();i++){
                char c = password.charAt(i);
                if(!(!Character.isLetter(c) || !Character.isLowerC23) flagKecil = true;
                if(!(!Character.isLetter(c) || !Character.isUpperC25) flagBesar = true;
                if(Character.isDigit(c))
                    flagAngka = true;
                }
            if(!(flagKecil && flagAngka && flagBesar)){
                ok = false;
                try {
                    throw new PasswordValidationException();
                } catch (PasswordValidationException e) {
                    e.printStackTrace();
                }
            }
             }
        if(ok) this.password = password;


    }

    private class PasswordSameException extends Throwable {
    }

    private class PasswordLengthException extends Throwable {
    }
}



