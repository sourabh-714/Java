public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,1,3,5,6};
		int x = 0;
		int y = 0;
		int min = 1;
		int max = 6;
		for(int i = 0; i < arr.length; i++) {
			x = x ^ arr[i];
		}
		for(int i = min; i <= max; i++) {
			y = y ^ i;
		}
		System.out.println("Missing number :: " + (x ^ y));
	}

}
