public class Hangar {

    public static void main(String[] args) {

        Car clio = new Car("Clio",1000);
        System.out.println("I am " + clio.doStuff() + " and i go zoom zoom zoom");


        Boat queen = new Boat("Queen Elizabeth", 20000);
        System.out.println("I´m " + queen.doStuff() + " and i go glug glug");
    }

}
