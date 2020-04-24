package polimorfishmstatis;

public class Persegi {
   private double panjang;
   private double lebar;
   
   public Persegi(double panjang, double lebar){
       this.panjang = panjang;
       this.lebar = lebar;
   }
   
   public double getLuas(){
       return this.panjang * this.lebar;
   }
   public double getLuas(double panjang){
       return panjang * this.lebar;
   }
   public double getLuas(double panjang, double lebar){
       return panjang * lebar;
   }
}
