
/** 
 * NAMING CONVENTION
 * --------------------------------------------------------------------------------------------------------------------
 * | Class Name       | Should start with uppercase letter and be a noun.        | Example: Color, Button             |
 * |------------------------------------------------------------------------------------------------------------------|
 * | Interface Name   | Should start with uppercase letter and be an adjective.  | Example: Runnable, ActionListener  |
 * |------------------------------------------------------------------------------------------------------------------|
 * | Method Name      | Should start with lowercase letter and be a verb.        | Example: actionPerformed(), main() |
 * |------------------------------------------------------------------------------------------------------------------|
 * | Variable Name    | Should start with lowercase letter.                      | Example: firstName, orderNumber    |
 * |------------------------------------------------------------------------------------------------------------------|
 * | Package Name     | Should be lowercase letter.                              | Example: java, lang                |
 * |------------------------------------------------------------------------------------------------------------------|
 * | Constants        | Should be in uppercase letter.                           | Example: RED, MAX_PRIORITY         |
 * -------------------------------------------------------------------------------------------------------------------|
 */

public class Class
{
//PROPERTIES / FIELD / ATTRIBUTES
    private int integer = x;
    private double doublePrecision; 
    private float singlePrecision;   // Note: It is better to use float instead of double.
    private String string;
    private char characterLetter;
    private boolean flag;

    int myMethod(int x){
        return x;
    }
// CONSTRUCTOR METHOD
    //DEFAULT CONSTRUCTOR
    public Class()
    {
        this.integer = 0;
        this.doublePrecision = 0;
        this.singlePrecision = 0;
        this.string = null;
        this.characterLetter = 0;
        this.flag = false;
    }

    //PARAMETRIZE CONSTRUCTOR, NORMAL CONSTRUCTOR
    public Class(int integer, double doublePrecision, float singlePrecision, String string, char characterLetter, boolean flag)
    {
        this.integer = integer;
        this.doublePrecision = doublePrecision;
        this.singlePrecision = singlePrecision;
        this.string = string;
        this.characterLetter = characterLetter;
        this.flag = flag;
    }

    //COPY CONSTRUCTOR 
    public Class(Class classObject)
    {
        this.integer = classObject.integer;
        this.doublePrecision = classObject.doublePrecision;
        this.singlePrecision = classObject.singlePrecision;
        this.string = classObject.string;
        this.characterLetter = classObject.characterLetter;
        this.flag = classObject.flag;
    }

// SETTER / MUTATOR METHOD
    // If questions ask for ALL DATA
    public void setAll(int integer, double doublePrecision, float singlePrecision, String string, char characterLetter, boolean flag)
    {
        this.integer = integer;
        this.doublePrecision = doublePrecision;
        this.singlePrecision = singlePrecision;
        this.string = string;
        this.characterLetter = characterLetter;
        this.flag = flag;
    }
    // If questions asks for EACH DATA
    public void setInteger(int integer)
    {
        this.integer = integer;
    }
    // ......

// GETTER / ACCESSOR METHOD
    public int getInteger()
    {
        return integer;
    }
    // ......

// DISPLAY / PRINTER / toString METHOD
    public String toString()  // Note: Always name this method toString.
    {
        return "Integer: " + integer
        +      "\nDouble: " + doublePrecision
        +      "\nFloat: " + singlePrecision
        +      "\nString: " + string
        +      "\nChar: " + characterLetter
        +      "\nBoolean: " + flag;
    }

// PROCESS (CALCULATION) METHOD 
    public int findSum()
    {
        return integer + integer;
    }
}


