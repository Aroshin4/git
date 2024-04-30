// 課題: 2～16進数表示に対応した整数クラス BinHexVal.java
// 課題: 2～16進数表示に対応した整数クラス BinHexVal.java
public class BinHexVal{
    private  static int  base = 10;
    private  int value;
    public static void setBase(int a){
        if(a>=2&&a<=16){
            base = a ;
        }
    }
    public int getBase(){
        return base;
    }
    public  BinHexVal(int a){
        if(a>0){
            value=a;
        }
    }
    public int getValue() {
        return value;
    }
    public void setValue(int a) {
        value = a;
    }
    public String toString(){
        String s = "";
        int v =value;
        do{
            int r = v % base;
            if (r>=10){
                s=(char)('A'+(r-10))+s;
            }else{
                s=r+s;
            }
            v/=base;
        }while(v>0);
        return s;
    }
}
