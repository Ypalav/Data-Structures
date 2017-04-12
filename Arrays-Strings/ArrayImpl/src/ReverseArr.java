public class ReverseArr {
	public int[] reverse(int[] inpArr) {
		int start=0;
		int end=inpArr.length-1;
		for(int i=0;i<inpArr.length/2;i++){
			int temp=inpArr[start];
			inpArr[start]=inpArr[end];
			inpArr[end]=temp;
			start++;
			end--;
		}
		return inpArr;
	}
	
	public static void main(String args[]){
		ReverseArr reverseArr = new ReverseArr();
		int[] inputArr={44,4,5,54,2};
		int []resultArr=reverseArr.reverse(inputArr);
		for(int i=0;i<resultArr.length;i++){
			System.out.println(resultArr[i]);
		}
	}
}
