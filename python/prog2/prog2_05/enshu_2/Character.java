// Characterクラス
public abstract class Character {
    protected String name; //名前
    protected int hitPoint; //体力
    protected int power; //攻撃力
    
    //targetに攻撃する (抽象メソッド)
    
    //攻撃を受けたときの処理（抽象メソッド）
    public abstract void damage(int dp);
    
    // 状態を表示
    public void putStatus(){
	System.out.println( "  " + name + " (hp:" + hitPoint + ")");
    }
    
    // 名前を返却
    public String getName(){
	return name;
    }

    // 体力値を返却
    public int getHp(){
	return hitPoint;
    }

    // 攻撃力を返却
    public int getPower(){
	return power;
    }
}
