import java.util.*;
public class Test {
    public static void main(String[] args) {
        /*
         * @param x  primitive t�rde bir de�i�kendir.
         * Bu de�i�ken "stack memory" kapsam�nda 5 de�erini tutar.
         *
         */
        int x=5;
        /*
         * "new" anahtar kelimesi "heap memory" de
         * 5 de�eri ile ba�lat�lm�� bir integer objesi yarat�r.
         * bir obje yarat�r ve
         * @param i olu�turulan objenin adresini
         * "stack memory" de tutar.
         */
        Integer i=new Integer(5);
        /*
         * Devam eden kod, new anahtar kelimesi ile �� adet
         * @see Memory objesi yarat�r.
         */
        Memory m1=new Memory();
        Memory m2=new Memory();
        Memory m3=new Memory();
        /*
         * Devam eden kod, m3 objesinin
         * @param objectCount ve @param oCount
         * de�i�kenlerinin tuttu�u de�erleri yazd�r�r.
         */
        System.out.println(""+m3.getObjectCount()+" "+m3.getoCount());
        /*
         * "Garbage Collector" 'u �a��r�r. B�ylelikle m3 objesi
         * "heap memory" den silinmi� olur.
         */
        m3.finalize();
        /*
         * Devam eden kod, m3 objesinin
         * @param objectCount ve @param oCount
         * de�i�kenlerinin tuttu�u de�erleri yazd�r�r.
         * m3 objesi "heap" memory den silindi�i halde
         *  @parameter objectCount statik bir de�i�ken oldu�u ve
         *  haf�zada ba�ka bir k�s�mda tutuldu�u i�in hala
         *  3 de�erini tutar.
         */
        System.out.println(""+m2.getObjectCount());
    }
}
