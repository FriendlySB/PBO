package Week2PrakPBO;

public class Dog extends Animal{

    public Dog(String name, int age, String food, String gender, int alive) {
        super(name, age, food, gender, alive);
    }
    
    public String printSound(){
        return "Woof";
    }
    
    @Override 
    public String printData(){
        return "Animal : Dog\n" + super.printData();
    }
}
