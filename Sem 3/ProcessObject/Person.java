public class Person {

    private String name;
    private int age;
    private char gender; // M / F

    // parametrize constructor
    public Person(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //accessors
    public String getName(){ return this.name;}
    public int getAge(){ return this.age;}
    public char getGender(){ return this.gender;}

    // toStirng method
    public String toString(){
        return name + "\t" + age +"\t" + gender;
    }

}

        //mutators (takda pun)
    // public void setName(String name){ this.name = name;}
    // public void setAge(int age){ this.age = age;}
    // public void setGender(char gender){ this.gender = gender;}
