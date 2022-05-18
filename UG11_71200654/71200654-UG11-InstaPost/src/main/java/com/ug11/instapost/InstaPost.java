package com.ug11.instapost;

public class InstaPost{
    private  int totalMention;
    private String email;
    private String  username;

    //Username
    String user1 ="Susi";
    String user2 = "Albertus";




    public InstaPost(){


    }

    public void login(String albertusadrian) {
        String em1="Login berhasil";
        System.out.println(em1);

    }

    public void post(String s) {
        String s1= "Caption : Cuaca hari ini sangat baik.";
        String s2="Pengguna yang dimention:";
        String s3="Total username yang anda mention:";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

    public void printInfo() {
    }
}
