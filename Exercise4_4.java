/*Ad: Abdulkadir
Soyad: Demir
Öğrenci no: 240541007
 */



public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber();
        //Derleyici herhangi bir hata vermiyor.

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);
        // Bu satır derlenmedi.Çünkü sayHello() bir değer döndürmedi, void bir ifadeyi başka bir işlem içinde kullanamayız. Derleyici "void type not allowed here" hatası veriyor.
    

        // Cevaplarinizi yorum olarak ekleyin.
    }
}
