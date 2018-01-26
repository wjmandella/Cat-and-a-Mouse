import java.util.Scanner;

public class CatAndAMouseApp {
    static String[] catAndMouse(int x, int y, int z) {
        // Complete this function
    	String [] results = new String[1];
    	if(Math.abs(x-z) == Math.abs(y - z)) {
    		results[0] = "Mouse C";    		
    	} else if (Math.abs(x-z) < Math.abs(y - z)) {
    		results[0] = "Cat A";  		
    	} else {
    		results[0] = "Cat B";
    	}   	
    	return results;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of queries, q (integer 1-100): ");
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            System.out.print("Enter the Cat A's position ('x') on the number line (integer 1-100): ");
            int x = in.nextInt();
            System.out.print("Enter the Cat B's position ('y') on the number line (integer 1-100): ");
            int y = in.nextInt();
            System.out.print("Enter the Mouse's position ('z') on the number line (integer 1-100): ");
            int z = in.nextInt();
            String[] result = catAndMouse(x, y, z);
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
            }
            System.out.println("");


        }
        in.close();
    }
}
