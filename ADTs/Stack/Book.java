public class Book{
        private String serial_number;
        private String author;
        private String title;
        private double price;

        //constructor
        public Book(String serial_number, String author, String title, double price){
            this.serial_number = serial_number;
            this.author = author;
            this.title = title;
            this.price = price;
        }

        //accessor
        public String getSerialNum(){ return serial_number;}
        public String getAuthor(){ return author;}
        public String getTitle(){ return title;}
        public double getPrice(){ return price;}

        //mutator
        public void setSerialNum(){ this.serial_number = serial_number;}
        public void setAuthor(){  this.author = author;}
        public void setTitle(){  this.title =  title;}
        public void setPrice(){  this.price = price;}

        //display
        public String toString(){
            return "Serial Number: " + serial_number + "\nAuthor: " + author + "\nTitle: " + title
            + "\nPrice: RM" + price; 
        }
    }