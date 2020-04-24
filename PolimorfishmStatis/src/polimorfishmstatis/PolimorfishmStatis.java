package polimorfishmstatis;

public class PolimorfishmStatis {
    
    public static void main(String[] args) {
        
       Persegi a = new Persegi(10,5);
        System.out.println(a.getLuas()); // 50
        System.out.println(a.getLuas(12)); // 60
        System.out.println(a.getLuas(15, 5)); // 75
    }
    
}
