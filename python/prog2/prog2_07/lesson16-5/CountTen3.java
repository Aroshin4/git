// List16-1 を改造して CountTen3 クラスを定義・実行するプログラムを書く
public class CountTen3 extends Thread {
    public static void main(String[] args) {
        for (int ti = 0; ti < 3; ti++) {
            new CountTen3().start();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("main:i = " + i + " by " + currentThread().getName());
        }
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("run:i = " + i + " by " + getName());
        }
    }
}