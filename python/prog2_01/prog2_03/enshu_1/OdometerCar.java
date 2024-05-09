// 演習問題1 自動車クラスの拡張 OdometerCar.java
class OdometerCar extends Car{
    private double Odometer = 0;
    public OdometerCar(String name, int width, int height, int length, double fuel, Day purchaseDay,double Odometer) {
        super(name, width, height, length, fuel,purchaseDay);
        this.Odometer=Odometer;
    }
    public   boolean move(double x,double y){
        if(super.move(x,y)==true){
            Odometer += Math.sqrt(x * x + y * y);
            System.out.println("現在のx座標"+getX());
            System.out.println("現在のy座標"+getY());
            System.out.println("総移動距離"+getOdometer());
            return true;
        }else{
            System.out.println("燃料が無くなりました");
            System.exit(0);
            return false;
        }

    }
public double getOdometer(){
    return Odometer;
}
}