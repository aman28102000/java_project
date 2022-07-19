package typecasting;

public class casting {
		
		public static void main(String[] args) {
//			implicit typecasting
			int i1 = 10;
			
			byte b1 = 12;
			
			System.out.println(i1);
			
			// converting byte to int
			i1 = b1;
			
			System.out.println(i1);
//			explicit casting
			
			i1 = 13;
			b1 = 9;
			
			System.out.println(b1);
			
			// converting int to byte
			b1 = (byte) i1;
			
			System.out.println(b1);
			
			
		}

}
