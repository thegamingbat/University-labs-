

public class Person {
    String name ,dd , mm , yyyy;

    public Person(String name ,String dd , String mm ,String yyyy){
        this.name = name;
        this.dd = dd;
        this.mm = mm;
        this.yyyy = yyyy;
    }
    //get age() will return a string of age like 28-11-1996.

    public void getage(){

        System.out.println(dd + "-" + mm + "-" + yyyy);
    }


    public static void compare(Person person1, Person person2) {
        int ddp1 = Integer.parseInt(person1.dd);
        int ddp2 = Integer.parseInt(person2.dd);

        int mmp1 = Integer.parseInt(person1.mm);
        int mmp2 = Integer.parseInt(person2.mm);

        int yyyyp1 = Integer.parseInt(person1.yyyy);
        int yyyyp2 = Integer.parseInt(person2.yyyy);
        String elderPerson;
        String youngerPerson;
        int dDiff = 0, mDiff = 0, yDiff = 0;

        if (yyyyp1 < yyyyp2) {
            elderPerson = person1.name;
            youngerPerson = person2.name;
            dDiff = Integer.parseInt(person2.dd) - Integer.parseInt(person1.dd);
            mDiff = Integer.parseInt(person2.mm) - Integer.parseInt(person1.mm);
            yDiff = Integer.parseInt(person2.yyyy) - Integer.parseInt(person1.yyyy);




        } else {
            elderPerson = person2.name;
            youngerPerson = person1.name;
            dDiff = Integer.parseInt(person1.dd) - Integer.parseInt(person2.dd);
            mDiff = Integer.parseInt(person1.mm) - Integer.parseInt(person2.mm);
            yDiff = Integer.parseInt(person1.yyyy) - Integer.parseInt(person2.yyyy);
        }

        if (yyyyp1 == yyyyp2 && mmp1 < mmp2) {
            if (ddp1 < ddp2) {
                elderPerson = person1.name;
                youngerPerson = person2.name;
                dDiff = Integer.parseInt(person2.dd) - Integer.parseInt(person1.dd);
                mDiff = Integer.parseInt(person2.mm) - Integer.parseInt(person1.mm);



            } else {
                elderPerson = person2.name;
                youngerPerson = person1.name;

                dDiff = Integer.parseInt(person1.dd) - Integer.parseInt(person2.dd);
                mDiff = Integer.parseInt(person1.mm) - Integer.parseInt(person2.mm);

            }
        }
        if (yyyyp1 == yyyyp2 && mmp1 == mmp2) {
            if (ddp1 < ddp2) {
                elderPerson = person1.name;
                youngerPerson = person2.name;
                dDiff = Integer.parseInt(person2.dd) - Integer.parseInt(person1.dd);



            } else {
                elderPerson = person2.name;
                youngerPerson = person1.name;
                dDiff = Integer.parseInt(person1.dd) - Integer.parseInt(person2.dd);


            }



        }
        System.out.println(elderPerson + " is elder than " +youngerPerson);
        System.out.println("Age difference is "+ yDiff + " Years -" + mDiff +" Months-" + dDiff+" Days.");
    }


}

