class Crossword {
	public static void main(String args[]){
			
		char[][] crossword = {{'w','i','l','k'},{'k','o','t'},{'z','y','r','a','f','a'}};
		
		// Show the third letter of the second word
		System.out.println("Third letter of the second word: "+crossword[1][2]);
		System.out.println();
		
		// Show the first letter of the first word
		System.out.println("First letter of the first word: "+crossword[0][0]);
		System.out.println();
		
		// Replace the last letter of the third word by 'y'
		crossword [2][5] = crossword[2][1];
		
		// Show length of the second word
		System.out.println("Length of the second word: "+crossword[1].length);
		System.out.println();
		
		// Show whole crossword
		System.out.println("------------");
		System.out.println(crossword[0][0]+" "+crossword[0][1]+" "+crossword[0][2]+" "+crossword[0][3]);
		System.out.println(crossword[1][0]+" "+crossword[1][1]+" "+crossword[1][2]);
		System.out.println(crossword[2][0]+" "+crossword[2][1]+" "+crossword[2][2]+" "+crossword[2][3]+" "+crossword[2][4]+" "+crossword[2][5]);
		System.out.println("------------");
	}
}