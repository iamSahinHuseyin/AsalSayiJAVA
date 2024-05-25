//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //asal sayi bulmak için metodumuz
    //asal sayı kendisi ve 1 dışında böleni olmayan sayıdır.
    public static boolean asalSayi(int sayi){
        for(int i=2;i<sayi;i++){
            //eğer sayının böleni varsa asal değildir
            //bu yüzden FALSE değeri döner.
            if(sayi % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        //1000 e kadar olan sayıları ekrana yazdıralım
        for(int i=2;i<1000;i++){
            //asal sayi ise TRUE döndürmesi gereklidir.
            if(asalSayi(i)){
                System.out.println(i + " = Asal sayıdır.");
            }
            else{
                System.out.println(i + " = Asal sayı DEĞİLDİR.");
            }
        }
    }
}