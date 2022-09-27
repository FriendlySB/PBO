package Week2PrakPBO;

public class Main {
    
    static void Main(){
        Cat cat1 = new Cat("Zebediah",5,"Whiskas","Male",1);
        Dog dog1 = new Dog("Zebulon",3,"Pronas","Male",1);
        Horse horse1 = new Horse("Aiko",9,"Corn","Female",0);
        Duck duck1 = new Duck("Friedrich",1,"Rice Grain","Male",1);
        
        System.out.println(cat1.printData() + "\n" + cat1.printSound()+ "\n");
        System.out.println(dog1.printData() + "\n" + dog1.printSound()+ "\n");
        System.out.println(horse1.printData() + "\n" + horse1.printSound()+ "\n");
        System.out.println(duck1.printData() + "\n" + duck1.printSound()+ "\n");
    }    
    public static void main(String args[]) {
        Main();
    }
}
