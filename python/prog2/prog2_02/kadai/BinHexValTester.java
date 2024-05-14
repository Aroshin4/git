// 2～16進数表示に対応した整数クラス BinHexValTester.java
public class BinHexValTester {
    public static void main(String[] args) {
        BinHexVal[] var = new BinHexVal[4];
        var[0] = new BinHexVal(4);
        var[1] = new BinHexVal(13);
        var[2] = new BinHexVal(49);
        var[3] = new BinHexVal(100);
        BinHexVal.setBase(2); // 2進数表示に
        System.out.println( BinHexVal.getBase()+"進数");
        System.out.println( var[0].toString());
        System.out.println( var[1].toString());
        System.out.println( var[2].toString());
        System.out.println( var[3].toString());
        BinHexVal.setBase(8); // 8進数表示に
        System.out.println( BinHexVal.getBase()+"進数");
        System.out.println( var[0].toString());
        System.out.println( var[1].toString());
        System.out.println( var[2].toString());
        System.out.println( var[3].toString());
        BinHexVal.setBase(10);
        System.out.println( BinHexVal.getBase()+"進数");
        System.out.println( var[0].toString());
        System.out.println( var[1].toString());
        System.out.println( var[2].toString());
        System.out.println( var[3].toString());
        BinHexVal.setBase(16); // 16進数表示に
        System.out.println( BinHexVal.getBase()+"進数");
        System.out.println( var[0].toString());
        System.out.println( var[1].toString());
        System.out.println( var[2].toString());
        System.out.println( var[3].toString());
    }
}
