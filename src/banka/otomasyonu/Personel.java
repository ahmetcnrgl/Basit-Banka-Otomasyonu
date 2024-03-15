
package banka.otomasyonu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Ahmet
 */
public class Personel extends Kullanici implements PersonelIslemler {

    public Personel(String isim, String soyisim, String TC, String telefonNo,String sifre,  String mail) {
        super(isim, soyisim, TC, telefonNo, sifre, mail);
    }

    
    public void kaydol(String isim, String soyisim, String TC, String telefonNo, String sifre, String mail) {
        try {
            FileReader okuyucu = new FileReader("PersonelBilgi.txt");
            File file = new File("PersonelBilgi.txt");
            FileWriter yazıcı = new FileWriter(file, true);
            BufferedWriter bWriter = new BufferedWriter(yazıcı);
            BufferedReader br = new BufferedReader(okuyucu);
            String satır = isim + "/" + soyisim + "/" + TC + "/" + telefonNo + "/" + sifre + "/" + mail + "/Personel";
            bWriter.write(satır + "\n");
            br.close();
            bWriter.close();
        } catch (Exception e) {
            
        }
    }
    
    public void krediOnay(String musteriTC,String neden,String faiz,String miktar) {
        try {
            FileReader okuyucu = new FileReader("KrediBilgi.txt");
            BufferedReader br = new BufferedReader(okuyucu);
            String satır;
            while ((satır = br.readLine()) != null) {
                String bilgiler[] = new String[7];
                bilgiler = satır.split("/");
                if (neden.equals(bilgiler[2])&& musteriTC.equals(bilgiler[0])&&faiz.equals(bilgiler[4])&&miktar.equals(bilgiler[1])) {
                    bilgiler[6]="+";
                    String satır2 = bilgiler[0] + "/" + bilgiler[1] + "/" + bilgiler[2] + "/" + bilgiler[3] + "/" + bilgiler[4] + "/" + bilgiler[5] + "/" + bilgiler[6];

                    List<String> fileContent = new ArrayList<>(Files.readAllLines(Paths.get("KrediBilgi.txt"), StandardCharsets.UTF_8));

                    for (int i = 0; i < fileContent.size(); i++) {
                        if (fileContent.get(i).equals(satır)) {
                            fileContent.set(i, satır2);
                            break;
                        }
                    }
                    JOptionPane.showMessageDialog(null, "kredi onaylandı ");
                    Files.write(Paths.get("KrediBilgi.txt"), fileContent, StandardCharsets.UTF_8);
                }
            }
            okuyucu.close();
            br.close();
        } catch (Exception e) {
            
        }
        try {
            FileReader okuyucu = new FileReader("KullaniciBilgi.txt");
            BufferedReader br = new BufferedReader(okuyucu);
            String satır;
            while ((satır = br.readLine()) != null) {
                String bilgiler[] = new String[9];
                bilgiler = satır.split("/");
                if (musteriTC.equals(bilgiler[2])) {
                    Double x = Double.valueOf(bilgiler[6]);
                    double miktar2 =Double.valueOf(miktar);
                    x += miktar2;
                    bilgiler[6] = String.valueOf(x);
                    String satır2 = bilgiler[0] + "/" + bilgiler[1] + "/" + bilgiler[2] + "/" + bilgiler[3] + "/" + bilgiler[4] + "/" + bilgiler[5] + "/" + bilgiler[6] + "/" + bilgiler[7] + "/" + bilgiler[8];
                    try {

                        List<String> fileContent = new ArrayList<>(Files.readAllLines(Paths.get("KullaniciBilgi.txt"), StandardCharsets.UTF_8));

                        for (int i = 0; i < fileContent.size(); i++) {
                            if (fileContent.get(i).equals(satır)) {
                                fileContent.set(i, satır2);
                                break;
                            }
                        }

                        Files.write(Paths.get("KullaniciBilgi.txt"), fileContent, StandardCharsets.UTF_8);
                    } catch (IOException ex) {
                        
                    }
                }
            }
            okuyucu.close();
            br.close();
        } catch (Exception e) {
            
        }
    }

    
    public void kartOnay(String musteriTC,String KartNo) {
       try {
            FileReader okuyucu = new FileReader("KartBilgi.txt");
            BufferedReader br = new BufferedReader(okuyucu);
            String satır;
            while ((satır = br.readLine()) != null) {
                String bilgiler[] = new String[7];
                bilgiler = satır.split("/");
                if (KartNo.equals(bilgiler[2])&& musteriTC.equals(bilgiler[0])) {
                    bilgiler[6]="+";
                    String satır2 = bilgiler[0] + "/" + bilgiler[1] + "/" + bilgiler[2] + "/" + bilgiler[3] + "/" + bilgiler[4] + "/" + bilgiler[5] + "/" + bilgiler[6];

                    List<String> fileContent = new ArrayList<>(Files.readAllLines(Paths.get("KartBilgi.txt"), StandardCharsets.UTF_8));

                    for (int i = 0; i < fileContent.size(); i++) {
                        if (fileContent.get(i).equals(satır)) {
                            fileContent.set(i, satır2);
                            break;
                        }
                    }
                    JOptionPane.showMessageDialog(null, KartNo + " numaralı kart onaylandı ");
                    Files.write(Paths.get("KartBilgi.txt"), fileContent, StandardCharsets.UTF_8);
                }
            }
            okuyucu.close();
            br.close();
        } catch (Exception e) {
            
        }
    }
}
