package romanToInteger;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution roman = new Solution();
		
		System.out.println("III in roman numbers is: "+roman.romanToInt("III")+"");
		System.out.println("LVIII in roman numbers is: "+roman.romanToInt("LVIII")+"");
		System.out.println("MCMXCIV in roman numbers is: "+roman.romanToInt("MCMXCIV")+"");
	}

}
