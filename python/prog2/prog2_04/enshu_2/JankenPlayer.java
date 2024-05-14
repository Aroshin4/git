// 演習問題2: じゃんけんクラスの作成 JankenPlayer.java
// 抽象クラスJankenPlayer

abstract class JankenPlayer{
	String[] hands = {"グー", "チョキ", "パー"};
    abstract int hand();
    abstract String name();	
}

