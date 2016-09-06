package codedays;

public class BinaryNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.toBinaryString(524275));
		//524275  - 15
		//524283 - 

		
		String binary = Integer.toBinaryString(524283);
		
		char [] c = binary.toCharArray();
		int conse = 0;
		for(int i = c.length - 1 ; i > 0; i--){
			if(c[i] == '1'  && c[i-1] == '1'){
				conse++;
			}
		}
		
		System.out.println(conse);
			
		
	}

}
