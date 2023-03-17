package com.unzilemedet;

public class Runner_Ornek2 {
    public static void main(String[] args) {

        int[] sayilar = {-1,5,6,87,-90,65,502,-856,963,63};
        /*
        * 1-) Sayıların ortalamasını bulunuz
        * 2-) En büyük sayıyı bulan programı yazınız
        * 3-) En küçük sayıyı bulan programı yazınız
        * */

        int toplam = 0;

        for(int i=0; i<sayilar.length ; i++)
            toplam += sayilar[i]; // toplam= toplam + sayilar[i]

            int ortalama = toplam / sayilar.length;
            System.out.println("Ortalama ...:" + ortalama);


        int enkucukSayi= sayilar[0];

        for (int i=1; i< sayilar.length; i++){
            if(enkucukSayi>sayilar[i])
                enkucukSayi=sayilar[i];
        }
        System.out.println("En küçük sayi...:"+ enkucukSayi);


        int enbuyukSayi = sayilar[0];

        for (int i=1; i<sayilar.length ; i++){
            if (enbuyukSayi<sayilar[i])
                enbuyukSayi= sayilar[i];
        }
        System.out.println("En büyük sayi....:" + enbuyukSayi);

    }
}
