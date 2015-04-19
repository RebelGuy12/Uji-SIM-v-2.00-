/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pembuatansim;

/**
 *
 * @author Asus A46c
 */
public class TesSIMC {
    private Pemohon nama;
    private int skor = 100;
    private int nyenggol;
    private boolean napak;
    
    public TesSIMC(){
    }
    
    public Pemohon getNama() {
        return nama;
    }

    public void setNama(Pemohon nama) {
        this.nama = nama;
    }
    
    public TesSIMC(int skor)throws Exception{
        skor = 100;
    }
    
    public TesSIMC(int skor, int nyenggol)throws Exception{
        skor = 100;
        this.setNyenggol(nyenggol);
    }
    
    public TesSIMC(int skor, int nyenggol, boolean napak)throws Exception{
        skor = 100;
        this.setNyenggol(nyenggol);
        this.setNapak(napak);
    }
    
    public int getNyenggol() {
        return nyenggol;
    }

    public void setNyenggol(int n) {
        this.nyenggol = n;
    }
    
    public boolean getNapak() {
        return napak;
    }

    public void setNapak(boolean napak) {
        this.napak = napak;
    }
}
    
