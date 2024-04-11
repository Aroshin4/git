import java.net.NoRouteToHostException;
import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class Report4_2 {
    public static void main(String[] args) throws Exception {
        Scanner stdIn =new Scanner(System.in);
System.out.println("入力した数字(最大８行）を、「*」を用いて花文字で表示します");
System.out.println("n:");
String n =stdIn.nextLine();
int m = Integer.parseInt(n);
if(m>=100000000){
    System.out.println("n:8行を超えてしまいます");
}
else{
for(int i =n.length()-1;i>=0;i--){
   
    double j=Math.pow(10,i);
    int j1 = (int) j; 
    int k=m/j1;
    int l=k%10;

    if(l==0){
        System.out.println("***");
        System.out.println("* *");
        System.out.println("* *");
        System.out.println("* *");
        System.out.println("***");
        }
    if(l==1){
    System.out.println("*");
    System.out.println("*");
    System.out.println("*");
    System.out.println("*");
    System.out.println("*");
    }
    if(l==2){
        System.out.println("***");
        System.out.println("  *");
        System.out.println("***");
        System.out.println("*");
        System.out.println("***");
    }
    if(l==3){
        System.out.println("***");
        System.out.println("  *");
        System.out.println("***");
        System.out.println("  *");
        System.out.println("***");
    }
    if(l==4){
        System.out.println("* *");
        System.out.println("* *");
        System.out.println("***");
        System.out.println("  *");
        System.out.println("  *");
    }
    if(l==5){
        System.out.println("***");
        System.out.println("*  ");
        System.out.println("***");
        System.out.println("  *");
        System.out.println("***");
    }
    if(l==6){
        System.out.println("***");
        System.out.println("*  ");
        System.out.println("***");
        System.out.println("* *");
        System.out.println("***");
    }
    if(l==7){
        System.out.println("***");
        System.out.println("* *");
        System.out.println("  *");
        System.out.println("  *");
        System.out.println("  *");

    }
    if(l==8){
        System.out.println("***");
        System.out.println("* *");
        System.out.println("***");
        System.out.println("* *");
        System.out.println("***");
    }
    if(l==9){
        System.out.println("***");
        System.out.println("* *");
        System.out.println("***");
        System.out.println("  *");
        System.out.println("***");

    }
    }
}
}
    
}
    


