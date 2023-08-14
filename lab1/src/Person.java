public class Person {
    String name = "";
    int birthYear;
    int deathYear = -1;
    public Person() {
        String name = "";
        int birthYear;
        int deathYear = -1;
    }


    public Person(String name,int birthYear,int deathYear){
        this.name = name;
        this.birthYear = birthYear;
        this.deathYear = deathYear;
    }
    public Person(Person another) {
        this(another.name, another.birthYear,another.deathYear);
    }




    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getDeathYear() {
        return deathYear;
    }
    public void Print(){
        System.out.println("Name: " + name);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Death Year: " + deathYear);

    }
}
