/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getset;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author pudakdigital
 */
public class Person {
    
    private String nama;
    private String alamat;
    private Date tglLahir;
    private double  usia;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Date getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(Date tglLahir) {
        this.tglLahir = tglLahir;
    }
    
    public int hitungUsiaHari(Date lahir){
        Calendar calendar = Calendar.getInstance();       
        
        Date skr = calendar.getTime();
        long diff = skr.getTime() - lahir.getTime();
        int usia = (int) (diff / (24 * 60 * 60 * 1000));
        return usia;
    }
    
}
