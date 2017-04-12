
public class LeadersArr {
	public void printLeaders(int []inputArr){
		int max_from_right=inputArr[inputArr.length-1];
		System.out.println(max_from_right);
		
		for(int i=inputArr.length-2;i>=0;i--){
			if(max_from_right<inputArr[i]){
				max_from_right=inputArr[i];
				System.out.println(max_from_right);
			}
		}
	}
	
	public static void main(String args[]){
		LeadersArr arr = new LeadersArr();
		int [] inputArr={16, 17, 4, 3, 5, 2};
		arr.printLeaders(inputArr);
	}
	
}
