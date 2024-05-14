// 演習問題2：銀行口座クラスの活用 TimeAccount.java
class TimeAccount extends Account{
    private long timeBalance;
    TimeAccount(String n, String num, long b, int year, int month, int date,long timeBalance){
        super(n, num, b, year, month, date);
        this.timeBalance=timeBalance;
    }
    long getTimeBalance(){
		return timeBalance;
	}
    @Override public String toString() {
        return super.toString()+" 定期預金: "+timeBalance;
}
}
