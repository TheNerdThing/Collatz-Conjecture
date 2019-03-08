import java.util.Scanner;

/**
 * @author Gregory Evevsky
 * TODO
 */
public class Main {

	/**
	 * let n be any postive integer. 
	 * if the integer is odd multiply by 3, then add 1
	 * if the integer is even divide by 2
	 *  
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n ; 
		while(true) {
			System.out.println("enter a postive integer: ");
			n = sc.nextInt();
			int count = 0;
			if( n > 0) {
				
				do {
					count ++;
					System.out.println(" n = " + n);
					n =collatzConjecture(n);
				}while(n != 1);
				System.out.println("we got 1 after : " + count + " runs");
			}
		}

	}
	
	public static int collatzConjecture(int n) {
		if(n %2 ==1) {
			return (n *3) +1;
		}else {
			return n/2;
		}
	}

}
