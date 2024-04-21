// 課題: 三角形クラス Triangle.java

public class Triangle {

private double a;
private double b;
private double c;
public Triangle (double aa,double bb,double cc){
    if((aa+bb)>cc&&(bb+cc)>aa&&(cc+aa)>bb){
       a=aa;
       b=bb;
       c=cc;
       }else{
        return false
       }
}
public Triangele(double aa,double bb){
    if ((2*aa)>bb){
       a=b=aa; 
       c=bb;
    }else{
        return false
    }
}
public Trinangle(double aa){
    a=b=c=aa;
}
public String toString(){
    return "a="+a+"b="+b+"c="+c;
}
public static boolean isIsoscales(){
    return a==b&&
}
}
