// 課題: 三角形クラス Triangle.java

public class Triangle {
    private double a;
    private double b;
    private double c;
    public  Triangle (double aa,double bb,double cc){
        a=aa;
        b=bb;
        c=cc;
    }
    public Triangle(double aa,double bb){
        a=b=aa; 
        c=bb;
    }
    public Triangle(double aa){
        a=b=c=aa;
    }
    public String toString(){
        return " a="+a+" b="+b+" c="+c;
    }
    public  boolean isIsoscales(){
        if((a+b)>c&&(b+c)>a&&(c+a)>b&&a==b){
        return true;
        }else{
            return false;
        }
    }
    public boolean isEquilateral(){
        if(a==b&&b==c){
            return true;
        }else{
            return false;
        }
    }
    public boolean isInequality(){
        if((a+b)>c&&(b+c)>a&&(c+a)>b){
            return true;
        }else{
            return false;
        }
    }
    public boolean isEqual(Triangle t){
        if(t.a==a&&t.b==b&&t.c==c){
        return true;
        }else{
            return false;
        }
    }
}


