package Week2PrakPBO;

public class Cat extends Animal{
    
    public Cat(String name, int age, String food, String gender, int alive) {
        super(name, age, food, gender, alive);
    }
    
    public String printSound(){
        return "Meow";
    }
    
    @Override 
    public String printData(){
        return "Animal : Cat\n" + super.printData();
    }
}
