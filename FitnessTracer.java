import java.util.Arrays;

interface Age {
    int age ();
}


 class Client implements Age {

     String name, family;
     int day, mon, year, steps, tel;
     double  weight;
     int[] pressure = new int[2];
     String email;

     public Client(String name, String family, int day, int mon, int year, int steps, int tel, double weight,
                   String email, int[] pressure) {
         this.name = name;
         this.family = family;
         this.email = email;
         this.day = day;
         this.mon = mon;
         this.year = year;
         this.steps = steps;
         this.tel = tel;
         this.weight = weight;
         this.pressure = pressure;

     }

     public Client() {

     }


     public String getName() {
         return name;
     }

     public String getFamily() {
         return family;
     }

     public void setFamily(String family) {
         this.family = family;
     }

     public int getDay() {
         return day;
     }

     public int getMon() {
         return mon;
     }

     public int getYear() {
         return year;
     }

     public int getSteps() {
         return steps;
     }

     public void setSteps(int steps) {
         this.steps = steps;
     }

     public double getWeight() {
         return weight;
     }

     public void setWeight(double weight) {
         this.weight = weight;
     }

     public int[] getPressure() {
         return pressure;
     }

     public void setPressure(int[] pressure) {
         this.pressure = pressure;
     }

     public int getTel() {
         return tel;
     }

     public String getEmail() {
         return email;
     }

     public int age() {
         return 2020 - year;
     }


     public void printAccountInfo() {
         System.out.println(getName() +" " + getFamily() + " - " + age() + " years old, " + "telephone: " + getTel() + ", e-Mail: "
                 + email + "\n weight is: " + getWeight() + " kg, " + "walked " + getSteps() + " steps, "
                 + "blued pressure is: " + Arrays.toString(toString(getPressure())) + "\n born in: " + getDay() + "." +
                 getMon() + "." + getYear() + "\n");
     }

     private int[] toString(int[] pressure) {
         return getPressure();
     }


 }



public  class FitnessTracer extends Client {

    public FitnessTracer(String name, String family, int day, int mon, int year, int steps, int tel, double weight,
                         String email, int[] pressure) {
        super(name, family, day, mon, year, steps, tel, weight, email, pressure);
    }

    public static void main(String[] args) {

        Client client1 = new Client("Ivan ", "Ivanoff ", 29, 02, 1973,
                4573, 48495467, 99.99, "ivanoff@ukr.net", new int[]{120, 80});
        Client client2 = new Client("Petr ", "Petroff", 01, 01 ,2001, 10_000,
                44344544, 70.5, "petroff@gmail.com",new int[]{160,90} );
        Client client3 = new Client("Fedor ", "Fedoroff", 30, 12, 1991, 3500,
                494955994, 55.65, "fedoroff@gmx.de", new int[]{120, 65});
        client1.setSteps(6000);
        client2.setPressure(new int[]{100, 55});
        client3.setFamily("Lenin ");
        client2.setWeight(101.250);
        client1.printAccountInfo();
        client2.printAccountInfo();
        client3.printAccountInfo();


    }
}

