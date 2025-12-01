/*
 * Ad Soyad: [ABDULKADİR DEMİR]
 * Ogrenci No: [240541007]
 * Tarih: [01.12.2025]
 * Aciklama:4.3 tamamlandı
 *
 *
 */


//1)ping metodu ilk kez ¸ca˘grıldı˘gında programın durumunu g¨osteren bir stack diyagramı ¸cizin. (C¸a˘grı yı˘gını, aktif metotlar, parametreler ve yerel de˘gi¸skenler)
/*answer) +---------------------------+
| ping()                    |  ← Şu an çalışan metot
| (parametre yok)           |
+---------------------------+
| baffle()                  |  ← ping'i çağırdı
| (parametre yok)           | 
| local: yok                |
+---------------------------+
| zoop()                    |  ← baffle'ı çağırdı
| (parametre yok)           |
| local: yok                |
+---------------------------+
| main()                    |
|parametre: (String[] args) |  ← program buradan başladı
| local değişken: yok       |
+---------------------------+*/

//2)A¸sa˘gıdaki programın ¨uretti˘gi tam ¸cıktıyı yazın. Bo¸sluklara, noktalara ve satır sonlarına dikkat edin.
/*  No, I wug.
    You wugga wug.
    I wug.*/




public class Exercise4_3 {

    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        baffle();
    }

    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }

    public static void baffle() {
        System.out.print("wug");
        ping();
    }

    public static void ping() {
        System.out.println(".");
    }
}
