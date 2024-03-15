
package banka.otomasyonu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Ahmet
 */
public class Yonetici extends Kullanici implements YoneticiIslemler {

    public Yonetici(String isim, String soyisim, String TC, String telefonNo,String sifre,  String mail) {
        super(isim, soyisim,TC, telefonNo,sifre,mail);
    }

    
    public void kaydol(String isim, String soyisim, String TC , String telefonNo, String sifre, String mail) {
        try {
            FileReader okuyucu = new FileReader("YöneticiBilgi.txt");
            File file = new File("YöneticiBilgi.txt");
            FileWriter yazıcı = new FileWriter(file, true);
            BufferedWriter bWriter = new BufferedWriter(yazıcı);
            BufferedReader br = new BufferedReader(okuyucu);
            String satır = isim + "/" + soyisim + "/" + TC + "/" + telefonNo + "/" + sifre + "/" + mail +"/Yönetici";
            bWriter.write(satır + "\n");
            okuyucu.close();
            br.close();
            bWriter.close();
        } catch (Exception e) {
            
        }
    }


    @Override
    public void personelIstenCıkar(String TC) {
       try {
            File inputFile = new File("PersonelBilgi.txt");
            File tempFile = new File("myTempFile.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
            
            FileReader okuyucu2 = new FileReader("PersonelBilgi.txt");
            BufferedReader br = new BufferedReader(okuyucu2);
            String satır;
            String lineToRemove = "";
            while ((satır = br.readLine()) != null) {
                String bilgiler[] = new String[7];
                bilgiler = satır.split("/");
                if (TC.equals(bilgiler[2])) {
                    lineToRemove = satır;
                }
            }
            String currentLine;

            while ((currentLine = reader.readLine()) != null) {
                // trim newline when comparing with lineToRemove
                String trimmedLine = currentLine.trim();
                if (trimmedLine.equals(lineToRemove)) {
                    continue;
                }
                writer.write(currentLine + System.getProperty("line.separator"));
            }
            writer.close();
            reader.close();
            br.close();
            okuyucu2.close();
            inputFile.delete();
            tempFile.renameTo(inputFile);
        } catch (IOException ex) {
            
        }
    }

    
}
