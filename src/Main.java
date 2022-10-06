
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	Human human1=new Human(); Throws error bcoz we need to pass arguments to the constructor 
		
		Human human1=new Human("Alexa",15,34);
		Human human2 = new Human("Siri",23,50);
		
		human1.drink();
		human2.eat();

	}

}
