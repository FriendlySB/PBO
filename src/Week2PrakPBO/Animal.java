package Week2PrakPBO;

public abstract class Animal implements InterfaceDeadOrAlive{
    String name;
    int age;
    String food;
    String gender;
    int alive;

    public Animal(String name, int age, String food, String gender, int alive) {
        this.name = name;
        this.age = age;
        this.food = food;
        this.gender = gender;
        this.alive = alive;
    }
    
    boolean isAlive(int alive){
        if (alive == Dead) {
            return false;
        }
        return true;
    }
    
    public String printData() {
        String status;
        
        if(isAlive(alive)){
            status = "Alive";
        } else {
            status = "Dead";
        }
        
        return "Name: " + name + "\nAge: " + age + "\nFood: " + food + 
            "\nGender: " + gender + "\nStatus: " + status;
    }
}
