import javax.swing.InputMap;
import java.util.Scanner;
public class Menu{
    public static void main(String[]args){
        int p=0;
        String nama="",jk,input;
        
        Scanner sc = new Scanner(System.in);
    
        do{
            System.out.println("1. Input Data ");
            System.out.println("2. Keluar ");
            switch(p){
                case 1 : {
                    do{
                        System.out.println("1. Nama : ");
                        nama = sc.next();
                        System.out.println("1. Jenis Kelamin ");
                        jk = sc.next();
                        System.out.println("1. Input Lagi (Ya/Tidak) ");
                        input = sc.next();
                    }while (input.equalsIgnoreCase("Ya"));
                    
                    break;
                }
                case 2 :{
                        System.out.println("Terima kasih");
                }
            }
                 p = sc.nextInt();
             }while(p<=2 && p>0);
    }
}
    
            
    
