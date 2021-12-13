public class MovieCompetition{
    /** Properties/attributes */
    private String date;
    private String title;
    private String directorName;
    private char category;
    private String membership;
    
    /** Constructor*/
    //Default constructor//
    MovieCompetition(){
    }
    
    /** Method */
    // ii. Mutator methods. (set)
    public void setDate(String newDate){
        date = newDate;
    }
    public void setTitle(String newTitle){
        title = newTitle;
    }
    public void setName(String name){
        directorName = name;
    }
    public void setCategory(char newCategory){
        category = newCategory;
    }
    public void setMembership(String newMembership){
        membership = newMembership;
    }
    
    // iii. Accessor methods for each data member. (get)
    public String getDate(){
        return date;
    }
    public String getTitle(){
        return title;
    }
    public String getDirector(){
        return directorName;
    }
    public char getCategory(){
        return category;
    }
    public String getMembership(){
        return membership;
    }

    // iv. Processor method
    public int calculateEntryFee(){
        if (category == 'A' && membership.equals("Yes")){
            return 50;
        } else if (category == 'A' && membership.equals("No")){
            return 100;
        } else if (category == 'B' && membership.equals("Yes")){
            return 150;
        } else if (category == 'B' && membership.equals("No")){
            return 200;
        } else {
            return 0;
        }
    }
    
    // v. Printer method
    public String printer(){
        return "Date: " + date + "\nMovie Title: "+ title + "\nDirector Name: " + directorName + "\nCategory: " + category +
        "\nClub Membership: " + membership + "\nEntry fee: RM" + calculateEntryFee();
    }
}