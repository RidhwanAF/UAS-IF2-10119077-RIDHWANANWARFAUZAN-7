/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.if2.pkg10119077.ridhwananwarfauzan.pkg7;

/**
 *
 * @author RAF
 */
public class Persegi implements BangunDatar{
    private int luas;
    private final int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    @Override
    public void hitungLuas() {
        int luasp = sisi*sisi;
    }
}
