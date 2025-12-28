import java.util.Scanner;

public class SezarSifre {
    public static void main(String[] args) {
        System.out.println("--Sezar Şifreleme Programına Hoşgeldiniz--");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen şifrelemek istediğiniz metni giriniz :");
        String mesaj = scanner.nextLine();

        System.out.print("Lütfen anahtar sayısı giriniz :");
        int anahtar = scanner.nextInt();

        String sifreli = sifrele(mesaj,anahtar);
        System.out.println("Sifreli :"+sifreli);

        String cozulmus = coz(sifreli,anahtar);
        System.out.println("Çözülmülmüş :"+cozulmus);
    }
    public static  String sifrele(String metin, int anahtar){

        StringBuilder sonuc = new StringBuilder();

        for (char karakter : metin.toCharArray()){
            if (Character.isLetter(karakter)){

                char baslangic = Character.isUpperCase(karakter) ? 'A' : 'a';

                int sira = (karakter - baslangic + anahtar) % 26;

                char yenikarakter = (char) (sira + baslangic);

                sonuc.append(yenikarakter);
            }else {
                sonuc.append(karakter);
            }

        } return sonuc.toString();



    }public static  String coz (String metin ,int anahtar){
        return sifrele(metin,26-(anahtar % 26));

    }



}
