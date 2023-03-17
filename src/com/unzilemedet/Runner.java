package com.unzilemedet;

public class Runner {
    public static void main(String[] args) {

        // jagged arrays -> çoklu dizilerde farklı boyutlar alabilen diziler var
        // tam sayı dizisi -> {1, 34, -90 ,433,42}
        // metin dizisi -> {Ahmet , Ayşe , Turan ,Kemal, Bahadır}
        // tam sayıları ifade eden değişken -> byte, short, int , long
        // dizi değişkeni tanımlamak . []
        long[] longdizisi ;//long [] longdizisi2;    long longdizisi3[];

        // Dizileri başlatmadan (initialize) kullanamazsınız. istisna fırlatır.
        int diziBoyutu = 200 ;
        longdizisi = new long[diziBoyutu]; //{0,0,0,.......0}

        // bir dizinin elemanına değer atamak
        longdizisi[2]=5; // index no {0,0,5,0,0,0,0}
        //dizinin bir elemanının değerini okumamamk
        int sayi2= 6;
      //  System.out.println(sayi2);


        System.out.println(longdizisi[0]);
        System.out.println(longdizisi[1]);
        System.out.println(longdizisi[2]);
        System.out.println(longdizisi[3]);
        System.out.println(longdizisi[4]);
        System.out.println(longdizisi[5]);
        System.out.println(longdizisi[6]);
       // System.out.println(longdizisi[7]); hata verir boyutu geçtiği için
       // System.out.println(longdizisi[8]);

        System.out.print("Dizi....:{");
            for(int i=0 ; i < diziBoyutu ; i++){
                   System.out.print(longdizisi[1] + ((i == (diziBoyutu-1)) ? " " : ","));
                 }
               System.out.println("}");


          // alternatif
        System.out.print("Dizi....:{");
              for(int i=0 ; i < longdizisi.length ; i++){
                  System.out.print(longdizisi[i] + ",");
                      }
              System.out.print("}");

              // nelerden dizi yapabiliriz
             long[] longdizi;
             int[] intdizi;
             String[] stringdizi;
             boolean[] booleandizi; // hobileriniz nelerdir? -> gmail de mail listesi silme yapacaksın örn


    }
}













