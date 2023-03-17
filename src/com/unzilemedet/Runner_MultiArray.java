package com.unzilemedet;

public class Runner_MultiArray { // Çok Boyutlu Diziler
    public static void main(String[] args) {

        int[] sayiDizisi = new int[5]; //{0,0,0,0,0}
        int[][] matris = new int[5][5]; //  { {0,0,0,0,0}  , {34,0,0,0,0} , {0,0,0,0,0} , {0,0,0,0,0} , {0,0,0,0,0} }

        matris[3][2] = 19 ;
        matris[1][0] = 34 ; //  [satır][sütun]

        System.out.println(matris[3][2]);
        System.out.println(matris[1][0]);

        // {{1 , OKL1 , Ali , Kuş}  , {2 , OKL2 , Ala , Kurt}  , {3 , OKL3 , Ayşe , Kum}   }

        String[][] sinifListesi = new String[3][4];
        //  1  OKL1  Ali  Kuş
        sinifListesi[0][0] = " 1 " ;
        sinifListesi[0][1] = " OKL1 " ;
        sinifListesi[0][2] = " Ali " ;
        sinifListesi[0][3] = " Kuş " ;

        //  2  OKL2  Ala  Kurt
        sinifListesi[1][0] = " 2";
        sinifListesi[1][1] = " OKL2 ";
        sinifListesi[1][2] = " Ala";
        sinifListesi[1][3] = " Kurt";

        //  3  OKL3  Ayşe  Kum
        sinifListesi[2][0] = " 3 ";
        sinifListesi[2][1] = " OKL3";
        sinifListesi[2][2] = " Ayşe";
        sinifListesi[2][3] = " Kum";

     for (int i=0; i < sinifListesi.length; i++)
         for (int j=0; j < sinifListesi[i].length ; j++)
             System.out.println(sinifListesi[i][j]);


    }
}














