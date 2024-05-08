// 演習問題2：銀行口座クラスの活用 TimeAccountTester2.java
class TimeAccountTester2{
    static int compBalance(Account a,Account b){
        if ((a.getBalance()+a.getTimeBalance()) > (b.getBalance()+b.getTimeBalance())){
            return 1;
        } 
        else if((a.getBalance()+a.getTimeBalance()) < (b.getBalance()+b.getTimeBalance())){
            return -1;
        }else
        {
            return 0;
        }
    }
    public static void main(String[] args){
    Account a = new Account("adachi","1234" , 800, 2000,4,20);
    TimeAccount b =new TimeAccount("tanaka","9876" , 300, 2004, 5, 18, 600);
    System.out.println(a.toString());
    System.out.println(b.toString());
    switch(compBalance(a,b)){
        case 0 :System.out.println("同じ");
        case 1:System.out.println("adachiさんの方が多い");
        case -1:System.out.println("tanakaさんの方が多い");
    }
    }
}

