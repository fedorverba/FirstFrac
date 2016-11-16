import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Frac f1=new Frac(sc.nextInt(),sc.nextInt());
        Frac f2=new Frac(sc.nextInt(),sc.nextInt());
        System.out.println(f1.compareTo(f2));
    }
}