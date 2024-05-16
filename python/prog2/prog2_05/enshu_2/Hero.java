// Heroクラス (Characterクラスの派生クラス)
import java.util.Random;

public class Hero extends Character implements Fighter,Wizard{
    private Random rnd;
    
    // コンストラクタ
    Hero(String name){
	rnd = new Random();  // 乱数生成用のインスタンスを初期化
	this.name = name;
	// インスタンス生成時にステータスを（ランダムに）調整
	hitPoint = 400 + rnd.nextInt(100);
	power = 60 + rnd.nextInt(30);
    }

    // Heroクラスの攻撃メソッドを実装
    @Override
    public void attack(Character target){
	if( rnd.nextInt(5) == 1){ // 0～4の乱数を生成（確率は調整してよい)
	    System.out.println(name + " が " + target.getName() + " の急所を攻撃!!");
	    target.damage( (int) (1.5 * power));
	}
	else{ // 普通の攻撃
	    System.out.println(name + " が " + target.getName() + " に攻撃!!");
	    target.damage(power);
	}
    }
    @Override
    public void fire(Character target){
	if(rnd.nextInt(6) == 1){ // 0～4の乱数を生成（確率は調整してよい)
	    System.out.println(name + " が " + target.getName() + " の急所を魔法攻撃!!");
	    target.damage( (int) (3 * power));
	}
	else if(rnd.nextInt(6) == 2||rnd.nextInt(5) == 3){  //暴発
	    System.out.println(name + " の魔法攻撃が暴発!! " );
	    target.damage(-1*power*2);
	}else{                          // 普通の攻撃
		System.out.println(name + " が " + target.getName() + " に魔法攻撃!!");
	    target.damage(power*2);
	}
    }
    // 攻撃を受けた時の処理を実装
    @Override
    public void damage(int dp){
	if( rnd.nextInt(5) == 2){ // 0～4の乱数を生成（確率は調整してよい）
	    System.out.println(name + " は攻撃をかわした!!");
	}
	else{
	    System.out.println(name + " は " + dp + " のダメージを受けた!!");
	    hitPoint -= dp; // 攻撃力分をhpから減算
	}
	if( hitPoint < 0 ) hitPoint = 0;
    }
}
