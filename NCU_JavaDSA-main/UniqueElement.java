public class UniqueElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0,2,2,4,0,5,4,6,6,7,8,8,7};
		int ans = 0;
		for(int i = 0; i < arr.length; i++) {
			ans =  ans ^ arr[i];
		}
		System.out.println(ans);
	}

}
