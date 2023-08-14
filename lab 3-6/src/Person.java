public class Person {
    String name;
    int birthYear;
    int deathYear;
    public Person(String name , int birthYear , int deathYear){
        this.name = name;
        this.birthYear = birthYear;
        this.deathYear = deathYear;

    }
    public Person(String name , int birthYear){
        this.name = name;
        this.birthYear = birthYear;
        deathYear = 0000;

    }

    //copy constructor
    public Person(Person other){
        this.name = other.name;
        this.birthYear = other.birthYear;
        this.deathYear = other.deathYear;

    }

    public Person() {

    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getDeathYear() {
        return deathYear;
    }

    public String getName() {
        return name;
    }


    public void displayInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Birth Year: " + getBirthYear());
        System.out.println("Death Year: " +getDeathYear() );

    }
}

