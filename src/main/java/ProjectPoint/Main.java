package ProjectPoint;
public class Main {
    public static void main( String args[] )
    {
// Membuat instans dari kelas anak dan memanggil method yang dimilikinya
        Circle circle1=new Circle(6.5f, 8.2f, 1.9f);
        circle1.cetakPoint();
        System.out.println(" ");
        Circle circle2=new Circle (10, 5, 5);
        circle2.cetakPoint();
    }
}