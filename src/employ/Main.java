package employ;

public class Main {
	 public static void main(String[] args) {
	        Employ emp = new Employ(500, 10);
	        emp.addBonus();
	        emp.addWork();
	        
	        System.out.println("Final salary of employee: $" + emp.getSalary());
	    }
}

