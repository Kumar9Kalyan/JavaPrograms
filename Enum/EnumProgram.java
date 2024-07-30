package programs.leetcode;

public class EnumProgram{

	
		public static void main(String... args) {
			Color c1= Color.BLUE;
			System.out.println("Blue Enum name:"+ c1.name());
			System.out.println("Blue Enum value:"+c1.getValue());
		
			for(Color color: Color.values()) {
				System.out.println("Enum value:"+ color.getValue());
			}
		}
	
}

	

