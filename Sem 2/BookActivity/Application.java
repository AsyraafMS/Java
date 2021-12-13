public class Application{
    public static void main (String []Args){
        Book book = new Book("BKC3147", "Introduction to Science", 20, "John Doe");
        String code = book.getBookCode();
        String cutCode = code.substring(3,4);

               if (cutCode.equals("1")){
            System.out.println(code + " is published by Course Pubs.");
        } else if (cutCode.equals("2")){
            System.out.println(code + " is published by Thomson.");
        } else if (cutCode.equals("3")){
            System.out.println(code + " is published by Pocket Book.");
        }
    }
}