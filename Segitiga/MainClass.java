import java.util.Scanner;
public class MainClass{
    public static void main(String[]args){
        int alas,tinggi; //komen
        java.util.Scanner sc = new Scanner(System.in);
        Segitiga Ls= new Segitiga();
        System.out.println("Berapa  Alas ");
        alas = sc.nextInt();
        System.out.println("Berapa  Tinggi ");
        tinggi = sc.nextInt();
        Ls.setAlas(alas);
        Ls.setTinggi(tinggi);
        Ls.getRumus();
        System.out.println("Hasil Luas " +Ls.getLuas());
       

        
    }
}