package employ;

public class Employ {
	    double salary;
	    double workHours;
	    
	    public Employ(double salary, double workHours) {
	        this.salary = salary;
	        this.workHours = workHours;
	    }
	   
	    public void getInfo(double salary, double workHours) {
	        this.salary = salary;
	        this.workHours = workHours;
	    }
	   
	    public void addBonus() {
	        if (salary < 500) {
	            salary += 10;
	        }
	    }
	   
	    public void addWork() {
	        if (workHours > 6) {
	            salary += 5;
	        }
	    }

	    public double getSalary() {
	        return salary;
	    }
}

