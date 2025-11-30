public class Exercise4_2 {

  // Her satirin sonuna calisma sirasi yorumlarini ekleyin.
  //baffle metodu ilk ¸ca˘grıldı˘gında blimp parametresinin de˘geri nedir? rattle
  //Programın ¨uretti˘gi t¨um ¸cıktıyı yazınız. Bo¸sluklar ve satır sonları birebir do˘gru olmalıdır.
  
  //ik
  //rattle
  //ping zoop
  //boo-wa-ha-ha

  //Hangi satırlar birden fazla kez ¸calı¸smı¸stır? Satır numaralarını listeleyin
  //24

    public static void main(String[] args) { //1
        zippo("rattle", 13); //2
    }

    public static void baffle(String blimp) { //7
        System.out.println(blimp); //8
        zippo("ping", -5);  //9
    }

    public static void zippo(String quince, int flag) { //3, 10
        if (flag < 0) {  //11
            System.out.println(quince + " zoop"); //12
        } else {  //4
            System.out.println("ik");  //5
            baffle(quince);  //6
            System.out.println("boo-wa-ha-ha");//13
        }
    }
}
