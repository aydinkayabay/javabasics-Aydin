package ThursdayReviewMarch18;

public class StringClassDem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str ="Hello!!!";
     int length=str.length();
     System.out.println(length);
     System.out.println(str.toUpperCase());
		System.out.println(str);//str still not changed
		str.equals("Hello");//boolean
		System.out.println(str.contentEquals("hello"));
		System.out.println(str.equalsIgnoreCase("Hello"));
		boolean starts=str.startsWith("He");
		System.out.println("str.startsWith(he)");
		starts=str.toLowerCase().startsWith("he");
		System.out.println(starts);
		char fifthChracter=str.charAt(4);
		System.out.println(fifthChracter);
		String reverse="";
		char[]charArray=str.toCharArray();
		for (int i=charArray.length-1;i>=0;i--) {
			System.out.println(charArray[i]);
			int index=str.indexOf("hello");
			System.out.println(index);
			String 
		
		}
		
		
		
		
		
		
	}

}
