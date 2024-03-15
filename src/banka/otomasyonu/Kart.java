
package banka.otomasyonu;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Ahmet
 */
public class Kart {

    String kartIsmi, kartNo, kartSahibiTC,onay;
    int kartLimit,bakiye,borc;

    public Kart(String kartSahibiTC, String kartIsmi) {
        Random rand = new Random();
        this.kartSahibiTC = kartSahibiTC;
        this.kartIsmi = kartIsmi;
        this.kartNo = String.valueOf(rand.nextInt(100000000));
        this.kartLimit = 1000;
        this.bakiye=this.kartLimit;
        this.borc=0;
        this.onay="-";
        try {
            File file = new File("KartBilgi.txt");
            FileWriter yazıcı = new FileWriter(file, true);
            BufferedWriter bWriter = new BufferedWriter(yazıcı);
            String satır = this.kartSahibiTC + "/" + this.kartIsmi + "/" + this.kartNo + "/" + this.kartLimit+"/"+this.bakiye+"/"+this.borc+"/"+this.onay;
            bWriter.write(satır + "\n");
            bWriter.close();
        } catch (Exception e) {
            
        }
    }
    public Kart(String kartSahibiTC, String kartIsmi,String onay) {
        Random rand = new Random();
        this.kartSahibiTC = kartSahibiTC;
        this.kartIsmi = kartIsmi;
        this.kartNo = String.valueOf(rand.nextInt(100000000));
        this.kartLimit = 1000;
        this.bakiye=this.kartLimit;
        this.borc=0;
        this.onay=onay;
        try {
            File file = new File("KartBilgi.txt");
            FileWriter yazıcı = new FileWriter(file, true);
            BufferedWriter bWriter = new BufferedWriter(yazıcı);
            String satır = this.kartSahibiTC + "/" + this.kartIsmi + "/" + this.kartNo + "/" + this.kartLimit+"/"+this.bakiye+"/"+this.borc+"/"+this.onay;
            bWriter.write(satır + "\n");
            bWriter.close();
        } catch (Exception e) {
            
        }
    }
    static public void limitGuncelle(DefaultTableModel model,int row,String yeniLimit){
        try {
            FileReader okuyucu = new FileReader("KartBilgi.txt");
            BufferedReader br = new BufferedReader(okuyucu);
            String satır;
            while ((satır = br.readLine()) != null) {
                String bilgiler[] = new String[7];
                bilgiler = satır.split("/");
                if (model.getValueAt(row, 1).toString().equals(bilgiler[2])) {
                    bilgiler[3] = yeniLimit;
                    String satır2 = bilgiler[0] + "/" + bilgiler[1] + "/" + bilgiler[2] + "/" + bilgiler[3] + "/" + bilgiler[4] + "/" + bilgiler[5] + "/" + bilgiler[6];

                    List<String> fileContent = new ArrayList<>(Files.readAllLines(Paths.get("KartBilgi.txt"), StandardCharsets.UTF_8));

                    for (int i = 0; i < fileContent.size(); i++) {
                        if (fileContent.get(i).equals(satır)) {
                            fileContent.set(i, satır2);
                            break;
                        }
                    }

                    Files.write(Paths.get("KartBilgi.txt"), fileContent, StandardCharsets.UTF_8);
                }
            }
            okuyucu.close();
            br.close();
        } catch (IOException ex) {
           
        }
    }
    static public void IsımDegistir(DefaultTableModel model,int row,String yeniIsım){
        try {
            FileReader okuyucu = new FileReader("KartBilgi.txt");
            BufferedReader br = new BufferedReader(okuyucu);
            String satır;
            while ((satır = br.readLine()) != null) {
                String bilgiler[] = new String[7];
                bilgiler = satır.split("/");
                if (model.getValueAt(row, 1).toString().equals(bilgiler[2])) {
                    bilgiler[1] = yeniIsım;
                    String satır2 = bilgiler[0] + "/" + bilgiler[1] + "/" + bilgiler[2] + "/" + bilgiler[3] + "/" + bilgiler[4] + "/" + bilgiler[5] + "/" + bilgiler[6];

                    List<String> fileContent = new ArrayList<>(Files.readAllLines(Paths.get("KartBilgi.txt"), StandardCharsets.UTF_8));

                    for (int i = 0; i < fileContent.size(); i++) {
                        if (fileContent.get(i).equals(satır)) {
                            fileContent.set(i, satır2);
                            break;
                        }
                    }

                    Files.write(Paths.get("KartBilgi.txt"), fileContent, StandardCharsets.UTF_8);
                }
            }
            okuyucu.close();
            br.close();
        } catch (IOException ex) {
            
        }
    }
    static public void kartSil(JTable KartlarTablo){
        try {
            int row;
            File inputFile = new File("KartBilgi.txt");
            File tempFile = new File("myTempFile.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
            DefaultTableModel model = (DefaultTableModel) KartlarTablo.getModel();
            if (KartlarTablo.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "Lütfen düzenleme istediğiniz kartı seçiniz", "Hata", JOptionPane.WARNING_MESSAGE);
                return;
            } else {
                row = KartlarTablo.getSelectedRow();
            }
            FileReader okuyucu2 = new FileReader("KartBilgi.txt");
            BufferedReader br = new BufferedReader(okuyucu2);
            String satır;
            String lineToRemove = "";
            while ((satır = br.readLine()) != null) {
                String bilgiler[] = new String[7];
                bilgiler = satır.split("/");
                if (model.getValueAt(row, 1).toString().equals(bilgiler[2])) {
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
    static public void kartBorcuOde(String KartınNo,int borc,int odencek){
        try {
            FileReader okuyucu = new FileReader("KartBilgi.txt");
            BufferedReader br = new BufferedReader(okuyucu);
            String satır;
            while ((satır = br.readLine()) != null) {
                String bilgiler[] = new String[7];
                bilgiler = satır.split("/");
                if (KartınNo.equals(bilgiler[2])) {
                    int yeniborc = borc - odencek;
                    bilgiler[5] = String.valueOf(yeniborc);
                    int bakiye = Integer.parseInt(bilgiler[4]);
                    bakiye += odencek;
                    bilgiler[4] = String.valueOf(bakiye);
                    String satır2 = bilgiler[0] + "/" + bilgiler[1] + "/" + bilgiler[2] + "/" + bilgiler[3] + "/" + bilgiler[4] + "/" + bilgiler[5] + "/" + bilgiler[6];

                    List<String> fileContent = new ArrayList<>(Files.readAllLines(Paths.get("KartBilgi.txt"), StandardCharsets.UTF_8));

                    for (int i = 0; i < fileContent.size(); i++) {
                        if (fileContent.get(i).equals(satır)) {
                            fileContent.set(i, satır2);
                            break;
                        }
                    }
                    JOptionPane.showMessageDialog(null, KartınNo + " numaralı kartınızdaki " + borc + " tl borcun " + odencek + " tl si ödendi", "Hata", JOptionPane.WARNING_MESSAGE);
                    Files.write(Paths.get("KartBilgi.txt"), fileContent, StandardCharsets.UTF_8);
                }
            }
            okuyucu.close();
            br.close();
        } catch (Exception e) {
            
        }
    }
}
