// 演習問題1 自動車クラスの拡張 OdometerCar.java
 class OdometerCar extends Car{
    private double Odometer = 0;
    public OdometerCar(String name, int width, int height, int length, double fuel, Day purchaseDay,double Odometer) {
        super(name, width, height, length, fuel,purchaseDay);
        this.Odometer=Odometer;
    }
    public void setOdometer(double x,double y){
        if(move(x,y)==true){
            move(x,y);
            Odometer=Math.pow((Math.pow(x,2)+Math.pow(y,2)),(1/2));
        }else{
            System.out.println("燃料が無くなりました");
        }

    }
public double getOdometer(){
    return Odometer;
}
     

}

