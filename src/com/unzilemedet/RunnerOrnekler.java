package com.unzilemedet;

import java.util.Scanner;

public class RunnerOrnekler {
    public static void main(String[] args) {

        /*  Her bir değişkenin bir kapsama alanı vardır . Sınıf içi değişkenler için (local değişkenler)
        kapsama alanı {} içidir.  */

        int sinifMevcudu = 0, secim ;
        String[] sinifListesi = null;
        int[] matematikNotlari = null;
        do{
        Scanner scanner = new Scanner(System.in);

        System.out.println("********************************");
        System.out.println("******* OKUL OTOMASYONU ********");
        System.out.println("********************************");
        System.out.println();
        System.out.println("1- Sınıf Tanımlama");
        System.out.println("2- Öğrenci Listesi");
        System.out.println("3- Sınıf Listesi ");
        System.out.println("4-Not Vermek");
        System.out.println("5-Not Listeleme");
        System.out.println("0- Çıkış ");

        System.out.print("Lütfen bir seçim yapınız...:");
        secim = scanner.nextInt();

        switch (secim){
            case 1 :
                System.out.println("******* Sınıf Tanımlama ********");
                System.out.println("********************************");
                System.out.print("Sinif mevcudunu giriniz...:");
                sinifMevcudu = scanner.nextInt();
                break;

            case 2 :

                sinifListesi = new String[sinifMevcudu]; //{"","","",""}
                scanner = new Scanner(System.in);

                for (int i=0 ; i<sinifListesi.length; i++){
                    System.out.print((i+1) + ". Öğrencinin adını gir....:");
                    sinifListesi[i]= scanner.nextLine();
                }
                break;

            case 3:
                System.out.println("*********************************");
                System.out.println("***** Sınıf Öğrenci Listesi *****");
                System.out.println("*********************************");
                for(int i=0; i<sinifListesi.length; i++){
                    System.out.println(sinifListesi[i]);
                }
                break;

            case 4 :
                System.out.println("********************************");
                System.out.println("******* Not Giriş Ekranı *******");
                System.out.println("********************************");
                System.out.println();
                matematikNotlari = new int[sinifMevcudu];

                for (int i=0; i<sinifMevcudu; i++) {
                    System.out.println(sinifListesi[i]);
                    System.out.print(" adlı öğrencinin 1. notunu giriniz : ");
                    int not1 = scanner.nextInt();

                    System.out.println(sinifListesi[i]);

                    System.out.print(" adlı öğrencinin 2. notunu giriniz : ");
                    int not2 = scanner.nextInt();

                    int ortalama = (not1 + not2) / 2;
                    matematikNotlari[i] = ortalama;
                    System.out.println(ortalama);
                }
                break;

            case 5 :


                break;

            case 0 :
                System.out.println("Çıkış yapıldı.");

                break;

            default:
                System.out.println("Lütfen geçerli bir giriş yapınız... ");
                break;
        }
        } while(secim != 0);






    }
}
