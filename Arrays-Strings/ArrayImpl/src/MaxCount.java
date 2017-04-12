
public class MaxCount {
	public int countMaxVal(int[] inputArr){
		int m_index=0;
		int count=1;
		for(int i=0;i<inputArr.length;i++){
			if(inputArr[m_index]==inputArr[i])
				count++;
			else
				count--;
			
			if(count==0){
				m_index=i;
				count=1;
			}
		}
		return inputArr[m_index];
	}
	
	public static void main(String args[]){
		MaxCount count = new MaxCount();
		int[] inputArr={3, 3, 4, 2, 4, 4, 2, 4, 4};
 		int result = count.countMaxVal(inputArr);	
 		int temp_count=0;
 		for(int i=0;i<inputArr.length;i++){
 			if(inputArr[i]==result)
 				temp_count++;
 		}
 		if(temp_count>=(inputArr.length/2))
 			System.out.println(result);	
 		else
 			System.out.println("No max element");
 			
	}
	
}
