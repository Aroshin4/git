import java.util.Scanner;
import java.util.Calendar;
import javax.lang.model.util.ElementScanner14;
public class Report3_2 {
    public static void main(String[] args) throws Exception {
        Scanner stdIn =new Scanner(System.in);
        System.out.println("年と月を入力すると、カレンダを表示します。");
       
        System.out.println("年:");
        int x =stdIn.nextInt();
//cl.set(Calendar.YEAR,x);
System.out.println("月:");
int y =stdIn.nextInt();
    Calendar cl =Calendar.getInstance();
    cl.setLenient(false);
    cl.set(x, y - 1, 1); 
//cl.set(Calendar.MONTH,y);
System.out.println(x+"/"+y);
String[] weeks= {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
for(String s:weeks) {
    System.out.printf("%4s",s);
}
System.out.println();
int B = cl.get(Calendar.DAY_OF_WEEK);
        for (int i=1;i<B;i++) {
            System.out.print("/");
            System.out.printf("%3s", "");
        }
        int lastDay = cl.getActualMaximum(Calendar.DAY_OF_MONTH);
        for (int j = 1; j <= lastDay; j++) {
            
            System.out.printf("%4s", j);
            if (cl.get(Calendar.DAY_OF_WEEK)== Calendar.SATURDAY) {
                System.out.println();
            }
            cl.add(Calendar.DAY_OF_MONTH, 1);
}
System.out.println();
}
}



    
