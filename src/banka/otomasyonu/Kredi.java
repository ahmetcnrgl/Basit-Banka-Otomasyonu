/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banka.otomasyonu;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDate;


/**
 *
 * @author Ahmet
 */
public class Kredi {
    String KrediSahibiTC,Neden,SOT,miktar,faiz,odencek,onay;
    public Kredi(String KrediSahibiTC,String Neden,String miktar,String faiz) {
        LocalDate date = LocalDate.now();
        String tarih[] = new String[3];
        tarih = date.toString().split("-");
        int Intarih = Integer.parseInt(tarih[0]);
        tarih[0] =String.valueOf(Intarih+3);
        this.KrediSahibiTC = KrediSahibiTC;
        this.Neden = Neden;
        this.SOT = tarih[0]+"-"+tarih[1]+"-"+tarih[2];
        this.miktar = miktar;
        this.faiz = faiz;
        this.odencek = String.valueOf(Double.valueOf(miktar) + (Double.valueOf(miktar)*Double.valueOf(faiz)/100));
        this.onay = "-";
        try {
            File file = new File("KrediBilgi.txt");
            FileWriter yazıcı = new FileWriter(file, true);
            BufferedWriter bWriter = new BufferedWriter(yazıcı);
            String satır = this.KrediSahibiTC + "/" + this.miktar + "/" + this.Neden + "/" + this.SOT+"/"+this.faiz+"/"+this.odencek+"/"+this.onay;
            bWriter.write(satır + "\n");
            bWriter.close();
        } catch (Exception e) {
            
        }
    }
}
