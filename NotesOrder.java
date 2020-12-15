class NotesOrder {
	public static void main(String args[]){
		byte[] notes = new byte [5];
		
		// Dodaj 5 ocen o wartościach od 1 do 3 ; Popraw drugą ocenę, wstaw tam 5 ;
		notes [0] = 1;
		notes [1] = 5;
		notes [2] = 3;
		notes [3] = 1;
		notes [4] = 3;
		
		// Wyświetl 3 ostatnie oceny ;
		System.out.println("--------------------");
		System.out.print("Last three notes: ");
		System.out.print(notes[2]+", ");
		System.out.print(notes[3]+", ");
		System.out.println(notes[4]+" ");
		System.out.println("--------------------");
		
		// Ustaw oceny w tablicy w kolejności od najmniejszej do największej ;
		byte tmp;
		
		tmp = notes [4];
		notes [4] = notes [1];
		notes [1] = tmp;
		
		tmp = notes [3];
		notes [3] = notes [1];
		notes [1] = tmp;
		
		System.out.println("--------------------");
		System.out.print("All notes ascending: ");
		System.out.print(notes [0]);
		System.out.print(notes [1]);
		System.out.print(notes [2]);
		System.out.print(notes [3]);
		System.out.println(notes [4]);
		System.out.println("--------------------");
			
	}

}