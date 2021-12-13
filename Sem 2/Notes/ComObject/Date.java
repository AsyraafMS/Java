public class Date {
private int day, month, year;

public Date(int a, int b, int c) {
day = a;
month = b;
year = c;
}
//retrievals:
public int theDay() 
{ return day; }

public int theMonth() {
return month; }

public int theYear() {
return year;  }

public String toString(){
return "The Date is: " + day + "/"+ month+ " /"+ year;
}
}