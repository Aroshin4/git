// 演習問題1: 図形クラス群の拡張 RightSemicircle.java
class RightSemicircle extends Semicircle{
    public RightSemicircle(double radius){
        super(radius);
    }
    @Override public String toString() {
		return "RightSemicircle(radius:" + getRadius() + ")"; 
	}
    public void draw() { 
        for(int i = 0; i < 21; i++ ){
            for(int j = 0; j < 11 ; j++){
                if((Math.sqrt(((i-10)*(i-10))+(j*j)))<=getRadius()){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}