package ThursdayReviewMarch18;

public class localVariables {
	void nameInside() {
		String name ="John";//local variable that visible it was declared
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		localVariables obj=new localVariables();
		obj.nameInside();
     System.out.println(name);// name is not  visible 
     
     boolean flag=true;
     if (flag) {
    	 String answer ="yes";
    	 
     }
     char[] answer;
	System.out.println(answer);// local variable  ce
     for (int i=1;i<=5;i++) {
    	 System.out.println(i);
     }
     
	}

}
