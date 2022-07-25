package assistedProjects;

 public class constructor{
	int id;
	String name;


void display() {
	System.out.println("id: "+id+"\t "+"name: "+name);
	}
public constructor(int id,String name) {
	this.id=id;
	this.name=name;
}


public static void main(String[] args) {

	constructor emp1=new constructor(2,"aman");
	constructor emp2=new constructor(3,"akash");

	emp1.display();
	emp2.display();
	}
}
