// 演習問題2：銀行口座クラスの活用 TimeAccount.java
class TimeAccount extends Account{
    TimeAccount(String n, String num, long b, int year, int month, int date,long timeBalance){
        super(n, num, timeBalance, year, month, date);
        super.timeBalance=timeBalance;
    }
}

