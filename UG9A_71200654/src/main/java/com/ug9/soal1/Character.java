package com.ug9.soal1;

public abstract class Character {
    public abstract void Character ();
    protected int damage;
    protected String name;
    protected int health;

    public static  void showCharacterInfo(){
        System.out.println("");
    }

    public static boolean isDie() {
        return false;
    }

    {

    }
    public abstract void attacked();



}
