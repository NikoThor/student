public class Main {
    public static void main(String[] args) {

        student nikolaj = new student();

        student rasmus = new student();

        nikolaj.setNavn("Nikolaj T. Christensen");
        rasmus.setNavn("Rasmus Wentzlau");

        nikolaj.setBirthYear(1998);
        rasmus.setBirthYear(2001);

        System.out.println("studerende i klassen er: " + nikolaj.getNavn() + " og " + rasmus.getNavn());

        System.out.println("Nikolajs alder er " + nikolaj.getAge());
        System.out.println("Rasmus alder er " + rasmus.getAge());

        int avgAge = (nikolaj.getAge() + rasmus.getAge())/2;


        System.out.println("gennmsnitalderen er " + avgAge);


    }
}
