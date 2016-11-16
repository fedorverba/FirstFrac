/**
 * Created by Fedor on 08.11.2016.
 */
public class Frac {
    int a, b;
    Frac(int a, int b){
        this.a=a;
        this.b=b;
    }
    Frac(int a){
        this.a=a;
        this.b=1;
    }
    Frac(){
        this.a=0;
        this.b=1;
    }
    Frac sum (Frac d2) {
        return new Frac(this.a * d2.b + d2.a * this.b,
                this.b * d2.b);
    }
    Frac sum (int x) {
        Frac d2=new Frac(x);
        return new Frac(this.a * d2.b + d2.a * this.b,
                this.b * d2.b);
    }
    Frac mult (Frac d2){
        return new Frac(this.a*d2.a, this.b*d2.b);
    }
    Frac mult (int x){
        Frac d2=new Frac(x);
        return new Frac(this.a*d2.a, this.b*d2.b);
    }
    Frac div (Frac d2){
        return new Frac(this.a*d2.b,this.b*d2.a);
    }
    Frac div (int x){
        Frac d2=new Frac(x);
        return new Frac(this.a*d2.b,this.b*d2.a);
    }
    Frac inverse(){
        return new Frac(this.b,this.a);
    }
    boolean isDenumeratorZero(){
        boolean x=false;
        if (this.a==0) x=true;
        return x;
    }
    boolean isShorten(){
        int cifra=1;
        for (int i=2;i<=a;i++){
            if (a%i==0&&b%i==0&&i>cifra) return true;
        }
        return false;
    }
    Frac makeShort(){
        int cifra=1;
        for (int i=2;i<=a;i++){
            if (a%i==0&&b%i==0&&i>cifra) cifra=i;
        }
        return new Frac(a/cifra,b/cifra);
    }
    boolean isEqual(Frac a){
        Frac x=new Frac(this.a, this.b);
        Frac y=a.makeShort();
        x=x.makeShort();
        if (x.a==y.a&&x.b==y.b) return true;
        return false;
    }
    int compareTo(Frac a){
        Frac x=new Frac(this.a, this.b);
        Frac y=a.makeShort();
        x=x.makeShort();
        if (x.isEqual(y)) return 0;
        if (x.a>y.a&&x.b==y.b) return 1;
        if (x.b>y.b||x.b<y.b){
            int f=x.b;
            x=new Frac (x.a*y.b, x.b*y.b);
            y=new Frac (y.a*f, x.b);
            if (x.a>y.a) return 1;
        }
        return -1;
    }
    public String toString(){
        return a+"/"+b;
    }
}
