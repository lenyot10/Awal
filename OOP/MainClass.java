public class MainClass{
    public static void main(String[]args){
       /* Mobil honda = new Mobil();
        honda.setKecepatan(0);//set velue by method
        System.out.println(honda.getKecepatan());
        
        honda.kecepatan= 20; // set default value

        System.out.println(honda.getKecepatan());

        honda.tambahKecepatan(50);

        System.out.println(honda.getKecepatan());
        */
        Mobil ns = new Mobil();
        ns.setKecepatan(10);
       // ns.tambahKecepatan(ns.getKecepatan());
        ns.tambahKecepatan(50);
        System.out.println(ns.getKecepatan());
    }
}