// 課題: QuickPress.java
import java.util.Random;
import java.util.Scanner;
class RandomTimer extends Thread{
    int count = 0;
    boolean flag = true;
    Random rand = new Random();
    int c = 0;//判定用
    public RandomTimer(int a){
        count = rand.nextInt(0,a);
    }
    @Override
    public void run(){
        do{
            try{
                Thread.sleep(10);
                }catch(InterruptedException e){
                }
                count = count - 10;
                if(count<0&&c==0){
                    System.out.print("*"); 
                    c=1;
                }
        }while(flag==true);
    }
    public int responseTime(){
        return count;
    }
    public void endRandomTimer(){
        flag = false;
    }
}

public class QuickPress {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        RandomTimer a = new RandomTimer(5000);
        System.out.print("Hit Enter to start:"); 
        stdIn.nextLine();
        a.start();
        stdIn.nextLine();
        a.endRandomTimer();
        a.responseTime() ;
        if(a.responseTime()>0){
            System.out.print("おてつきです"); 
        }else{
            System.out.print(-1*a.responseTime()+"[ms]"); 
        }
    }
}