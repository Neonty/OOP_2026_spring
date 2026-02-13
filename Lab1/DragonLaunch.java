package Lab1;
import java.util.Vector;

public class DragonLaunch{
    private Vector<Person> kidnapped = new Vector<>();

    public void kidnap(Person p){
        kidnapped.add(p);
    }

    public boolean willDragonEatOrNot(){
        int balance = 0;

        for (Person p : kidnapped){
            if (p.getGender() == Gender.boy){
                balance++;
            }
            else{
                if (balance > 0){
                    balance--;
                }
                else{
                    return true;
                }
            }
        }

        return balance > 0;
    }

    public static void main(String[] args){
        DragonLaunch launch = new DragonLaunch();
        launch.kidnap(new Person(Gender.boy));
        launch.kidnap(new Person(Gender.boy));
        launch.kidnap(new Person(Gender.girl));
        launch.kidnap(new Person(Gender.girl));
        
        System.out.println("Will dragon eat? " + launch.willDragonEatOrNot());
    }
}