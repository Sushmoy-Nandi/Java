package in.kgcoding.equals;

public class EqualsAndHashCodeTest {
    public static void main(String[] args) {
        Person person1 = new Person("Sushmoy Nandi",21,"001");
        Person person2 = new Person("Sushmoy Nandi",20,"001");

        if(person1.equals(person2)){

            System.out.println("Equals");
        }else{

            System.out.println("Not Equals");
        }

    }
}
