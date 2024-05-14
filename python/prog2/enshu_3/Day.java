// 演習問題3: 日付クラスDay【第３版】Day.java
public class Day {
	private int year  = 1;		// 年
	private int month = 1;		// 月
	private int date  = 1;		// 日

	//--- コンストラクタ ---//
	public Day()                              { }
	public Day(int year)                      { this.year = year; }
	public Day(int year, int month)           { this(year); this.month = month; }
	public Day(int year, int month, int date) { this(year, month); this.date = date; }
	public Day(Day d)                         { this(d.year, d.month, d.date); }
	//--- 年・月・日を取得 ---//
	public int getYear()  { return year; }		// 年
	public int getMonth() { return month; }		// 月
	public int getDate()  { return date; }		// 日

	//--- 年・月・日を設定 ---//
	public void setYear(int year)   { this.year  = year; }		// 年
	public void setMonth(int month) { this.month = month; }		// 月
	public void setDate(int date)   { this.date  = date; }		// 日

	public void set(int year, int month, int date) {	// 年月日
		this.year  = year;			// 年	
		this.month = month;			// 月
		this.date  = date;			// 日
	}


}