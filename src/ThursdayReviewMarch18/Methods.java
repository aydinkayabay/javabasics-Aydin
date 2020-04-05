package ThursdayReviewMarch18;

    public class Methods {
    	//create a method that will accept array
    	
    	int getLargestNumber(int []array) {
    		int largest=array[0];
    		for (int i =1;i<array.length;i++) {
    			if (array[i]>largest) {
    				largest=array[i];
    			}
    		}
			return largest;
    	}
    	
    		
    	
    	
    	
	public static void main(String[] args) {
		Methods obj=new Methods();
		int [] arr= {10,20,38,12};
		System.out.println(obj.getLargestNumber(arr));
		

	}

}
