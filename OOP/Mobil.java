class Mobil{
    String merek;
    int kecepatan;

    //ini method setther
    public void setKecepatan(int kecepatan){
        this.kecepatan = kecepatan;
}
    // ini method gether
    public int getKecepatan(){ //function parameter
        return this.kecepatan;
    }
    public int tambahKecepatan(int kecepatan){
        int hitungkecepatan = this.kecepatan + kecepatan;
        return this.kecepatan = hitungkecepatan;
    }
}