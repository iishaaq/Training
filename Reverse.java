package divider;

public class Reverse {
	
	public static void main(String[] args) {
		int[] array1 = {2,6,7,5,10};
		int temp;
		
		for (int i=0; i<=(array1.length-1)/2; i++){
			temp = array1[i];
			array1[i] = array1[(array1.length-1)-i];
			array1[(array1.length-1)-i] = temp;
		}
		
		for(int i=0; i<=array1.length-1; i++) {
			System.out.println(array1[i]);
		}
		
		System.out.println("..........................");
		
		
		char temp2;
		String val = "Good Morning";
		
		char [] vals = val.toCharArray();
		
		for (int i=0; i<=(vals.length-1)/2; i++){
			temp2 = vals[i];
			vals[i] = vals[(vals.length-1)-i];
			vals[(vals.length-1)-i] = temp2;
		}
		
		for(int i=0; i<=vals.length-1; i++) {
			System.out.println(vals[i]);
		}
	}

}
