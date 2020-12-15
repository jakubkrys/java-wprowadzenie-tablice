class Crossword {
	public static void main(String args[]){
			
		char[][] crossword = {{'w','i','l','k'},{'k','o','t'},{'¿','y','r','a','f','a'}};
		
		// Wyœwietl trzeci¹ literê drugiego has³a
		System.out.println("Third letter of the second word: "+crossword[1][2]);
		System.out.println();
		
		// Wyœwietl pierwsz¹ literê pierwszego has³a
		System.out.println("First letter of the first word: "+crossword[0][0]);
		System.out.println();
		
		// Zamieñ ostatni¹ literê trzeciego has³a na 'y'
		crossword [2][5] = crossword[2][1];
		
		// Wyœwietl d³ugoœæ drugiego has³a krzy¿ówki
		System.out.println("Length of the second word: "+crossword[1].length);
		System.out.println();
		
		// Wyœwietlenie krzy¿ówki
		System.out.println("------------");
		System.out.println(crossword[0][0]+" "+crossword[0][1]+" "+crossword[0][2]+" "+crossword[0][3]);
		System.out.println(crossword[1][0]+" "+crossword[1][1]+" "+crossword[1][2]);
		System.out.println(crossword[2][0]+" "+crossword[2][1]+" "+crossword[2][2]+" "+crossword[2][3]+" "+crossword[2][4]+" "+crossword[2][5]);
		System.out.println("------------");
	}
}