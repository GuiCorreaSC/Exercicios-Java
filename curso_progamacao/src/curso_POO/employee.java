package curso_POO;

public class employee {
	
	public String name;
	public Double grossSalary;
	public Double tax;
	public double increaseSalary; 
	
	public double salary() {
		return grossSalary - tax;
	}
	
	public double newSalary() {
		return salary()+(increaseSalary * grossSalary)/100 ;
	}
	
	public String toString() {
		return "Name: " +name 
				+", $ " +salary();		
	}
	
	

}
