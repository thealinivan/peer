package peer;

public class Task1 {
	public String getFactorial (double res) {
		int iterator = 2;
		while (res > 1) {
			res = res / iterator;
			iterator++;
		}	
		if (res != 1) { 
			return "Number is not factorial";
		} else {
			return "Number is " + (iterator-1) + "!" ;
		}
		
	}

}
