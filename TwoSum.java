import java.nio.file.spi.FileSystemProvider;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		int[] arr = {2,11,15,7,6,3};
		int target = 9;
		System.out.println(Arrays.toString(twoNumbers(arr,target)));
		
	}

	private static int[] twoNumbers(int[] arr, int target) {
//		for(int i=0; i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]+arr[j] == target) {
//					return new int[] {i,j};
//				}
//			}
//			
//		}
//		
//		
//		return null;
//	}
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			int need = target - arr[i];
			if(map.containsKey(need)) {
				return new int[] {map.get(need),i};
			}
			map.put(arr[i], i);
		}
		return null;
}}
