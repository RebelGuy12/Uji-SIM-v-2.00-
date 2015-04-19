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
public class TesSIMA {
    private Pemohon nama;
    private int skor;
    private int nyenggol;
    private boolean mentok;
    
    public TesSIMA(){
    }
    
    public Pemohon getNama() {
        return nama;
    }

    public void setNama(Pemohon nama) {
        this.nama = nama;
    }
    
    public TesSIMA(int skor)throws Exception{
        skor = 100;
    }
    
    public TesSIMA(int skor, int nyenggol)throws Exception{
        skor = 100;
        this.setNyenggol(nyenggol);
    }
    
    public TesSIMA(int skor, int nyenggol, boolean mentok)throws Exception{
        skor = 100;
        this.setNyenggol(nyenggol);
        this.setMentok(mentok);
    }
    
    public int getNyenggol() {
        return nyenggol;
    }

    public void setNyenggol(int n) {
        this.nyenggol = n;
    }
    
    public boolean getMentok() {
        return mentok;
    }

    public void setMentok(boolean mentok) {
        this.mentok = mentok;
    }
    
    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor, int nyenggol) {
        this.skor = skor-nyenggol*10;
    }
}
