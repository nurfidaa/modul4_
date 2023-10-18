package ProjectPoint;

public class Point {
    protected float x,y;
    // Konstruktor kelas Induk
    public Point(float a, float b)
    {
        System.out.println("Konstruktor Point dijalankan ");
        x = a;
        y = b;
    }
    // Method kelas Induk
    public void cetakPoint() // akan di-redefinisi di kelas anak
    {
        System.out.println("Point : ["+x+", "+y+"]");
    }
}
