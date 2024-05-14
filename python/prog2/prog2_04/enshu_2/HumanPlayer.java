// 演習問題2: じゃんけんクラスの作成 HumanPlayer.java
// 人間プレーヤを表すサブクラスHumanPlayer
import java.util.Scanner;

class HumanPlayer extends JankenPlayer{
    private String name;
    public  HumanPlayer(String a){
        name = a ;
    }
    @Override public String name(){
        return name;
    }
    @Override public int hand(){
        Scanner s = new Scanner(System.in);
        int human = s.nextInt();
        return human;
    }
}
