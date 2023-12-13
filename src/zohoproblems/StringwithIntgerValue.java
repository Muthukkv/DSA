package zohoproblems;

public class StringwithIntgerValue {
	public static void main(String[] args) {
		String a = "a9v9b9";
		
		for(int i = 0;i<a.length();i++) {
			char current = a.charAt(i);
			if(Character.isAlphabetic(current)) {
				System.out.print(current);
			}
			else {
				int number = Character.getNumericValue(current);
				for(int j = 1;j<number;j++) {
		//a3 means wee need to write aaa so we i means 3 , i-1 means a , so we need to print i 3 times			
					System.out.print(a.charAt(i-1));
				}
			}
		}
		
		
	}
}
