import javax.swing.JOptionPane;

public class Pets {
public int code;
public String name;
public String species;
public int age;
public Pets(String name, String species, int age) {
    this.name = name;
    this.species = species;
    this.age = age;
}

public String getName() {
    return name;
}

public String getSpecies() {
    return species;
}

public int getAge() {
    return age;
}


public void showInformation() {
	String info = "Animal Details:\n"
            + "Name: " + name + "\n"
            + "Species: " + species + "\n"
            + "Age: " + age +  "\n";
			makeSound();
    JOptionPane.showMessageDialog(null, info);
}


public void makeSound() {
	 if (species.equalsIgnoreCase("cat")) {
         System.out.println("I am a cat and I can climb trees.");
     } else if (species.equalsIgnoreCase("dog")) {
         System.out.println("I am a dog and I can play fetch.");
     } else if (species.equalsIgnoreCase("duck")) {
         System.out.println("I am a duck and I can swim in water.");
     } else {
         System.out.println("This method does not have a special implementation for this species.");
     }
 }
}


