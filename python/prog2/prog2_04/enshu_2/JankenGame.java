// 演習問題2: じゃんけんクラスの作成 JankenGame.java
// mainメソッドを含むJankenGameクラス
		// 判定public static void main(String[] args) {
    import java.util.Scanner;
class JankenGame{
    public static void main(String[] args) {
        int judge;
        int retry;
        ComputerPlayer c =new ComputerPlayer("コンピュータ");
        Scanner stdIn = new Scanner(System.in);
        System.out.println("あなたの名前は:");
        String a =  stdIn.next();
        HumanPlayer h = new HumanPlayer(a);
		String[] hands = {"グー", "チョキ", "パー"};
        do{
            System.out.print("じゃんけんポン");
            System.out.println("(0)グー (1)チョキ (2)パー");
            int H = h.hand();
            int C = c.hand();
            if(H<0||H>2){
                System.out.println("対応外の数字が入力されました。処理を終わります。");
                System.exit(0);
            }
            System.out.print(h.name()+"は"+hands[H]+"を出し、");
            System.out.println(c.name()+"は"+hands[C]+"を出した");
            if(H==C){
                judge = 0;
                retry = 0;
            }
            else if(H==0&&C==2||H==1&&C==0||H==2&&C==1){
                judge = 1;
                retry = 1;
            }else{
                judge = 2;
                retry = 1;
            } 
            switch (judge) {
                case 0: System.out.println("引分けです。");				break;
                case 1: System.out.println(c.name()+"の勝ちです。");	break;
                case 2: System.out.println(h.name()+"の勝ちです。");	break;
            }
        }while (retry==0);
    }
}
