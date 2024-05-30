// 問題16-6のクラスを Thread クラスの拡張クラスとして作る
class ThreadA extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
            }
            System.out.println("***");
        }
    }
}
class ThreadEqual1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
            }
            System.out.println("=====");
        }
    }
}
public class ThreadTest1 {
    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        ThreadEqual1 b = new ThreadEqual1();
        a.start();
        b.start();
    }
}