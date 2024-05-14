// 演習問題1: 図形クラス群の拡張 UpperSemicircle.java
class UpperSemicircle extends Semicircle{
    public UpperSemicircle(double radius){
        super(radius);
    }
    @Override public String toString() {
        return "(UpperSemicircle(radius:" + getRadius() + ")"; 
    }
    public void draw() { 
        for(int i = 0; i < 21; i++ ){
            for(int j = 0; j < 21 ; j++){
                if((Math.sqrt(((i-20)*(i-20))+((j-10)*(j-10))))<=getRadius()){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    }
}
