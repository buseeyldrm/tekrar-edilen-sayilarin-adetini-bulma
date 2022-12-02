import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] dizi={10,20,10,5,7,3,7,20};

        int [] frekans=new int[dizi.length];

        for (int i = 0; i < dizi.length ; i++) {
            frekans[i]=1;
            }

        for (int i = 0; i < dizi.length ; i++) {
            for (int j = 0; j < dizi.length ; j++) {
                if ((i!=j)&& (dizi[i]==dizi[j])){
                    frekans[i]++;
            }
        }
        }
        System.out.println("TEKRAR EDEN SAYILAR: ");
        for (int i = 0; i < dizi.length ; i++) {
            if (i != 0)
                System.out.println(dizi[i] + " sayısı " + frekans[i] + " kere tekrar edildi.");
        }}}

