// 演習2: MinMaxクラスの作成 MinMax.java
public class MinMax{
    public static int Max(int x,int y){
        if(x<=y){
            return y;
        }else{
            return x;
        }
    }
    public static int Max(int x,int y,int z){
        if(x>=y&&x>=z){
            return x;
        }
        if(y>=x&&y>=z){
            return y;
        }else{
            return z;}
    }
    public static int Max(int b[] ){
        int max =b[0];
        for(int i = 0;i < b.length-1;i++){
            if(max<=b[i+1]){
            max=b[i+1];
            }
        }
        return max;
    }
    public static int Min(int x,int y){
        if(x>=y){
            return y;
        }else{
            return x;
        }
    }
    public static int Min(int x,int y,int z){
        if(x<=y&&x<=z){
            return x;
        }
        if(y<=x&&y<=z){
            return y;
        }else{
            return z;
        }
    }
    public static int Min(int b[] ){
        int min=b[0];
        for(int i = 0;i < b.length-1;i++){
            if(min>=b[i+1]){
            min=b[i+1];
            }
        }
        return min;
    }
    }





