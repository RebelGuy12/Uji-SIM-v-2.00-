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
public class Petugas {
    private String nama;
    private String pangkat;
    private String jabatan;
    private KantorCabang penempatan;
        
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
     
    public String getPangkat() {
        return pangkat;
    }

    public void setPangkat(String pangkat) {
        this.pangkat = pangkat;
    }
        
    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
        
    public KantorCabang getPenempatan() {
        return penempatan;
    }

    public void setPenempatan(KantorCabang penempatan) {
        this.penempatan = penempatan;
    }
}
