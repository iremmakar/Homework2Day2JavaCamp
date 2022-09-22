package methods2;

public class Main {

	public static void main(String[] args) {
		String message = "Bugün hava çok güzel";
		String newMessage = message.substring(0,2);
		System.out.println(newMessage);
		String newMessage2= sendCity();
		System.out.println(newMessage2);
		int number = toAdd(5,7);
		System.out.println(number);
		int sum = toAdd2(2,3,4,5,6);
		System.out.println(sum);
	}
	
	public static void add() {
		System.out.println("Added");
	}
	
	public static void delete() {
		System.out.println("Deleted");
	}
	
	public static void update() {
		System.out.println("Updated");
	}
	
	public static int toAdd(int number1, int number2) {
		return number1+number2;
	}
	
	public static int toAdd2(int... numbers) {
		int sum = 0;
		for(int number:numbers) {
			sum+=number;
		}
		return sum;
	}
	
	public static String sendCity() {
		return "Ankara";
	}
	

}
