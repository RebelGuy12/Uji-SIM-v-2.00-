/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pembuatansim;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 *
 * @author Asus A46c
 */
public class PembuatanSIM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Alamat alamatPemohon = new Alamat();
        alamatPemohon.setJalan("Jalan Imam Bonjol no 02");
        alamatPemohon.setDesa("Ciborelang");
        alamatPemohon.setKecamatan("Jatiwangi");
        alamatPemohon.setKabupaten("Majalengka");
        alamatPemohon.setProvinsi("Jawa Barat");
        String alamatLengkap = (alamatPemohon.getJalan()+" "+alamatPemohon.getDesa()+" "+alamatPemohon.getKecamatan()+" "+alamatPemohon.getKabupaten()+" "+alamatPemohon.getProvinsi());
        
        Alamat alamatPolres = new Alamat();
        alamatPolres.setJalan("Jalan KH Abdul Halim");
        alamatPolres.setDesa("Munjul");
        alamatPolres.setKecamatan("Munjul");
        alamatPolres.setKabupaten("Majalengka");
        alamatPolres.setProvinsi("Jawa Barat");
        
        Pemohon pemohon1 = new Pemohon();
        try { 
            pemohon1.setNama("R124S Wulanggana");
        } catch (Exception e) {
            System.out.println("Terjadi error: "+e.getMessage());
        }
        
        try { 
            pemohon1.setNama("Rizas Wulanggana");
        } catch (Exception e) {
            System.out.println("Terjadi error: "+e.getMessage());
        }
        
        pemohon1.setNoKTP("3210111212950005");
        pemohon1.setPekerjaan("Mahasiswa");
        pemohon1.setTempatLahir("Majalengka");
        SimpleDateFormat sdfdate = new SimpleDateFormat("dd-MM-yyyy");
        Date ttl;
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 1995);
        cal.set(Calendar.MONTH, Calendar.DECEMBER);
        cal.set(Calendar.DATE, 12);
        ttl = cal.getTime();
        pemohon1.setTanggalLahir(ttl);
        pemohon1.setTinggiBadan(177);
        pemohon1.setAlamat(alamatPemohon);
        
        
        KantorCabang polresMajalengka = new KantorCabang();
        polresMajalengka.setNamaKA("AKBP Lena Suhayati");
        polresMajalengka.setAlamat(alamatPolres);
        polresMajalengka.setLevel(2);
        polresMajalengka.getTingkat();
        
        Petugas petugas1 = new Petugas();
        petugas1.setNama("Joe Satriani");
        petugas1.setPangkat("Brigadir Polisi");
        petugas1.setJabatan("Staff Lalulintas");
        petugas1.setPenempatan(polresMajalengka);
        
        /*Misalkan Rizas mengikuti uji SIM A, lalu nyenggol kerucut oranye 
        sebanyak dua kali, tapi tidak sampai mentok.
        */
        TesSIMA uji1 = new TesSIMA();
        uji1.setNama(pemohon1);
        uji1.setNyenggol(2);
        uji1.setSkor(100, uji1.getNyenggol());
        
        
        Date berlaku;
        Calendar cal1 = Calendar.getInstance();
        cal1.set(Calendar.MONTH, Calendar.DECEMBER);
        cal1.set(Calendar.DATE, 12);
        berlaku = cal1.getTime();
        cal1.add(Calendar.YEAR, 5);
        Date masaBerlaku = cal1.getTime();
        
        Date tanggal = new Date();
        System.out.println();
        System.out.println("//Revisi");
        System.out.println("==========SUMMARY===========");
        System.out.println("Telah dilaksanakan kegiatan uji SIM A pada :"+ sdfdate.format(tanggal) +" yang diikuti oleh:");
        System.out.println("Nama: "+pemohon1.getNama());
        System.out.println("Alamat: "+ alamatLengkap);
        System.out.println("Tempat dan Tanggal Lahir: "+ pemohon1.getTempatLahir()+","+sdfdate.format(pemohon1.getTanggalLahir()));
        System.out.println("Tinggi Badan: "+ pemohon1.getTinggiBadan());
        System.out.println("Pekerjaan: "+ pemohon1.getPekerjaan());
        System.out.println("No KTP: "+ pemohon1.getNoKTP());
        System.out.println("Nama Penguji: "+ petugas1.getPangkat() +" "+ petugas1.getNama());
        if(uji1.getSkor()<70){
            System.out.println("Dinyatakan TIDAK LULUS UJI SIM");
        }else{
            System.out.println("Dinyatakan LULUS UJI SIM");
        }
        System.out.println("Dengan No.SIM: 951213390005");
        System.out.println("Berlaku s.d: " + sdfdate.format(masaBerlaku));
        System.out.println();
        System.out.println("Mengetahui, Kapolres Majalengka.");
        System.out.println();
        System.out.println();
        System.out.println(polresMajalengka.getNamaKA());
        
        
        
        
        
        
    }
    
}
