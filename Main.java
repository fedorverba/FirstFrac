import java.util.Scanner;

/**
 * Created by Fedor on 08.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Frac d1 = new Frac(sc.nextInt(), sc.nextInt());
        Frac d2 = new Frac(sc.nextInt(), sc.nextInt());
        System.out.println(d1.mult(d2).makeShort().toString());
        Frac d3 = new Frac(sc.nextInt());
        Frac d4 = new Frac(sc.nextInt());
        Frac d5 = new Frac();
        Frac d6 = new Frac();
        System.out.println(d1.sum(d2).toString() + " " + d3.sum(d4).toString() + " " + d5.sum(d6).toString());
        System.out.println(d1.sum(sc.nextInt()).toString() + " " + d3.sum(sc.nextInt()).toString() + " " + d5.sum(sc.nextInt()).toString());
        System.out.println("");
        System.out.println(d1.mult(d2).toString() + " " + d3.mult(d4).toString() + " " + d5.mult(d6).toString());
        System.out.println(d1.mult(sc.nextInt()).toString() + " " + d3.mult(sc.nextInt()).toString() + " " + d5.mult(sc.nextInt()).toString());
        System.out.println("");
        System.out.println(d1.div(d2).toString() + " " + d3.div(d4).toString() + " " + d5.div(d6).toString());
        System.out.println(d1.div(sc.nextInt()).toString() + " " + d3.div(sc.nextInt()).toString() + " " + d5.div(sc.nextInt()).toString());
        System.out.println("");
        System.out.println(d1.inverse().toString() + " " + d2.inverse().toString() + " " + d3.inverse().toString() + " " + d4.inverse().toString() + " " + d5.inverse().toString() + " " + d6.inverse().toString());
        System.out.println("");
        System.out.println(d1.isDenumeratorZero() + " " + d2.isDenumeratorZero() + " " + d3.isDenumeratorZero() + " " + d4.isDenumeratorZero() + " " + d5.isDenumeratorZero() + " " + d6.isDenumeratorZero());
        System.out.println("");
        System.out.println(d1.isShorten() + " " + d2.isShorten() + " " + d3.isShorten() + " " + d4.isShorten() + " " + d5.isShorten() + " " + d6.isShorten());
        System.out.println("");
        System.out.println(d1.makeShort().toString() + " " + d2.makeShort().toString() + " " + d3.makeShort().toString() + " " + d4.makeShort().toString() + " " + d5.makeShort().toString() + " " + d6.makeShort().toString());
        System.out.println("");
        System.out.println(d1.isEqual(d2) + " " + d3.isEqual(d4) + " " + d5.isEqual(d6));
        System.out.println("");
        System.out.println(d1.compareTo(d2) + " " + d3.compareTo(d4) + " " + d5.compareTo(d6));
        System.out.println("");

    }
}
