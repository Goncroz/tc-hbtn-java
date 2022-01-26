
public class NumerosPares {

	public static void main(String[] args) {
		int num;
		for(num = 0; num <= 100; num++) {
		if(num%2 == 0 && num<100) {
			System.out.printf(num + ", ");	
				}
		else if(num%2 == 0 && num == 100){
			System.out.println(num);
		}
		}

	}

}
