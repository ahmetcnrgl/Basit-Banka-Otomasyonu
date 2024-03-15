
package banka.otomasyonu;

import java.io.BufferedReader;
import java.io.FileReader;
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
abstract public class Insan {

    String isim, sifre, soyisim, telefonNo, TC, mail;

    public Insan(String isim, String soyisim, String TC, String telefonNo, String sifre, String mail) {
        this.isim = isim;
        this.sifre = sifre;
        this.soyisim = soyisim;
        this.telefonNo = telefonNo;
        this.TC = TC;
        this.mail = mail;
    }

    public void IsımDegistir(String isim) {
        this.isim = isim;
        try {
            FileReader okuyucu = new FileReader("KullaniciBilgi.txt");
            BufferedReader br = new BufferedReader(okuyucu);
            String satır;
            while ((satır = br.readLine()) != null) {
                String bilgiler[] = new String[9];
                bilgiler = satır.split("/");
                if (this.TC.equals(bilgiler[2]) && this.sifre.equals(bilgiler[4])) {
                    bilgiler[0] = isim;
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
        try {
            FileReader okuyucu = new FileReader("PersonelBilgi.txt");
            BufferedReader br = new BufferedReader(okuyucu);
            String satır;
            while ((satır = br.readLine()) != null) {
                String bilgiler[] = new String[7];
                bilgiler = satır.split("/");
                if (this.TC.equals(bilgiler[2]) && this.sifre.equals(bilgiler[4])) {
                    bilgiler[0] = isim;
                    String satır2 = bilgiler[0] + "/" + bilgiler[1] + "/" + bilgiler[2] + "/" + bilgiler[3] + "/" + bilgiler[4] + "/" + bilgiler[5] + "/" + bilgiler[6];

                    List<String> fileContent = new ArrayList<>(Files.readAllLines(Paths.get("PersonelBilgi.txt"), StandardCharsets.UTF_8));

                    for (int i = 0; i < fileContent.size(); i++) {
                        if (fileContent.get(i).equals(satır)) {
                            fileContent.set(i, satır2);
                            break;
                        }
                    }

                    Files.write(Paths.get("PersonelBilgi.txt"), fileContent, StandardCharsets.UTF_8);

                }
            }
            okuyucu.close();
            br.close();
        } catch (Exception e) {
           
        }
        try {
            FileReader okuyucu = new FileReader("YöneticiBilgi.txt");
            BufferedReader br = new BufferedReader(okuyucu);
            String satır;
            while ((satır = br.readLine()) != null) {
                String bilgiler[] = new String[7];
                bilgiler = satır.split("/");
                if (this.TC.equals(bilgiler[2]) && this.sifre.equals(bilgiler[4])) {
                    bilgiler[0] = isim;
                    String satır2 = bilgiler[0] + "/" + bilgiler[1] + "/" + bilgiler[2] + "/" + bilgiler[3] + "/" + bilgiler[4] + "/" + bilgiler[5] + "/" + bilgiler[6];

                    List<String> fileContent = new ArrayList<>(Files.readAllLines(Paths.get("YöneticiBilgi.txt"), StandardCharsets.UTF_8));

                    for (int i = 0; i < fileContent.size(); i++) {
                        if (fileContent.get(i).equals(satır)) {
                            fileContent.set(i, satır2);
                            break;
                        }
                    }

                    Files.write(Paths.get("YöneticiBilgi.txt"), fileContent, StandardCharsets.UTF_8);

                }
            }
            okuyucu.close();
            br.close();
        } catch (Exception e) {
           
        }
    }

    public void SoyIsimDegistir(String soyisim) {
        this.soyisim = soyisim;
        try {
            FileReader okuyucu = new FileReader("KullaniciBilgi.txt");
            BufferedReader br = new BufferedReader(okuyucu);
            String satır;
            while ((satır = br.readLine()) != null) {
                String bilgiler[] = new String[9];
                bilgiler = satır.split("/");
                if (this.TC.equals(bilgiler[2]) && this.sifre.equals(bilgiler[4])) {
                    bilgiler[1] = soyisim;
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
        try {
            FileReader okuyucu = new FileReader("PersonelBilgi.txt");
            BufferedReader br = new BufferedReader(okuyucu);
            String satır;
            while ((satır = br.readLine()) != null) {
                String bilgiler[] = new String[7];
                bilgiler = satır.split("/");
                if (this.TC.equals(bilgiler[2]) && this.sifre.equals(bilgiler[4])) {
                    bilgiler[1] = soyisim;
                    String satır2 = bilgiler[0] + "/" + bilgiler[1] + "/" + bilgiler[2] + "/" + bilgiler[3] + "/" + bilgiler[4] + "/" + bilgiler[5] + "/" + bilgiler[6];

                    List<String> fileContent = new ArrayList<>(Files.readAllLines(Paths.get("PersonelBilgi.txt"), StandardCharsets.UTF_8));

                    for (int i = 0; i < fileContent.size(); i++) {
                        if (fileContent.get(i).equals(satır)) {
                            fileContent.set(i, satır2);
                            break;
                        }
                    }

                    Files.write(Paths.get("PersonelBilgi.txt"), fileContent, StandardCharsets.UTF_8);

                }
            }
            okuyucu.close();
            br.close();
        } catch (Exception e) {
            
        }
        try {
            FileReader okuyucu = new FileReader("YöneticiBilgi.txt");
            BufferedReader br = new BufferedReader(okuyucu);
            String satır;
            while ((satır = br.readLine()) != null) {
                String bilgiler[] = new String[7];
                bilgiler = satır.split("/");
                if (this.TC.equals(bilgiler[2]) && this.sifre.equals(bilgiler[4])) {
                    bilgiler[1] = soyisim;
                    String satır2 = bilgiler[0] + "/" + bilgiler[1] + "/" + bilgiler[2] + "/" + bilgiler[3] + "/" + bilgiler[4] + "/" + bilgiler[5] + "/" + bilgiler[6];

                    List<String> fileContent = new ArrayList<>(Files.readAllLines(Paths.get("YöneticiBilgi.txt"), StandardCharsets.UTF_8));

                    for (int i = 0; i < fileContent.size(); i++) {
                        if (fileContent.get(i).equals(satır)) {
                            fileContent.set(i, satır2);
                            break;
                        }
                    }

                    Files.write(Paths.get("YöneticiBilgi.txt"), fileContent, StandardCharsets.UTF_8);

                }
            }
            okuyucu.close();
            br.close();
        } catch (Exception e) {
           
        }
    }

    public void TelNoDegistir(String telno) {
        this.telefonNo = telno;
        try {
            FileReader okuyucu = new FileReader("KullaniciBilgi.txt");
            BufferedReader br = new BufferedReader(okuyucu);
            String satır;
            while ((satır = br.readLine()) != null) {
                String bilgiler[] = new String[9];
                bilgiler = satır.split("/");
                if (this.TC.equals(bilgiler[2]) && this.sifre.equals(bilgiler[4])) {
                    bilgiler[3] = telno;
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
        try {
            FileReader okuyucu = new FileReader("PersonelBilgi.txt");
            BufferedReader br = new BufferedReader(okuyucu);
            String satır;
            while ((satır = br.readLine()) != null) {
                String bilgiler[] = new String[7];
                bilgiler = satır.split("/");
                if (this.TC.equals(bilgiler[2]) && this.sifre.equals(bilgiler[4])) {
                    bilgiler[3] = telno;
                    String satır2 = bilgiler[0] + "/" + bilgiler[1] + "/" + bilgiler[2] + "/" + bilgiler[3] + "/" + bilgiler[4] + "/" + bilgiler[5] + "/" + bilgiler[6];

                    List<String> fileContent = new ArrayList<>(Files.readAllLines(Paths.get("PersonelBilgi.txt"), StandardCharsets.UTF_8));

                    for (int i = 0; i < fileContent.size(); i++) {
                        if (fileContent.get(i).equals(satır)) {
                            fileContent.set(i, satır2);
                            break;
                        }
                    }

                    Files.write(Paths.get("PersonelBilgi.txt"), fileContent, StandardCharsets.UTF_8);

                }
            }
            okuyucu.close();
            br.close();
        } catch (Exception e) {
           
        }
        try {
            FileReader okuyucu = new FileReader("YöneticiBilgi.txt");
            BufferedReader br = new BufferedReader(okuyucu);
            String satır;
            while ((satır = br.readLine()) != null) {
                String bilgiler[] = new String[7];
                bilgiler = satır.split("/");
                if (this.TC.equals(bilgiler[2]) && this.sifre.equals(bilgiler[4])) {
                    bilgiler[3] = telno;
                    String satır2 = bilgiler[0] + "/" + bilgiler[1] + "/" + bilgiler[2] + "/" + bilgiler[3] + "/" + bilgiler[4] + "/" + bilgiler[5] + "/" + bilgiler[6];

                    List<String> fileContent = new ArrayList<>(Files.readAllLines(Paths.get("YöneticiBilgi.txt"), StandardCharsets.UTF_8));

                    for (int i = 0; i < fileContent.size(); i++) {
                        if (fileContent.get(i).equals(satır)) {
                            fileContent.set(i, satır2);
                            break;
                        }
                    }

                    Files.write(Paths.get("YöneticiBilgi.txt"), fileContent, StandardCharsets.UTF_8);

                }
            }
            okuyucu.close();
            br.close();
        } catch (Exception e) {
            
        }
    }

    public void EmailDegistir(String mail) {
        this.mail = mail;
        try {
            FileReader okuyucu = new FileReader("KullaniciBilgi.txt");
            BufferedReader br = new BufferedReader(okuyucu);
            String satır;
            while ((satır = br.readLine()) != null) {
                String bilgiler[] = new String[9];
                bilgiler = satır.split("/");
                if (this.TC.equals(bilgiler[2]) && this.sifre.equals(bilgiler[4])) {
                    bilgiler[5] = mail;
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
        try {
            FileReader okuyucu = new FileReader("PersonelBilgi.txt");
            BufferedReader br = new BufferedReader(okuyucu);
            String satır;
            while ((satır = br.readLine()) != null) {
                String bilgiler[] = new String[7];
                bilgiler = satır.split("/");
                if (this.TC.equals(bilgiler[2]) && this.sifre.equals(bilgiler[4])) {
                    bilgiler[5] = mail;
                    String satır2 = bilgiler[0] + "/" + bilgiler[1] + "/" + bilgiler[2] + "/" + bilgiler[3] + "/" + bilgiler[4] + "/" + bilgiler[5] + "/" + bilgiler[6];

                    List<String> fileContent = new ArrayList<>(Files.readAllLines(Paths.get("PersonelBilgi.txt"), StandardCharsets.UTF_8));

                    for (int i = 0; i < fileContent.size(); i++) {
                        if (fileContent.get(i).equals(satır)) {
                            fileContent.set(i, satır2);
                            break;
                        }
                    }

                    Files.write(Paths.get("PersonelBilgi.txt"), fileContent, StandardCharsets.UTF_8);

                }
            }
            okuyucu.close();
            br.close();
        } catch (Exception e) {
            
        }
        try {
            FileReader okuyucu = new FileReader("YöneticiBilgi.txt");
            BufferedReader br = new BufferedReader(okuyucu);
            String satır;
            while ((satır = br.readLine()) != null) {
                String bilgiler[] = new String[7];
                bilgiler = satır.split("/");
                if (this.TC.equals(bilgiler[2]) && this.sifre.equals(bilgiler[4])) {
                    bilgiler[5] = mail;
                    String satır2 = bilgiler[0] + "/" + bilgiler[1] + "/" + bilgiler[2] + "/" + bilgiler[3] + "/" + bilgiler[4] + "/" + bilgiler[5] + "/" + bilgiler[6];

                    List<String> fileContent = new ArrayList<>(Files.readAllLines(Paths.get("YöneticiBilgi.txt"), StandardCharsets.UTF_8));

                    for (int i = 0; i < fileContent.size(); i++) {
                        if (fileContent.get(i).equals(satır)) {
                            fileContent.set(i, satır2);
                            break;
                        }
                    }

                    Files.write(Paths.get("YöneticiBilgi.txt"), fileContent, StandardCharsets.UTF_8);

                }
            }
            okuyucu.close();
            br.close();
        } catch (Exception e) {
            
        }
    }

    public void TCDegistir(String TC) {
        try {
            FileReader okuyucu = new FileReader("KullaniciBilgi.txt");
            BufferedReader br = new BufferedReader(okuyucu);
            String satır;
            while ((satır = br.readLine()) != null) {
                String bilgiler[] = new String[9];
                bilgiler = satır.split("/");
                if (this.TC.equals(bilgiler[2]) && this.sifre.equals(bilgiler[4])) {
                    bilgiler[2] = TC;
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
        try {
            FileReader okuyucu = new FileReader("PersonelBilgi.txt");
            BufferedReader br = new BufferedReader(okuyucu);
            String satır;
            while ((satır = br.readLine()) != null) {
                String bilgiler[] = new String[7];
                bilgiler = satır.split("/");
                if (this.TC.equals(bilgiler[2]) && this.sifre.equals(bilgiler[4])) {
                    bilgiler[2] = TC;
                    String satır2 = bilgiler[0] + "/" + bilgiler[1] + "/" + bilgiler[2] + "/" + bilgiler[3] + "/" + bilgiler[4] + "/" + bilgiler[5] + "/" + bilgiler[6];

                    List<String> fileContent = new ArrayList<>(Files.readAllLines(Paths.get("PersonelBilgi.txt"), StandardCharsets.UTF_8));

                    for (int i = 0; i < fileContent.size(); i++) {
                        if (fileContent.get(i).equals(satır)) {
                            fileContent.set(i, satır2);
                            break;
                        }
                    }

                    Files.write(Paths.get("PersonelBilgi.txt"), fileContent, StandardCharsets.UTF_8);

                }
            }
            okuyucu.close();
            br.close();
        } catch (Exception e) {
            
        }
        try {
            FileReader okuyucu = new FileReader("YöneticiBilgi.txt");
            BufferedReader br = new BufferedReader(okuyucu);
            String satır;
            while ((satır = br.readLine()) != null) {
                String bilgiler[] = new String[7];
                bilgiler = satır.split("/");
                if (this.TC.equals(bilgiler[2]) && this.sifre.equals(bilgiler[4])) {
                    bilgiler[2] = TC;
                    String satır2 = bilgiler[0] + "/" + bilgiler[1] + "/" + bilgiler[2] + "/" + bilgiler[3] + "/" + bilgiler[4] + "/" + bilgiler[5] + "/" + bilgiler[6];

                    List<String> fileContent = new ArrayList<>(Files.readAllLines(Paths.get("YöneticiBilgi.txt"), StandardCharsets.UTF_8));

                    for (int i = 0; i < fileContent.size(); i++) {
                        if (fileContent.get(i).equals(satır)) {
                            fileContent.set(i, satır2);
                            break;
                        }
                    }

                    Files.write(Paths.get("YöneticiBilgi.txt"), fileContent, StandardCharsets.UTF_8);

                }
            }
            okuyucu.close();
            br.close();
        } catch (Exception e) {
            
        }
        this.TC = TC;
    }

    public void SifreDegistir(String sifre) {
        try {
            FileReader okuyucu = new FileReader("KullaniciBilgi.txt");
            BufferedReader br = new BufferedReader(okuyucu);
            String satır;
            while ((satır = br.readLine()) != null) {
                String bilgiler[] = new String[9];
                bilgiler = satır.split("/");
                if (this.TC.equals(bilgiler[2]) && this.sifre.equals(bilgiler[4])) {
                    bilgiler[4] = sifre;
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
        try {
            FileReader okuyucu = new FileReader("PersonelBilgi.txt");
            BufferedReader br = new BufferedReader(okuyucu);
            String satır;
            while ((satır = br.readLine()) != null) {
                String bilgiler[] = new String[7];
                bilgiler = satır.split("/");
                if (this.TC.equals(bilgiler[2]) && this.sifre.equals(bilgiler[4])) {
                    bilgiler[4] = sifre;
                    String satır2 = bilgiler[0] + "/" + bilgiler[1] + "/" + bilgiler[2] + "/" + bilgiler[3] + "/" + bilgiler[4] + "/" + bilgiler[5] + "/" + bilgiler[6];

                    List<String> fileContent = new ArrayList<>(Files.readAllLines(Paths.get("PersonelBilgi.txt"), StandardCharsets.UTF_8));

                    for (int i = 0; i < fileContent.size(); i++) {
                        if (fileContent.get(i).equals(satır)) {
                            fileContent.set(i, satır2);
                            break;
                        }
                    }

                    Files.write(Paths.get("PersonelBilgi.txt"), fileContent, StandardCharsets.UTF_8);

                }
            }
            okuyucu.close();
            br.close();
        } catch (Exception e) {
            
        }
        try {
            FileReader okuyucu = new FileReader("YöneticiBilgi.txt");
            BufferedReader br = new BufferedReader(okuyucu);
            String satır;
            while ((satır = br.readLine()) != null) {
                String bilgiler[] = new String[7];
                bilgiler = satır.split("/");
                if (this.TC.equals(bilgiler[2]) && this.sifre.equals(bilgiler[4])) {
                    bilgiler[4] = sifre;
                    String satır2 = bilgiler[0] + "/" + bilgiler[1] + "/" + bilgiler[2] + "/" + bilgiler[3] + "/" + bilgiler[4] + "/" + bilgiler[5] + "/" + bilgiler[6];

                    List<String> fileContent = new ArrayList<>(Files.readAllLines(Paths.get("YöneticiBilgi.txt"), StandardCharsets.UTF_8));

                    for (int i = 0; i < fileContent.size(); i++) {
                        if (fileContent.get(i).equals(satır)) {
                            fileContent.set(i, satır2);
                            break;
                        }
                    }

                    Files.write(Paths.get("YöneticiBilgi.txt"), fileContent, StandardCharsets.UTF_8);

                }
            }
            okuyucu.close();
            br.close();
        } catch (Exception e) {
           
        }
        this.sifre = sifre;
    }

    static public boolean giris(String TC, String sifre, String tür) {
        boolean durum = false;
        if (tür.equals("Müşteri")) {
            try {
                FileReader okuyucu = new FileReader("KullaniciBilgi.txt");
                BufferedReader br = new BufferedReader(okuyucu);
                String satır;
                while ((satır = br.readLine()) != null) {
                    String bilgiler[] = new String[9];
                    bilgiler = satır.split("/");
                    if (TC.equals(bilgiler[2]) && sifre.equals(bilgiler[4])) {
                        JOptionPane.showMessageDialog(null, "Giriş Başarılı");
                        durum = true;
                    }
                }
                if (durum == false) {
                    JOptionPane.showMessageDialog(null, "Giriş Başarısız");
                }
                okuyucu.close();
                br.close();
            } catch (Exception e) {
                
            }
        } else if (tür.equals("Personel")) {
            try {
                FileReader okuyucu = new FileReader("PersonelBilgi.txt");
                BufferedReader br = new BufferedReader(okuyucu);
                String satır;
                while ((satır = br.readLine()) != null) {
                    String bilgiler[] = new String[7];
                    bilgiler = satır.split("/");
                    if (TC.equals(bilgiler[2]) && sifre.equals(bilgiler[4])) {
                        JOptionPane.showMessageDialog(null, "Giriş Başarılı");
                        durum = true;
                    }
                }
                if (durum == false) {
                    JOptionPane.showMessageDialog(null, "Giriş Başarısız");
                }
                okuyucu.close();
                br.close();
            } catch (Exception e) {
               
            }
        } else if (tür.equals("Yönetici")) {
            try {
                FileReader okuyucu = new FileReader("YöneticiBilgi.txt");
                BufferedReader br = new BufferedReader(okuyucu);
                String satır;
                while ((satır = br.readLine()) != null) {
                    String bilgiler[] = new String[7];
                    bilgiler = satır.split("/");
                    if (TC.equals(bilgiler[2]) && sifre.equals(bilgiler[4])) {
                        JOptionPane.showMessageDialog(null, "Giriş Başarılı");
                        durum = true;
                    }
                }
                if (durum == false) {
                    JOptionPane.showMessageDialog(null, "Giriş Başarısız");
                }
                okuyucu.close();
                br.close();
            } catch (Exception e) {
               
            }
        }
        return durum;
    }
}
