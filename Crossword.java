class Crossword {
	public static void main(String args[]){
			
		char[][] crossword = {{'w','i','l','k'},{'k','o','t'},{'�','y','r','a','f','a'}};
		
		// Wy�wietl trzeci� liter� drugiego has�a
		System.out.println("Third letter of the second word: "+crossword[1][2]);
		System.out.println();
		
		// Wy�wietl pierwsz� liter� pierwszego has�a
		System.out.println("First letter of the first word: "+crossword[0][0]);
		System.out.println();
		
		// Zamie� ostatni� liter� trzeciego has�a na 'y'
		crossword [2][5] = crossword[2][1];
		
		// Wy�wietl d�ugo�� drugiego has�a krzy��wki
		System.out.println("Length of the second word: "+crossword[1].length);
		System.out.println();
		
		// Wy�wietlenie krzy��wki
		System.out.println("------------");
		System.out.println(crossword[0][0]+" "+crossword[0][1]+" "+crossword[0][2]+" "+crossword[0][3]);
		System.out.println(crossword[1][0]+" "+crossword[1][1]+" "+crossword[1][2]);
		System.out.println(crossword[2][0]+" "+crossword[2][1]+" "+crossword[2][2]+" "+crossword[2][3]+" "+crossword[2][4]+" "+crossword[2][5]);
		System.out.println("------------");
	}
}