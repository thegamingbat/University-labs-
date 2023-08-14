
public class Main {
    public static void main(String[] args) {
        var p1=new Person( "ahmed" , "1" , "10" , "1974");
        var p2=new Person( "ali" , "1" , "11" , "1976");
        p1.getage();
        p2.getage();

        Person.compare(p1 , p2);


        AdmissionForm admissionForm = new AdmissionForm();

        int formNo1 = admissionForm.submitForm("John", 85);
        int formNo2 = admissionForm.submitForm("Alice", 78);
        int formNo3 = admissionForm.submitForm("Bob", 90);

        admissionForm.enterTestScore(formNo1, 80);
        admissionForm.enterTestScore(formNo2, 75);
        admissionForm.enterTestScore(formNo3, 95);

        admissionForm.generateMeritList();





    }
}