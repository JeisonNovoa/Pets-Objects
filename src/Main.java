import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class Main {
	public static ArrayList<Pets> animalList = new ArrayList<>();
	public static HashMap<String, Pets> animalMap = new HashMap<>();

	public static void main(String[] args) {
		
		        int option;

		        do {
		            String menu = " Pets Menu \n"
		                    + "1. Register a new animal\n"
		                    + "2. Consult an animal\n"
		                    + "3. Show list of registered animals\n"
		                    + "4. Exit\n"
		                    + "Enter an option:";
		            option = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

		            switch (option) {
		                case 1:
		                    registerPet();
		                    break;
		                case 2:
		                    consultPet();
		                    break;
		                case 3:
		                    showPets();
		                    break;
		                case 4:
		                    JOptionPane.showMessageDialog(null, "Thank you for your work...");
		                    break;
		                default:
		                    JOptionPane.showMessageDialog(null, "The option is not found.");
		            }
		        } while (option != 4);
		    }

		    public static void registerPet() {
		        String name = JOptionPane.showInputDialog("Enter the name of the animal:");
		        String species = JOptionPane.showInputDialog("Enter the species of the animal:");
		        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter the age:"));

		        Pets animal = new Pets(name, species, age);
		        animalList.add(animal);
		        animalMap.put(name, animal);
		        System.out.println("Animal registered");
		    }

		    public static void consultPet() {
		        String pet = JOptionPane.showInputDialog("Enter the name to search:");
		        Pets animal = animalMap.get(pet);
	    		
	    		if(animalMap.containsKey(pet)) {
	    			animal.showInformation();
	    		}else {
	    			JOptionPane.showMessageDialog(null, "The animal does not exist or is not registered");
	    		}
		    }

		    public static void showPets() {
		        if (animalList.isEmpty()) {
		            JOptionPane.showMessageDialog(null, "No animals are registered.");
		        } else {
		        	String list = "List of registered animals:\n";
		            for (Pets pet : animalList) {
		                list += "Name: " + pet.getName() + "\n";
		                list += "Species: " + pet.getSpecies() + "\n";
		                list += "Age: " + pet.getAge() + "\n";
		            }
		            JOptionPane.showMessageDialog(null, list);
		        }
		    }
	}


