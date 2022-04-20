package com.ug9.soal1;

public abstract class MagicCharacter {
    public abstract void MagicCharacter();
    protected int mana;

    public static void attacked() {

    }

    public abstract void showCharacterInfo();

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}
