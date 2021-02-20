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
public class PersegiPanjang implements BangunDatar{
    private int luas;
    private final int panjang, lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
  
    @Override
    public void hitungLuas() {
        int luaspp = panjang*lebar;
    }
}
