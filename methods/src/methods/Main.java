package methods;

public class Main {

	public static void main(String[] args) {
		findNumber();

	}
	
	public static void findNumber() {
		int[] numbers = new int[] {1,2,5,7,9,0};
		int aranacak = 6;
		boolean isThere = false;
		
		for(int number: numbers) {
			if(number == aranacak) {
				isThere = true;
				break;
			}
		}
		
		if(isThere) {
			sendMessage("Number found: " +aranacak);
		}else {
			sendMessage("There is no number: "+aranacak);
			
		}
		
		}
	
	public static void sendMessage(String message){
		System.out.println(message);
	}
	
	
	

}
