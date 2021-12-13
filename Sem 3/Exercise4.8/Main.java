
public class Main
{
   public static void main (String [] args){
       Queue Number = new Queue();
       Queue XX = new Queue();
       Queue YY = new Queue();

       Number.enqueue(20);
       Number.enqueue(103);
       Number.enqueue(80);
       Number.enqueue(125);
       Number.enqueue(55);
       Number.enqueue(66);
       Number.enqueue(34);

       //a)
       // Number = empty
       // XX = 55->125->80->20(front)
       // YY = 34->66->103(front)

       //b)
       // XX is divisible by 5
       // YY is not
   }
}
