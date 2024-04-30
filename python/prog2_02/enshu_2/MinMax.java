// 演習2: MinMaxクラスの作成 MinMax.java
// 演習2: MinMaxクラスの作成 MinMax.java
public class MinMax{
    private int a;
    public int Max(int x,int y){
        if(x<=y){
            a=y;
        }else{
            a=x;
        }
        return a;
    }
    public int Max(int x,int y,int z){
        if(x>=y&&x>=z){
            a=x;
        }
        if(y>=x&&y>=z){
            a=y;
        }
        if(z>=y&&z>=x){
            a=z;
        }
        return a;
    }
    public int Max(int b[] ){
        a=b[0];
        for(int i = 0;i < b.length-1;i++){
            if(a<=b[i+1]){
            a=b[i+1];
            }
        }
        return a;
    }
    public int Min(int x,int y){
        if(x>=y){
            a=y;
        }else{
            a=x;
        }
        return a;
    }
    public int Min(int x,int y,int z){
        if(x<=y&&x<=z){
            a=x;
        }
        if(y<=x&&y<=z){
            a=y;
        }
        if(z<=y&&z<=x){
            a=z;
        }
        return a;
    }
    public int Min(int b[] ){
        a=b[0];
        for(int i = 0;i < b.length-1;i++){
            if(a>=b[i+1]){
            a=b[i+1];
            }
        }
        return a;
    }
    }





