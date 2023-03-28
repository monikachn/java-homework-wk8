package methodoverriding23;
// creating a child class
class Bike2 extends Vehicle{

    //defining the same method as in the parent class
    public void run(){
        System.out.println("Bike is running");
    }

    public static void main(String[] args) {
        Bike2 obj=new Bike2(); // creating method
        obj.run(); // calling method
    }
}
