import java.util.Scanner;

import org.w3c.dom.css.Counter;
public class Latihan1{
    public static void main(String[]args){
        String Nama ="";
        double Ipk =4;
        double Ratarata=2.67;
        int eror = -999;
        double JumlahN= 0 ;
        int Counter = 0;
        int Lulus = 0;
        int TidakL = 0;
        double NilaiRatarata = 0;
        Scanner Input = new Scanner(System.in);
        do{
            Ipk = Input.nextDouble();
            if( Ipk >= 0 &&  Ipk <= 4 ){
                Counter= Counter + 1;
                JumlahN = JumlahN + Ipk;//Ipk nya nilai sementara
                if( Ipk >= Ratarata){
                    Lulus++;
                }
                if(Ipk <= Ratarata){
                    TidakL++;
                }
            }
            
         
      } while (Ipk != eror);
      NilaiRatarata = JumlahN / Counter; 
      System.out.println("Banyak Mahasiswa"+Counter);
      System.out.println("Banyak Siswa Yang lulus "+Lulus);
      System.out.println("Banyak Siswa yang tidak Lulus "+TidakL);
      System.out.println("Total Nilai "+ JumlahN);
      System.out.println("Nilai Rata Rata "+NilaiRatarata);
    }
 
}