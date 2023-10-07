



class Person {

    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }


    public Person(Person p2){
        this.name=p2.name;
        this.age=p2.age;
    }

    public String getName(){
        return name;
    }

    public void setAge (int age){
        this.age=age ;
    }

    void printDetails(){

        System.out.println("the name of the person is: "+name +" and age is: "+ age);
    }

    public Person(){

    }

}

public class main2{

    public static void main (String[] args){

        Person p1 = new Person();
        p1.name="Yousaf";
        p1.age=24;


        Person p2 = new Person(p1);
        p2.printDetails();

    }
}