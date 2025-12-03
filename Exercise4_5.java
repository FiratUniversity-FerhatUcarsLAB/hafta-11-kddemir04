/*Ad: Abdulkadir
Soyad: Demir
Numara: 240541007
Tarih: 3.12.2025
*/





//Stack diyagramı:
//--------------------------------------
//| zoop("breakfast ", 4)             |  ← En üstte (aktif olan)
//|  • parametre fred = "breakfast "  |
//|  • parametre bob = 4              |
//|  yerel değişken yok
//--------------------------------------
//| clink(4)                          |
//|  • parametre fork = 4             |
//|  yerel değişken yok               |
//--------------------------------------
//| main                              |
//|  yerel değişkenler:               |
//|  • bizz = 5                       |
//|  • buzz = 2                       |
//|  parametre : String[] args        |
//--------------------------------------

//Tam çıktı:
//just for
//any not  more 
//It’s breakfast 
//!











public class Exercise4_5 {

    public static void zoop(String fred, int bob) {
        System.out.println(fred);
        if (bob == 5) {
            ping("not ");
        } else {
            System.out.println("!");
        }
    }

    public static void main(String[] args) {
        int bizz = 5;
        int buzz = 2;
        zoop("just for", bizz);
        clink(2 * buzz);
    }

    public static void clink(int fork) {
        System.out.print("It's ");
        zoop("breakfast ", fork);
    }

    public static void ping(String strangStrung) {
        System.out.println("any " + strangStrung + "more ");
    }
}
