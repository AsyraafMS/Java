//superclass
public class Person
{
   protected String name;
   protected int type; //1-presenter
                       //2-participant

   //normal constructor;
   public Person()
   {
       this.name = null;
       this.type  = 0;
   }
   public Person(String n, int t)
   {
       this.name = n; 
       this.type = t;
   }

   //setter methods;
   public void setName(String n)
   {
       this.name = n;
   }
   public void setType(int t)
   {
       this.type = t;
   }
   //getter methods;
   public String getName(){return name;}
   public int getType(){return type;}

   //printer method;
   public String toString(){
       return "Name: " + name + "\nType: " + type;
   }
}
