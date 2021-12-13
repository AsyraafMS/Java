import java.util.Scanner;
public class Date
{
    private int day;
    private int month;
    private int year;
    public Date()
    {
        this.day = 0;
        this.month = 0;
        this.year = 0;
    }    
    public Date(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public Date promptDate()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Set your order date");
        System.out.println("Enter day: ");
        day = input.nextInt();
        System.out.println("Enter month: ");
        month = input.nextInt();
        System.out.println("Enter year: ");
        year = input.nextInt();
        Date returnDate = new Date(day, month, year);
        return returnDate;
    }
    public String toString()
    {
        return (day + "/" + month + "/" + year);
    }
}
