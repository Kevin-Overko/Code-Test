/*Rewrite the code to only use 1 control structure (You can use any Java built-in library you want).
How would you rewrite this for the nth number instead of ending at 5?

for (int i = 1; i <= 5; i++) {
	for (int j = 1; j <= (5 - i); j++) {
		System.out.print(".");						Output:
	}												....1
	for (int k = 1; k <= i; k++) {					...22
		System.out.print(i);						..333
	}												.4444
	System.out.println();							55555
}
*/

public class SingleControlStructure {
	public static void main(String args[]) {
	
		int n = 5;
		int temp = n;
		
		for (int j = 1; j <= n; j++) {
			for (int k = 1; k <= n ; k++) {
				if(k < temp) 
					System.out.print(".");
				else
					System.out.print(j);
			}
			temp--;
			System.out.println();
		}
	}
}
