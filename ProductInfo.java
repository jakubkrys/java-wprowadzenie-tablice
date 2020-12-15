class ProductInfo {
	public static void main(String args[]){
		
			char[][] product = new char [3][];
			product[0] = new char[4];
			product[1] = new char[2];
			product[2] = new char[5];
			
			product[0][0] = 'b';
			product[0][1] = 'u';			
			product[0][2] = 't';
			product[0][3] = 'y';
			product[1][0] = (char)52;
			product[1][1] = (char)50;
			product[2][0] = '2';
			product[2][1] = '3';
			product[2][2] = '.';
			product[2][3] = '4';
			product[2][4] = '2';
			
			System.out.println("--------");
			System.out.println(product[0][0]+" "+product[0][1]+" "+product[0][2]+" "+product[0][3]);
			System.out.println(product[1][0]+""+product[1][1]);
			System.out.println(product[2][0]+""+product[2][1]+""+product[2][2]+""+product[2][3]+""+product[2][4]);
			System.out.println("--------");
				
	}
}