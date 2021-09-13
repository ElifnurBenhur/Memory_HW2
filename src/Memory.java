/*
 * HMB STAJ M�N� PROJE 2
 * Bu program java dilinde heap,stack ve static memory
 * kullan�mlar�n� g�stermek amac�yla haz�rlanm��t�r.
 *
 * Memory Class; Bu s�n�f static de�i�kenlerin haf�zada ki kullan�m�n�
 * ve di�er de�i�kenlerden fark�n� g�stermek i�in gerekli de�i�kenleri
 * tan�mlar ve ba�lat�r.
 *
 *  @author ElifnurBenh�r
 */
public class Memory {
    /*
     * @param objectCount integer t�r�nde statik bir de�i�kendir.
     */
    private static int objectCount=0;
    /*
     * @param oCount integer t�r�nde  bir de�i�kendir.
     */
    private int oCount;
    /*
     * Kod blo�u,
     * @param objectCount de�eri bir artt�r�l�r.
     * @param objectCount statik bir de�i�ken oldu�u i�in
     * @param oCount aksine "stack memory" de de�il "non-heap memory"
     * 'nin Permagen k�sm�nda tutulur.
     * Dolay�s�yla bu s�n�ftan her obje �rne�i yarat�l���nda
     * de�eri bir artar. Yani Memory s�n�f�ndan ka� obje yarat�ld���n�n
     * say�s�n� verir.
     */
    {
        objectCount+=1;
    }
    /*
     * @param oCount de�i�keni "Constructor" taraf�ndan ba�lat�larak
     * 0 de�eri atan�r. Sonras�nda de�eri bir artt�r�l�r. B�ylece
     * Memory t�r�nde bir obje olu�turuldu�u zaman
     * @param oCount 1 de�erini tutar. Ancak "stack memory" de
     * tutuldu�u i�in her yeni obje yarat�l���nda bu obje yeniden
     * tan�mlan�r ve sonu� olarak hep 1 de�erini tutar.
     *
     */
    public Memory() {
        super();
        this.oCount=0;
        oCount++;
    }

    public void finalize() {
        try {
            super.finalize();
        }
        catch(Throwable t) {
            System.out.println("Bir istisna olu�tu!");
        }
    }

    /*
     * @param objectCount i�in "getter" methodu bu private de�i�kenin
     * de�erini alabilmemizi sa�lar yani
     * @return objectCount de�i�keninin tuttu�u de�eri d�nd�r�r.
     *
     */
    public static int getObjectCount() {
        return objectCount;
    }
    /*
     * @param objectCount i�in "setter" methodu bu private de�i�kene
     * i�ine g�nderdi�imiz de�eri atayabilmemizi  sa�lar.
     */
    public static void setObjectCount(int objectCount) {
        Memory.objectCount = objectCount;
    }
    /*
     * @param oCount i�in "getter" methodu bu private de�i�kenin
     * de�erini alabilmemizi sa�lar yani
     * @return oCount de�i�keninin tuttu�u de�eri d�nd�r�r.
     *
     */
    public int getoCount() {
        return oCount;
    }
    /*
     * @param oCount i�in "setter" methodu bu private de�i�kene
     * i�ine g�nderdi�imiz de�eri atayabilmemizi  sa�lar.
     */
    public void setoCount(int oCount) {
        this.oCount = oCount;
    }



}

