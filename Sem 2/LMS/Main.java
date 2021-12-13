import java.util.*;
import java.io.*;
 
public class Main
{
   public static void main (String [] args){
      try{

         FileReader frBook = new FileReader("books.txt"); //reads file
         BufferedReader brBook = new BufferedReader(frBook);  //creates buffering character input stream

         Scanner input = new Scanner(System.in);
         input.useDelimiter("\n");

         Book books [] = new Book[9999];
         String id, title, subj, auth, date;
         StringTokenizer tokenizer = null;
         String data = brBook.readLine();

         //read from books.txt
         int arrNum = 0;
         while (data != null){
            tokenizer = new StringTokenizer(data,":");

            //Read file
            //tokenize words from books.txt to store into variable and create an object
            id = tokenizer.nextToken();
            title = tokenizer.nextToken();
            subj = tokenizer.nextToken();
            auth = tokenizer.nextToken();
            date = tokenizer.nextToken();

            books[arrNum] = new Book(id, title, subj, auth, date); // reads stored data from books array
            books[arrNum].setStatus(true);
            books[arrNum].setBookBorrowCount(0);

            arrNum++;
            data = brBook.readLine();
        }

         // declaring arrays
         String titleArrBase [] = new String[arrNum];

         // copied to sort
         String titleArrCpy [] = new String[arrNum];
         
         // attributes
         boolean match = false;
         int index = 0;
         double totalBorrowed = 0.0;

         for (int i = 0; i < arrNum; i++){
            titleArrBase[i] = books[i].getTitle();   // copies book titles into array
            titleArrCpy[i] = titleArrBase[i];        // make a copy of the array
         }

         // user interface
            System.out.println("\n====LIBRARY MANAGEMENT SYSTEM====");
            System.out.println("0) List all books");             //works
            System.out.println("1) Search book");                //works 
            System.out.println("2) Sort book");                  //works
            System.out.println("3) Borrow book");                //works
            System.out.println("4) Return book");                //works
            System.out.println("5) Most searched books");        //works
            System.out.println("6) Least borrowed books");       //works
            System.out.println("7) Average books borrowed");     //works
            System.out.println("8) Total books borrowed");       //works
            System.out.println("Type ADD to register new book"); //works
            System.out.println("Type STOP to exit");             
            System.out.println("Type HELP for actions list");

         String command = "";
         while (!command.equalsIgnoreCase("STOP")){ //loop for command inputs
            
            System.out.print("\nMenu: ");
            command = input.next();

            //actions
                   if (command.equals("0")){ // LIST BOOKS
               System.out.println("\n============================================BOOK LIST============================================");
               System.out.println(String.format("| "+"%0$-4s", " ID") +" | "+String.format("%0$-30s", "            Title")+" | "+String.format("%0$-15s", "   Subject")+" | "+String.format("%0$-16s", "     Author")+" | "+String.format("%0$-4s", "Publication Date"+" |"));
               System.out.println("=================================================================================================");
            
               for (int i = 0; i < arrNum; i++){
                     System.out.println(books[i].toString());
                  }
               System.out.println("=================================================================================================");
               
            } else if (command.equals("1")){ // 6. SEARCHING ALGORITHM, SEARCH
               try{ 
                  System.out.print("\nSearch by:\n1) Title\n2) Author\n3) Subject\n4) Publication Date\n\nSearch: ");
                  int searchBy = input.nextInt();
                  
                     switch (searchBy){
                        case 1:
                           System.out.print("\nEnter title to search: ");
                           String searchTitle = input.next();

                           System.out.println("\n=================================================================================================");
                           System.out.println(String.format("| "+"%0$-4s", " ID") +" | "+String.format("%0$-30s", "            Title")+" | "+String.format("%0$-15s", "   Subject")+" | "+String.format("%0$-16s", "     Author")+" | "+String.format("%0$-4s", "Publication Date"+" |"));
                           System.out.println("=================================================================================================");
                           for (int i = 0; i < arrNum; i++){
                              if (books[i].getTitle().toLowerCase().indexOf(searchTitle.toLowerCase()) != -1){ // if no match, index is always -1
                                 System.out.println(books[i].toString());
                                 books[i].searchCount();
                              }
                           }
                           System.out.println("=================================================================================================");

                           break;
                        case 2:
                           System.out.print("\nEnter author to search: ");
                           String searchAuthor = input.next();

                           System.out.println("\n=================================================================================================");
                           System.out.println(String.format("| "+"%0$-4s", " ID") +" | "+String.format("%0$-30s", "            Title")+" | "+String.format("%0$-15s", "   Subject")+" | "+String.format("%0$-16s", "     Author")+" | "+String.format("%0$-4s", "Publication Date"+" |"));
                           System.out.println("=================================================================================================");
                           for (int i = 0; i < arrNum; i++){
                              if (books[i].getAuthor().toLowerCase().indexOf(searchAuthor.toLowerCase()) != -1){
                                 System.out.println(books[i].toString());
                                 books[i].searchCount();
                              }
                           }
                           System.out.println("=================================================================================================");
                           break;
                        case 3:
                           System.out.print("\nEnter subject to search: ");
                           String searchSubject = input.next();

                           System.out.println("\n=================================================================================================");
                           System.out.println(String.format("| "+"%0$-4s", " ID") +" | "+String.format("%0$-30s", "            Title")+" | "+String.format("%0$-15s", "   Subject")+" | "+String.format("%0$-16s", "     Author")+" | "+String.format("%0$-4s", "Publication Date"+" |"));
                           System.out.println("=================================================================================================");
                           for (int i = 0; i < arrNum; i++){
                              if (books[i].getSubject().toLowerCase().indexOf(searchSubject.toLowerCase()) != -1){
                                 System.out.println(books[i].toString());
                                 books[i].searchCount();
                              }
                           }
                           System.out.println("=================================================================================================");
                           
                           break;
                        case 4:
                           System.out.print("\nEnter publication date to search: ");
                           String searchDate = input.next();

                           System.out.println("\n=================================================================================================");
                           System.out.println(String.format("| "+"%0$-4s", " ID") +" | "+String.format("%0$-30s", "            Title")+" | "+String.format("%0$-15s", "   Subject")+" | "+String.format("%0$-16s", "     Author")+" | "+String.format("%0$-4s", "Publication Date"+" |"));
                           System.out.println("=================================================================================================");
                           for (int i = 0; i < arrNum; i++){
                              if (books[i].getPublicationDate().toLowerCase().indexOf(searchDate.toLowerCase()) != -1){
                                 System.out.println(books[i].toString());
                                 books[i].searchCount();
                              }
                           }
                           System.out.println("=================================================================================================");

                           break;
                        default: 
                           System.out.println("Invalid input.\n");
                           break;
                     }
                  }
               catch(Exception e){
                  //System.out.println("Invalid input.");
               }

            } else if (command.equals("2")){ // 7. SORTING ALGORITHM, SORT
               // sort by alphabet
               System.out.print("\nSort by:\n1) Alphabet\n\nSearch: ");
               int sortBy = input.nextInt();

               switch (sortBy){
                  case 1:
                     // sort by alphabetical order
                     Arrays.sort(titleArrCpy); // method to sort lexicographically -- changes to copied array so the real doesn't change
            
                     System.out.println("\n============================================BOOK LIST============================================");
                     System.out.println(String.format("| "+"%0$-4s", " ID") +" | "+String.format("%0$-30s", "            Title")+" | "+String.format("%0$-15s", "   Subject")+" | "+String.format("%0$-16s", "     Author")+" | "+String.format("%0$-4s", "Publication Date"+" |"));
                     System.out.println("=================================================================================================");
                     for (int i = 0; i < arrNum; i++){
                        // finding index of title array
                        index = Arrays.asList(titleArrBase).indexOf(titleArrCpy[i]);
                        System.out.println(String.format("| "+"%4s", books[index].getBookId()).replace(' ', ' ') +" | "+String.format("%0$-30s", titleArrCpy[i])+" | "+String.format("%0$-15s", books[index].getSubject())+" | "+String.format("%0$-16s", books[index].getAuthor())+" | "+String.format("%0$-16s", books[index].getPublicationDate())+" |");
                     }
                     System.out.println("=================================================================================================");
                     break;
                  /** 
                  case 2: // popularity (borrowed count) :(
                  
                     System.out.println("Unavailable.");
                     int borrowCountCpy [] = new int[arrNum];
                     int borrowCountBase [] = new int[arrNum];

                     for(int i = 0; i < arrNum; i++){
                        borrowCountBase[i] = books[i].getBookBorrowCount();
                        borrowCountCpy[i] = borrowCountBase[i];
                     }
                  
                     //algorithm
                     Arrays.sort(borrowCountCpy);
                     for(int i = 0; i < borrowCountCpy.length / 2; i++)
                        {
                           int temp = borrowCountCpy[i];
                           borrowCountCpy[i] = borrowCountCpy[borrowCountCpy.length - i - 1];
                           borrowCountCpy[borrowCountCpy.length - i - 1] = temp;
                        }

                     System.out.println("\n============================================BOOK LIST============================================");
                     System.out.println(String.format("| "+"%0$-4s", " ID") +" | "+String.format("%0$-30s", "            Title")+" | "+String.format("%0$-15s", "   Subject")+" | "+String.format("%0$-16s", "     Author")+" | "+String.format("%0$-4s", "Publication Date"+" |"));
                     System.out.println("=================================================================================================");
                     for (int i = 0; i < arrNum; i++){
                        // finding index of int array
                        index = Arrays.asList(borrowCountBase).indexOf(borrowCountCpy[i]); // wtf man
                        System.out.println(index); //delete this
                        //System.out.println(String.format("| "+"%4s", books[index].getBookId()).replace(' ', ' ') +" | "+String.format("%0$-30s", books[index].getTitle())+" | "+String.format("%0$-15s", books[index].getSubject())+" | "+String.format("%0$-16s", books[index].getAuthor())+" | "+String.format("%0$-16s", books[index].getPublicationDate())+" |");
                     }
                     System.out.println("=================================================================================================");
                     break;*/
               }

            } else if (command.equals("3")){ // 5. COUNTER ALGORITHM, BORROW BOOK
               System.out.print("\nEnter full book name or ID to borrow: ");
               String borrowing = input.next();
               match = false;

               for (int i = 0; i < arrNum; i++){
                  if(borrowing.equalsIgnoreCase(books[i].getTitle()) || borrowing.equalsIgnoreCase(books[i].getBookId())){
                     System.out.println("\n=================================================================================================");
                     System.out.println(String.format("| "+"%0$-4s", " ID") +" | "+String.format("%0$-30s", "            Title")+" | "+String.format("%0$-15s", "   Subject")+" | "+String.format("%0$-16s", "     Author")+" | "+String.format("%0$-4s", "Publication Date"+" |"));
                     System.out.println("=================================================================================================");
                     System.out.println(books[i].toString());
                     System.out.println("=================================================================================================");
                     System.out.print("\nBorrow this book? (Y/N): ");
                     char borrow = input.next().charAt(0);

                     if (books[i].getStatus() == false){
                        System.out.println("\nBook is currently unavailable/borrowed.");
                     } else if (books[i].getStatus() == true){
                        if(borrow == 'Y' || borrow == 'y'){
                           System.out.println("\nBook borrowed successfully.");
                           books[i].borrowBook();
                           totalBorrowed++;
                           books[i].setStatus(false);
                        } else if (borrow == 'N' || borrow == 'n'){
                           System.out.println("\nBorrowing cancelled.");
                        } else {
                           System.out.println("\nInvalid input.");
                        }
                     }
                     match = true;
                     break;
                  } else{
                     match = false;
                  }
               }
               if (match == false){
                  System.out.println("\nMatch not found.");
               }
            } else if (command.equals("4")){ // 5. COUNTER ALGORITHM, RETURN BOOK 
               System.out.print("\nEnter full book name or ID to return: ");
               String returning = input.next();
               match = false;
               for (int i = 0; i < arrNum; i++){
                  if(returning.equalsIgnoreCase(books[i].getTitle()) || returning.equalsIgnoreCase(books[i].getBookId())){
                     System.out.println("\n=================================================================================================");
                     System.out.println(String.format("| "+"%0$-4s", " ID") +" | "+String.format("%0$-30s", "            Title")+" | "+String.format("%0$-15s", "   Subject")+" | "+String.format("%0$-16s", "     Author")+" | "+String.format("%0$-4s", "Publication Date"+" |"));
                     System.out.println("=================================================================================================");
                     System.out.println(books[i].toString());
                     System.out.println("=================================================================================================");
                     System.out.print("\nReturn this book? (Y/N): ");

                     char action = input.next().charAt(0);

                     if(books[i].getStatus() == true){
                        System.out.println("\nBook is already returned.");
                     } else if (books[i].getStatus() == false){
                        if(action == 'Y' || action == 'y'){
                           System.out.println("\nBook returned successfully.");
                           books[i].returnBook();
                           books[i].setStatus(true);

                        } else if (action == 'N' || action == 'n'){
                           System.out.println("\nReturn cancelled.");
                        } else {
                           System.out.println("\nInvalid input.");
                        }
                     } 
                     match = true;
                     break;
                  } else{
                     match = false;
                  }
               }
               if (match == false){
                  System.out.println("\nMatch not found.");
               }
            } else if (command.equals("5")){ // 1. MAX ALGORITHM, HIGHEST SEARCHED BOOK

               int max = books[0].getSearchCounter();
               index = 0;
               for (int i = 0; i < arrNum; i++){
                  if (max < books[i].getSearchCounter()){
                     max = books[i].getSearchCounter();
                     index = i;
                  }
               }
               System.out.println("\n============================================BOOK LIST============================================");
               System.out.println(String.format("| "+"%0$-4s", " ID") +" | "+String.format("%0$-30s", "            Title")+" | "+String.format("%0$-15s", "   Subject")+" | "+String.format("%0$-16s", "     Author")+" | "+String.format("%0$-4s", "Publication Date"+" |"));
               System.out.println("=================================================================================================");
               System.out.println(books[index].toString());
               System.out.println("=================================================================================================");

            } else if (command.equals("6")){ // 2. MINIMUM ALGORITHM, LEAST BORROWED BOOK 

               int min = books[0].getBookBorrowCount();
               index = 0;
               for (int i = 0; i < arrNum; i++){
                  if (min > books[i].getBookBorrowCount()){
                     min = books[i].getBookBorrowCount();
                     index = i;
                  }
               }
               System.out.println("\n============================================BOOK LIST============================================");
               System.out.println(String.format("| "+"%0$-4s", " ID") +" | "+String.format("%0$-30s", "            Title")+" | "+String.format("%0$-15s", "   Subject")+" | "+String.format("%0$-16s", "     Author")+" | "+String.format("%0$-4s", "Publication Date"+" |"));
               System.out.println("=================================================================================================");
               System.out.println(books[index].toString());
               System.out.println("=================================================================================================");

            } else if (command.equals("7")){ // 4. AVERAGE ALGORITHM, AVG BOOK BORROWED

               double average = totalBorrowed / arrNum;
               System.out.println("Average books borrowed: " + average);

            } else if (command.equals("8")){ // TOTAL ALGORITHM, CURRENTLY BORROWED
               int borrowed = 0;
                for (int i = 0; i < arrNum; i++){
                  borrowed = borrowed + books[i].getBookBorrowCount();
                }
               System.out.println("Total books borrowed currently: " + borrowed);
            } else if (command.equalsIgnoreCase("STOP")){
               System.out.println("\nProgram stopped.");
            } else if (command.equalsIgnoreCase("ADD")){ // FILE OUTPUT
               try{
                  System.out.print("\n==============\nBooks to add: ");
                  int bookToAdd = input.nextInt();
                  
                  int j = 0; // new book in the array so it can be output in the books.txt
                  for (j = arrNum+1 ; j < (arrNum+1) + bookToAdd; j++){
                     System.out.print("\nEnter book ID: ");
                     String idWr = input.next();
         
                     System.out.print("Enter book title: ");
                     String titleWr = input.next();
         
                     System.out.print("Enter book subject: ");
                     String subjectWr = input.next();
         
                     System.out.print("Enter book author: ");
                     String authorWr = input.next();
         
                     System.out.print("Enter publication date: ");
                     String dateWr = input.next();
         
                     books[j] = new Book(idWr, titleWr, subjectWr, authorWr, dateWr); 
                  }
                     j = j-1;
                     try(FileWriter fw = new FileWriter("books.txt", true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        PrintWriter out = new PrintWriter(bw))
                        {
                           out.print("\n"+books[j].getBookId()+":"+books[j].getTitle()+":"+books[j].getSubject()+":"+books[j].getAuthor()+":"+books[j].getPublicationDate());
                        } catch (IOException e) {
                           System.out.println("I/O error.");
                        }
                     } catch (Exception e){
                        System.out.println("\nInvalid Input.");
                     }
            } else if (command.equalsIgnoreCase("HELP")){
               System.out.println("\n====LIBRARY MANAGEMENT SYSTEM====");
               System.out.println("0) List all books"); 
               System.out.println("1) Search book"); 
               System.out.println("2) Sort book");  
               System.out.println("3) Borrow book"); 
               System.out.println("4) Return book");
               System.out.println("5) Most searched book");
               System.out.println("6) Least borrowed book");  
               System.out.println("7) Average books borrowed");
               System.out.println("8) Total books borrowed");  
               System.out.println("Type ADD to register new book");
               System.out.println("Type STOP to exit");
               System.out.println("Type HELP for actions list");
            } else {
               System.out.print("\nInvalid input.");
            }
         }
         input.close();
         brBook.close();
         }
         catch(IOException iox){
            System.out.println("Problem reading " + iox.getMessage());
      }
   }
}
