public class Main {
    public static void main(String[] args) {
        var p1 = new Person();
        p1.name = " Abdul Sitar Edhi ";
        p1.birthYear = 1928;
        p1.deathYear = 2016;

        var p2 = new Person(p1);
        var p3 = new Person("Abdul Sitar Edhi ",1928,2016);
        var p4 = new Person();




        p1.Print();


    }
}