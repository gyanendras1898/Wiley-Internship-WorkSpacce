package zoo;
import org.animals.*;

public class Main {
	public static void main(String[] args) {
		VandalurZoo zoo=new VandalurZoo();
		
		Animal lion=new Lion("Lion");		
		Animal tiger=new Tiger("Tiger");
		Animal deer=new Deer("Deer");
		Animal monkey=new Monkey("Monkey");
		Animal elephant=new Elephant("Elephant");
		Animal giraffe=new Giraffe("Giraffe");
		
		Animal[] animal= {lion,tiger,deer,monkey,elephant,giraffe};
		
		zoo.setAnimal(animal);
		
		zoo.displayProperties(zoo.getAnimal());	
		
	}
		
	
}
//{lion,tiger,deer,monkey,elephant,giraffe}
	
	

/*	System.out.println("Characteristic of all animals");
	
	//Properties p1=new Properties(zoo.getMonkey());
	
	System.out.println("Lion: ");
	System.out.print("	Color:"+zoo.getLion().getColor()+", ");
	System.out.print("Weight:"+zoo.getLion().getWeight()+", ");
	System.out.println("Age:"+zoo.getLion().getAge()+", ");
	System.out.print("	IsVeg:"+zoo.getLion().isVegetarian()+", ");
	System.out.print("CanClimb:"+zoo.getLion().canClimb()+", ");
	System.out.println("Sound:"+zoo.getLion().sound()+" ");
	
	System.out.println("Tiger: ");
	System.out.print("	Color:"+zoo.getTiger().getColor()+", ");
	System.out.print("Weight:"+zoo.getTiger().getWeight()+", ");
	System.out.println("Age:"+zoo.getTiger().getAge()+", ");
	System.out.print("	IsVeg:"+zoo.getTiger().isVegetarian()+", ");
	System.out.print("CanClimb:"+zoo.getTiger().canClimb()+", ");
	System.out.println("Sound:"+zoo.getTiger().sound()+" ");
	
	System.out.println("Deer: ");
	System.out.print("	Color:"+zoo.getDeer().getColor()+", ");
	System.out.print("Weight:"+zoo.getDeer().getWeight()+", ");
	System.out.println("Age:"+zoo.getDeer().getAge()+", ");
	System.out.print("	IsVeg:"+zoo.getDeer().isVegetarian()+", ");
	System.out.print("CanClimb:"+zoo.getDeer().canClimb()+", ");
	System.out.println("Sound:"+zoo.getDeer().sound()+" ");
	
	System.out.println("Monkey: ");
	System.out.print("	Color:"+zoo.getMonkey().getColor()+", ");
	System.out.print("Weight:"+zoo.getMonkey().getWeight()+", ");
	System.out.println("Age:"+zoo.getMonkey().getAge()+", ");
	System.out.print("	IsVeg:"+zoo.getMonkey().isVegetarian()+", ");
	System.out.print("CanClimb:"+zoo.getMonkey().canClimb()+", ");
	System.out.println("Sound:"+zoo.getMonkey().sound()+" ");
	
	System.out.println("Elephant: ");
	System.out.print("	Color:"+zoo.getElephant().getColor()+", ");
	System.out.print("Weight:"+zoo.getElephant().getWeight()+", ");
	System.out.println("Age:"+zoo.getElephant().getAge()+", ");
	System.out.print("	IsVeg:"+zoo.getElephant().isVegetarian()+", ");
	System.out.print("CanClimb:"+zoo.getElephant().canClimb()+", ");
	System.out.println("Sound:"+zoo.getElephant().sound()+" ");
	
	System.out.println("Giraffe: ");
	System.out.print("	Color:"+zoo.getGiraffe().getColor()+", ");
	System.out.print("Weight:"+zoo.getGiraffe().getWeight()+", ");
	System.out.println("Age:"+zoo.getGiraffe().getAge()+", ");
	System.out.print("	IsVeg:"+"yes, ");
	System.out.print("CanClimb:"+zoo.getGiraffe().canClimb()+", ");
	System.out.println("Sound:"+zoo.getGiraffe().sound()+" ");
}
*/