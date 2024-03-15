/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banka.otomasyonu;

/**
 *
 * @author Ahmet
 */
abstract public class Kullanici extends Insan {

    String IBAN, para;

    public Kullanici(String isim, String soyisim, String TC, String telefonNo, String sifre, String mail) {
        super(isim, soyisim, TC, telefonNo, sifre, mail);
        this.para = "0.0";
        this.IBAN = "TR3" + TC.charAt(10) + " " + TC.charAt(0) + TC.charAt(1) + "00 00" + TC.charAt(2) + TC.charAt(3) + " " + TC.charAt(4) + TC.charAt(5) + "00 00" + TC.charAt(6) + TC.charAt(7) + " " + TC.charAt(8) + TC.charAt(9);
    }
}
