
package banka.otomasyonu;

/**
 *
 * @author Ahmet
 */
public interface PersonelIslemler{
    public void krediOnay(String musteriTC,String neden,String faiz,String miktar);
    public void kartOnay(String musteriNo,String KartNo);
}
