/*
 * Ad Soyad: Mehmet Furkan AKYAR
 * Ogrenci No: 240541056
 * Tarih: 12/4/2025
 */

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
// Kodun çalışma sırası:
// 1.main başlar.
// 2.main içinde zoop() çağrılır.
// 3.zoop içinde ilk satırda baffle() çağrılır.
// 4.baffle içinde ping() çağrılır (Bu, ping'in ilk çağrılışıdır).

/* Stack Diyagramı:
+-------------------------------+
|  ping                         | <--- En Üst (Şu an çalışan metot)
|  (Parametre veya değişken yok)|
+-------------------------------+
|  baffle                       |
|  (Parametre veya değişken yok)|
+-------------------------------+
|  zoop                         |
|  (Parametre veya değişken yok)|
+-------------------------------+
|  main                         | <--- En Alt (Programın başladığı yer)
|  args: [String dizisi]        |
+-------------------------------+ */


/* Programın Tam Çıktısı
No, I wug.
You wugga wug.
I wug. */
