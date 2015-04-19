/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pembuatansim;

import java.util.Date;

/**
 *
 * @author Asus A46c
 */
public class Pemohon {
    private String nama;
    private Alamat alamat;
    private String noKTP;
    private int tinggiBadan;
    private String tempatLahir;
    private Date tanggalLahir;
    private String pekerjaan;
    
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) throws Exception{
        for (char c : nama.toCharArray()) {
            if (Character.isDigit(c)) {
                throw new Exception("NAMA TIDAK BOLEH MENGANDUNG UNSUR LAIN SELAIN ALPHABET!");
            }
        }
        this.nama = nama;
    }
    
    public Alamat getAlamat() {
        return alamat;
    }

    public void setAlamat(Alamat alamat) {
        this.alamat = alamat;
    }
    
    public String getNoKTP() {
        return noKTP;
    }

    public void setNoKTP(String noKTP) {
        this.noKTP = noKTP;
    }
    
    public int getTinggiBadan() {
        return tinggiBadan;
    }

    public void setTinggiBadan(int tinggiBadan) {
        this.tinggiBadan = tinggiBadan;
    }
    
    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }   
    
    public Date getTanggalLahir(){
        return tanggalLahir;
    }
    
    public void setTanggalLahir(Date tanggalLahir){
        this.tanggalLahir = tanggalLahir;
    }
        
    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }
    
}
