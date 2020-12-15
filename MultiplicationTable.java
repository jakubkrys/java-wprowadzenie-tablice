class MultiplicationTable {
	public static void main(String args[]){
		char[][] multi = {{'1','2','3'},{'2','4','6'},{'3','6','9'}};
		
		// Wyœwietlenie tabliczki mno¿enia 3x3 - sposób 1
		System.out.println("------");
		System.out.println(multi[0][0]+" "+multi[0][1]+" "+multi[0][2]);
		System.out.println(multi[1][0]+" "+multi[1][1]+" "+multi[1][2]);
		System.out.println(multi[2][0]+" "+multi[2][1]+" "+multi[2][2]);
		System.out.println("------");
		
		// Wyœwietlenie tabliczki mno¿enia 3x3 - sposób 2
		
		byte[][] multi2 = new byte[3][3];
		multi2[0][0] = 1;
		multi2[0][1] = 2;
		multi2[0][2] = 3;
		multi2[1][0] = 2;
		multi2[1][1] = 4;
		multi2[1][2] = 6;
		multi2[2][0] = 3;
		multi2[2][1] = 6;
		multi2[2][2] = 9;
		
		System.out.println("------");
		System.out.println(multi2[0][0]+" "+multi2[0][1]+" "+multi2[0][2]);
		System.out.println(multi2[1][0]+" "+multi2[1][1]+" "+multi2[1][2]);
		System.out.println(multi2[2][0]+" "+multi2[2][1]+" "+multi2[2][2]);
		System.out.println("------");
		
		// Wyœwietlenie tabliczki mno¿enia 3x3 - sposób 3
		int[][] multi3 = new int [3][];
		multi3[0] = new int[3];
		multi3[1] = new int[3];
		multi3[2] = new int[3];
		multi3[0][0] = 1;
		multi3[0][1] = multi3[1][0] = 2;
		multi3[0][2] = multi3[2][0] = 3;
		multi3[1][1] = multi3[0][1] * multi3[1][0];
		multi3[1][2] = multi3[0][1] * multi3[2][0];
		multi3[2][2] = multi3[0][2] * multi3[2][0];
		
		System.out.println("------");
		System.out.println(multi2[0][0]+" "+multi2[0][1]+" "+multi2[0][2]);
		System.out.println(multi2[1][0]+" "+multi2[1][1]+" "+multi2[1][2]);
		System.out.println(multi2[2][0]+" "+multi2[2][1]+" "+multi2[2][2]);
		System.out.println("------");
		
		
	}

}