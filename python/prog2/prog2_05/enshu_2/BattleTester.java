// BattleTesterクラス
import java.util.Scanner;
public class BattleTester {
    public static void main(String[] args) {
	Hero hero = new Hero("勇者");
	Enemy monster = new Enemy("モンスター");
	int turn = 0;
	Scanner sc = new Scanner(System.in);
	
	while( true){
	    System.out.println( "\n" + ++turn + "ターン目");
	    //ステータスを表示
	    hero.putStatus();	
	    monster.putStatus();
	    
	    // 攻撃開始
	    if( hero.getHp() > 0){
			System.out.println( hero.getName() + "の行動を選べ:  1: 通常攻撃 2: 魔法攻撃");
		int a =sc.nextInt();
		if(a==1){
			hero.attack(monster);
		}else if(a==2){
			hero.fire(monster);
		}else{
			System.out.println( hero.getName() + " の攻撃はかわされた");
		}
	    }
	    else{
		System.out.println( hero.getName() + " は死んでしまった..");
		break;
	    }
	    
	    if( monster.getHp() > 0){
		monster.attack(hero);
	    }
	    else{
		System.out.println( hero.getName() + " は " + monster.getName()  + " を倒した!!");
		break;
	    }
	    System.out.print("Enterキーで次にすすむ: ");
	    sc.nextLine();
		sc.nextLine();
		continue; 
	}
    }
}
