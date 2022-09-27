package Week2PrakPBO;

public class Horse extends Animal{

    public Horse(String name, int age, String food, String gender, int alive) {
        super(name, age, food, gender, alive);
    }
    
    public String printSound(){
        return "Neigh";
    }
    
    @Override 
    public String printData(){
        return "Animal : Horse\n" + super.printData();
    }
}
