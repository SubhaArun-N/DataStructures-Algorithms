package ProblemSheet;

/*
 * Program to find a missing number in a array [0,n] using binary search
 */

public class MissingNumber{
	
	public int findMissing(int[] ar) {
		int l =0, h=ar.length-1;
		int mid =0;
		
		while(l<=h) {
			mid = l +(h-l)/2;
			
			int lDiff = ar[l] - l;
			int midDiff = ar[mid] - mid;
			int hDiff = ar[h] - h;
			
			if(lDiff != midDiff) {
				h = mid;
			}else if(midDiff != hDiff){
				l = mid;
			}
		}
		return (ar[l]+ar[h])/2;
	}
	public static void main(String[] args) {
		MissingNumber mn = new MissingNumber();
		int[] ar = {1,2,3,4,5,6,8,9};
		System.out.println("missing: "+mn.findMissing(ar));
		
	}
}