/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banka.otomasyonu;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ahmet
 */
public class Musteri extends Kullanici implements Islemler {

    public Musteri(String isim, String soyisim, String TC, String telefonNo, String sifre, String mail) {
        super(isim, soyisim, TC, telefonNo, sifre, mail);
    }

    @Override
    public void kaydol(String isim, String soyisim, String TC, String telefonNo, String sifre, String mail) {
        try {
            FileReader okuyucu = new FileReader("KullaniciBilgi.txt");
            File file = new File("KullaniciBilgi.txt");
            FileWriter yazıcı = new FileWriter(file, true);
            BufferedWriter bWriter = new BufferedWriter(yazıcı);
            BufferedReader br = new BufferedReader(okuyucu);
            String satır = isim + "/" + soyisim + "/" + TC + "/" + telefonNo + "/" + sifre + "/" + mail + "/" + "0.0" + "/TR3" + TC.charAt(10) + " " + TC.charAt(0) + TC.charAt(1) + "00 00" + TC.charAt(2) + TC.charAt(3) + " " + TC.charAt(4) + TC.charAt(5) + "00 00" + TC.charAt(6) + TC.charAt(7) + " " + TC.charAt(8) + TC.charAt(9) + "/Müşteri";
            bWriter.write(satır + "\n");
            okuyucu.close();
            br.close();
            bWriter.close();
        } catch (Exception e) {
            
        }
    }

    @Override
    public void kartOluştur(Musteri yeniM, String kartIsim) {
        Kart yeniK = new Kart(yeniM.TC, kartIsim);
    }
     @Override
    public void krediBasvur(double miktar){
        try {
            FileReader okuyucu = new FileReader("KullaniciBilgi.txt");
            BufferedReader br = new BufferedReader(okuyucu);
            String satır;
            while ((satır = br.readLine()) != null) {
                String bilgiler[] = new String[9];
                bilgiler = satır.split("/");
                if (this.TC.equals(bilgiler[2]) && this.sifre.equals(bilgiler[4])) {
                    Double x = Double.valueOf(bilgiler[6]);
                    x += miktar;
                    bilgiler[6] = String.valueOf(x);
                    this.para = bilgiler[6];
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
    @Override
    public void paraCek(double miktar) {
        try {
            FileReader okuyucu = new FileReader("KullaniciBilgi.txt");
            BufferedReader br = new BufferedReader(okuyucu);
            String satır;
            while ((satır = br.readLine()) != null) {
                String bilgiler[] = new String[9];
                bilgiler = satır.split("/");
                if (this.TC.equals(bilgiler[2]) && this.sifre.equals(bilgiler[4])) {
                    Double x = Double.valueOf(bilgiler[6]);
                    x -= miktar;
                    bilgiler[6] = String.valueOf(x);
                    this.para = bilgiler[6];
                    String satır2 = bilgiler[0] + "/" + bilgiler[1] + "/" + bilgiler[2] + "/" + bilgiler[3] + "/" + bilgiler[4] + "/" + bilgiler[5] + "/" + bilgiler[6] + "/" + bilgiler[7] + "/" + bilgiler[8];

                    List<String> fileContent = new ArrayList<>(Files.readAllLines(Paths.get("KullaniciBilgi.txt"), StandardCharsets.UTF_8));

                    for (int i = 0; i < fileContent.size(); i++) {
                        if (fileContent.get(i).equals(satır)) {
                            fileContent.set(i, satır2);
                            break;
                        }
                    }

                    Files.write(Paths.get("KullaniciBilgi.txt"), fileContent, StandardCharsets.UTF_8);

                }
            }
            okuyucu.close();
            br.close();
        } catch (Exception e) {
            
        }
    }

    @Override
    public void paraYatır(double miktar) {
        try {
            FileReader okuyucu = new FileReader("KullaniciBilgi.txt");
            BufferedReader br = new BufferedReader(okuyucu);
            String satır;
            while ((satır = br.readLine()) != null) {
                String bilgiler[] = new String[9];
                bilgiler = satır.split("/");
                if (this.TC.equals(bilgiler[2]) && this.sifre.equals(bilgiler[4])) {
                    Double x = Double.valueOf(bilgiler[6]);
                    x += miktar;
                    bilgiler[6] = String.valueOf(x);
                    this.para = bilgiler[6];
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

    @Override
    public void paraTransfer(double miktar, String IBAN2) {
        try {
            FileReader okuyucu = new FileReader("KullaniciBilgi.txt");
            FileReader okuyucu2 = new FileReader("KullaniciBilgi.txt");
            BufferedReader br = new BufferedReader(okuyucu);
            BufferedReader br2 = new BufferedReader(okuyucu2);
            String satır, satır3;
            while ((satır = br.readLine()) != null) {
                String bilgiler[] = new String[9];
                bilgiler = satır.split("/");
                if (this.TC.equals(bilgiler[2]) && this.sifre.equals(bilgiler[4])) {
                    Double x = Double.valueOf(bilgiler[6]);
                    x -= miktar;
                    bilgiler[6] = String.valueOf(x);
                    this.para = bilgiler[6];
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
            while ((satır3 = br2.readLine()) != null) {
                String bilgiler[] = new String[9];
                bilgiler = satır3.split("/");
                if (IBAN2.equals(bilgiler[7])) {
                    Double x = Double.valueOf(bilgiler[6]);
                    x += miktar;
                    bilgiler[6] = String.valueOf(x);
                    String satır4 = bilgiler[0] + "/" + bilgiler[1] + "/" + bilgiler[2] + "/" + bilgiler[3] + "/" + bilgiler[4] + "/" + bilgiler[5] + "/" + bilgiler[6] + "/" + bilgiler[7] + "/" + bilgiler[8];
                    try {

                        List<String> fileContent = new ArrayList<>(Files.readAllLines(Paths.get("KullaniciBilgi.txt"), StandardCharsets.UTF_8));

                        for (int i = 0; i < fileContent.size(); i++) {
                            if (fileContent.get(i).equals(satır3)) {
                                fileContent.set(i, satır4);
                                break;
                            }
                        }

                        Files.write(Paths.get("KullaniciBilgi.txt"), fileContent, StandardCharsets.UTF_8);
                    } catch (IOException ex) {
                        
                    }
                }
            }
            okuyucu.close();
            okuyucu2.close();
            br.close();
            br2.close();
        } catch (Exception e) {
            
        }
    }

    @Override
    public void faturaOde(double miktar) {
        try {
            FileReader okuyucu = new FileReader("KullaniciBilgi.txt");
            BufferedReader br = new BufferedReader(okuyucu);
            String satır;
            while ((satır = br.readLine()) != null) {
                String bilgiler[] = new String[9];
                bilgiler = satır.split("/");
                if (this.TC.equals(bilgiler[2]) && this.sifre.equals(bilgiler[4])) {
                    Double x = Double.valueOf(bilgiler[6]);
                    x -= miktar;
                    bilgiler[6] = String.valueOf(x);
                    this.para = bilgiler[6];
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
    @Override
    public String bakiyeOgren() {
        return this.para;
    }

    @Override
    public void krediOde(double miktar) {
        try {
            FileReader okuyucu = new FileReader("KullaniciBilgi.txt");
            BufferedReader br = new BufferedReader(okuyucu);
            String satır;
            while ((satır = br.readLine()) != null) {
                String bilgiler[] = new String[9];
                bilgiler = satır.split("/");
                if (this.TC.equals(bilgiler[2]) && this.sifre.equals(bilgiler[4])) {
                    Double x = Double.valueOf(bilgiler[6]);
                    x -= miktar;
                    bilgiler[6] = String.valueOf(x);
                    this.para = bilgiler[6];
                    String satır2 = bilgiler[0] + "/" + bilgiler[1] + "/" + bilgiler[2] + "/" + bilgiler[3] + "/" + bilgiler[4] + "/" + bilgiler[5] + "/" + bilgiler[6] + "/" + bilgiler[7] + "/" + bilgiler[8];

                    List<String> fileContent = new ArrayList<>(Files.readAllLines(Paths.get("KullaniciBilgi.txt"), StandardCharsets.UTF_8));

                    for (int i = 0; i < fileContent.size(); i++) {
                        if (fileContent.get(i).equals(satır)) {
                            fileContent.set(i, satır2);
                            break;
                        }
                    }

                    Files.write(Paths.get("KullaniciBilgi.txt"), fileContent, StandardCharsets.UTF_8);

                }
            }
            okuyucu.close();
            br.close();
        } catch (Exception e) {
            
        }
    }
}
