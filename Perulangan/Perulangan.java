public class Perulangan{
    public static void main(String[]args){
      //loping for yang sudah diketahui jumlah loopingnya
     /* for(int i = 0; i<= 5; ++i){
        System.out.println("Heloo "+ 1);
        }
        */
        //while belum mengetahui kondisi perulangannya
        // kalau tidak memenuhi kondisinya tidak berjalan contoh jnya 8
        int j = 0;
        while( j < 5){
            System.out.println("hello "+ j++);
            //atau bisa j++;
        }
        //kalau tidak memenuhi kondisinya akan tercetak 1
        int n = 0;
        do{
            System.out.println("hello do while "+ j++);
    }while(n<5);
}
}