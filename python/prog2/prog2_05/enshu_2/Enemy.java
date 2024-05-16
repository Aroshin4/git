// Enemyクラス (Characterクラスの派生クラス)
import java.util.Random;

public class Enemy extends Character implements Fighter{
    private Random rnd;
    
    // コンストラクタ
    Enemy(String name){
	this.name = name;
	rnd = new Random();
	// インスタンス生成時にステータスを（ランダムに）調整
	hitPoint = 500 + rnd.nextInt(100);
	power = 70 + rnd.nextInt(20);
    }
    
    public void attack(Character target){
	System.out.println(name + " が " + target.getName() + " に襲い掛かる!!");
	target.damage(power);
    }
    
    public void damage(int dp){
		if(dp>0){
	System.out.println(name + " は " + dp + " のダメージを受けた!!");
	hitPoint -= dp; // 攻撃力分をhpから減算
		}else{
			System.out.println(name + " は " + -dp + " のダメージを回復した!!");
			hitPoint -= dp; 
		}
	if( hitPoint < 0 ) hitPoint = 0;
    }
}
