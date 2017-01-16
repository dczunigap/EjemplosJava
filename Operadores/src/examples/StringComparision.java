package examples;

public class StringComparision {

	public static void main(String[] args) {
		String name1 = "EPractizeLabs";
		String name2 = new String("EPractizeLabs");
		String name3 = "EPractizeLabs";
		
		//1st Case
		if(name1==name2){
			System.out.println("The strings are equals.");
		}else{
			System.out.println("The strings are unequal.");
		}
		
		//2nd case
		if(name1==name3){
			System.out.println("The strings are equals.");
		}else{
			System.out.println("The strings are unequals.");
		}
		
		//1st Case
		if(name1.equals(name2)){
			System.out.println("The strings are equals.");
		}else{
			System.out.println("The strings are unequal.");
		}
				
		//2nd case
		if(name1.equals(name3)){
			System.out.println("The strings are equals.");
		}else{
			System.out.println("The strings are unequals.");
		}
		
		//1st Case
		if(name1.compareTo(name2)==0){
			System.out.println("The strings are equals.");
		}else if(name1.compareTo(name2)<0){
			System.out.println("name2 follows name1");			
		}else{
			System.out.println("name1 follows name2");
		}
				
		//2nd case
		if(name1.compareTo(name3)==0){
			System.out.println("The strings are equals.");
		}else if(name1.compareTo(name3)<0){
			System.out.println("name3 follows name1");			
		}else{
			System.out.println("name1 follows name3");
		}
	}

}
