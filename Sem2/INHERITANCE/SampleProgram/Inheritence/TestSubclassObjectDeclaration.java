public class TestSubclassObjectDeclaration{
    public static void main(String [] args){
        System.out.println(" Item class object A");
        Item a = new Item();
        
        a.setPrice(12);
        System.out.println(a.toString());
        System.out.println(a.getPrice());
        
        System.out.println(" Item class object B :taxable");
        Item b = new Taxable();
        b.setPrice(24);
        System.out.println(b.toString());
        System.out.println(b.getPrice());
        
        System.out.println(" Item class object C :taxable");
        
        Taxable c = new Taxable();
        c.setPrice(24);
        System.out.println(c.toString());
        System.out.println(c.getPrice());
        System.out.println(c.calculateTax());
        System.out.println(c.netPrice());
        
    }
}