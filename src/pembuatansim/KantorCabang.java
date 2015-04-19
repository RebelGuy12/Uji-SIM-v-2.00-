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
public class KantorCabang {
    private String namaKA;
    private int level;
    private String tingkat;
    private Alamat alamat;
    
    
    public String getNamaKA(){
        return namaKA;
    }
    
    public void setNamaKA(String namaKA){
        this.namaKA = namaKA;
    }
        
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
    public String getTingkat() {
        if(level == 1){
            this.tingkat = "Sektor";
        }
        if(level == 2){
            this.tingkat = "Resort";
        }
        if(level == 3){
            this.tingkat = "Daerah";
        }
        return tingkat;
    }

    public void setTingkat(String tingkat) {
        this.tingkat = tingkat;
    }
    
    public Alamat getAlamat() {
        return alamat;
    }

    public void setAlamat(Alamat alamat) {
        this.alamat = alamat;
    }
}
