package ThursdayReviewMarch18;

public class twoDarray {

	public static void main(String[] args) {
		
	int [][] num = {{8,5,5,4,3,},{9,90,0},{2,3,4,}};
	//iterating rows of a 2D Array
	for (int []row:num) {
		
		//iterating elements of a rows 
		for (int element:row) {
			System.out.print(element +" ");
		}
	}System.out.println();
		
		int [] sum =new int [num.length];
		for (int [] row :num) {
			for (int element:row) {
				for (int row1 =0;row1<num.length;row1++) {
					for (int col=0;col<num [row1].length;col++) {
						sum[row1]+=element;
					}System.out.println("sum is "+element);
				}
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}}