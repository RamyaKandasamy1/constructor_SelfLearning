
public class Human {
	
	String human_name;
	int human_age;
	int human_weight;
	
	Human(String name,int age,int weight){
		
		this.human_name=name;
		this.human_age=age;
		this.human_weight=weight;
		
		
	}

	void eat() {
		System.out.println(this.human_name +" is eating pizza");
		
	}
	void drink() {
		System.out.println(this.human_name +" is drinking Juice");
	}
}
