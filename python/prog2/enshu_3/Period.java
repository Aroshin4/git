// 演習問題3: 期間クラス Period.java
public class Period {
    private Day from; //開始日
    private Day to; //終了日
    
    public Period(Day f  , Day t ){
        if(f.getYear()>t.getYear()||f.getYear()==t.getYear()&&f.getMonth()>t.getMonth()||f.getYear()==t.getYear()&&f.getMonth()==t.getMonth()||f.getDate()>t.getDate()){
            from = new Day(t);
            to = new Day(f);
    }else{
        from = new Day(f);
            to = new Day(t);
    }
}
public String toStr() {
    return "期間 "+(to.getYear()-from.getYear())+" 年 "+(to.getMonth()-from.getMonth())+" ヶ月 "+(to.getDate()-from.getDate())+" 日 ";
}
}