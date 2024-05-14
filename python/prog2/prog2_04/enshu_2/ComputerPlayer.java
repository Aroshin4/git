// 演習問題2: じゃんけんクラスの作成 ComputerPlayer.java
// コンピュータプレーヤを表すサブクラスComputerPlayer
import java.util.Random;

class ComputerPlayer extends JankenPlayer{
    private String name;
    public  ComputerPlayer(String a){
        name = a ;
    }
    @Override public String name(){
        return name;
    }
    @Override public int hand(){
        Random s = new Random();
        int comp = s.nextInt(3);
        return comp;
    }
}
