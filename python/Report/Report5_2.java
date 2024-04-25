package Report;
import java.math.BigInteger;
import java.net.NoRouteToHostException;
import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class Report5_2 {
    public static void main(String[] args) throws Exception {
        Scanner stdIn =new Scanner(System.in);
int []  a =new int [200];
int []  b=new int [200];
b[0]=2;
System.out.print("2の階乗");
System.out.print(b[0]);
  for(int i=3;i<101;i++){
    for(int k=1;k<200;k++){
      a[k]=0;
    }
    a[0]=i;
    System.out.print(","+i+"の階乗");
    for(int j=0;j<200;j++){   
  b[j]=b[j]*a[0];
  if(j>=1){
  b[j]=a[j]+b[j];
  }
  if(b[j]>9){
    int up = b[j]/10;
    b[j]=b[j]-(up*10);
    a[j+1]=up;
  }
  System.out.print(b[j]);  
}
}
}
}





