import java.util.Stack;
//untested
public class Q1 {
    public static void main (String[] args){

        Stack bookStack = new Stack();

        // TODO: a) extract kid and adult books from bookStack, copy to another stack named 
        // TODO: kidStack and adultStack the rest remains in bookStack
        Stack kidStack =  new Stack();
        Stack adultStack = new Stack();

        Stack moving = new Stack();
        while (!bookStack.isEmpty()){
            Book temp = (Book) bookStack.pop();

            if ( temp.getSerialNum().startsWith("A") ){
                kidStack.push(temp);
            } else if ( temp.getSerialNum().startsWith("B") ){
                adultStack.push(temp);
            } else {
                moving.push(temp);
            }
        }
        while (!moving.isEmpty()){
            bookStack.push((Book)moving.pop());
        }

        // TODO: b)  draw diagrams of bookstack, kidstack and adultstack after a)
        // INITIAL DIAGRAM OF BOOKSTACK:
        // [BOTTOM] (A2027) --> (B2516) --> (A2117) --> (A2094) --> (C6571) --> (B2618)  [TOP]

        // ? bookStack  = [BOTTOM] (C6571) [TOP]
        // ? kidStack   = [BOTTOM] (A2094) --> (A2027) [TOP]
        // ? adultStack = [BOTTOM] (B2618) --> (B2516) [TOP]
        
    }
}
