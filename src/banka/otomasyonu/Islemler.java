
package banka.otomasyonu;

/**
 *
 * @author Ahmet
 */
public interface Islemler {
    public void kaydol(String isim, String soyisim, String TC, String telefonNo, String sifre, String mail);
    public String bakiyeOgren();
    public void paraCek(double miktar);
    public void paraYatır(double miktar);
    public void paraTransfer(double miktar,String IBAN2);
    public void faturaOde(double miktar);
    public void kartOluştur(Musteri yeniM,String kartIsim);
    public void krediBasvur(double miktar);
    public void krediOde(double miktar);
}
