
public class Account extends Book
{
     //attributes
    private String userId;
    private String details;
    private int userBorrowAmt;
    private String borrowStatus;
 
     //default constructor
    public Account(){
        this.userId = null;
        this.details = null;
        this.userBorrowAmt = 0;
        this.borrowStatus = null;
    }
    
     //normal constructor
    public Account(String userId, String details, int userBorrowAmt, String borrowStatus){
        this.userId = userId;
        this.details = details;
        this.userBorrowAmt = userBorrowAmt;
        this.borrowStatus = borrowStatus;
    }
    
     //mutator method
    public void setUserId(String id){this.userId = id;}
    public void setDetails(String details){this.details = details;}
    public void setUserBorrow(int borrowed){this.userBorrowAmt = borrowed;}
    public void setBorrowStatus(String status){this.borrowStatus = status;}
    
    //accessor method
    public String getUserId(){return userId;}
    public String getDetails(){return details;}
    public int getUserBorrow(){return userBorrowAmt;}
    public String getBorrowStatus(){return borrowStatus;}

     //processor method
    public void editDetails(String det){
        details = det;
    }
     // toString() method
    public String toString(){
        return "User ID: "+ userId +"\tDetails: "+ details +"\tUser Borrowed: "+ userBorrowAmt +"Borrow Status: "+borrowStatus;
    }
}
