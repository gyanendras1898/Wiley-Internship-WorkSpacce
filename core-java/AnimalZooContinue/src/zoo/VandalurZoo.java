package zoo;
import org.animals.*;

public class VandalurZoo {
	private Animal[] animal;
	
	public Animal[] getAnimal() {
		return animal;
	}
	
	public void setAnimal(Animal[] animal) {
		this.animal=animal;
	}
	public void displayProperties(Animal[] animal) {
		for(Animal a: this.animal) {
			a.displayProperties();
		}
	}
	
}





//private Lion lion;
//private Tiger tiger;
//private Deer deer;
//private Monkey monkey;
//private Elephant elephant;
//private Giraffe giraffe;
//
//VandalurZoo(){
//	this.lion=new Lion();
//	this.tiger=new Tiger();
//	this.deer=new Deer();
//	this.monkey=new Monkey();
//	this.elephant=new Elephant();
//	this.giraffe=new Giraffe();
//}
//
//public Lion getLion() {
//	return lion;
//}
//
//public Tiger getTiger() {
//	return tiger;
//}
//
//public Deer getDeer() {
//	return deer;
//}
//
//public Monkey getMonkey() {
//	return monkey;
//}
//
//public Elephant getElephant() {
//	return elephant;
//}
//
//public Giraffe getGiraffe() {
//	return giraffe;
//}
