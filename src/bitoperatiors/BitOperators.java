package bitoperatiors;

public class BitOperators {
	public static void main(String[] args) {
		int n = 36;
		int i = 3;
		//Switch ON the ith position (OR |);
		int onMask = 1<<i;
		System.out.println(n | onMask);

		//Switch OFF the ith position (AND & , NEGOTION ~);
		int offMask = ~(1<<i);
		System.out.println(n & offMask);

		//Toggle the ith position ( XOR ^)
		int tMask = 1<<i;
		System.out.println(n^tMask);

		//check ON or OFF (AND &)
		int cmask = 1<<i;
		if((n & cmask)==0) {
			System.out.println("OFF");
		}
		else {
			System.out.println("ON");
		}

	}

}
