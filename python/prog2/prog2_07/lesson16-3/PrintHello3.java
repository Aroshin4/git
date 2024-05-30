// 16-2のプログラムを使ってPrintHello3のプログラムを書く
class LabelPrinter extends Thread{
    String label = "no label";
    LabelPrinter(String label) {
        this.label = label;
    }
    @Override
    public  void run() {
        while (true) {
            System.out.println(label);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
            }
            
        }
    }
}

public class PrintHello3 {
    public static void main(String[] args) {
        LabelPrinter th = new LabelPrinter("おはよう!");
        LabelPrinter a = new LabelPrinter("こんにちは!");
        LabelPrinter b = new LabelPrinter("こんばんは!");
        th.start();
        a.start();
        b.start();
    }
}