class NotesOrder {
	public static void main(String args[]){
		byte[] notes = new byte [5];
		
		// Dodaj 5 ocen o warto�ciach od 1 do 3 ; Popraw drug� ocen�, wstaw tam 5 ;
		notes [0] = 1;
		notes [1] = 5;
		notes [2] = 3;
		notes [3] = 1;
		notes [4] = 3;
		
		// Wy�wietl 3 ostatnie oceny ;
		System.out.println("--------------------");
		System.out.print("Last three notes: ");
		System.out.print(notes[2]+", ");
		System.out.print(notes[3]+", ");
		System.out.println(notes[4]+" ");
		System.out.println("--------------------");
		
		// Ustaw oceny w tablicy w kolejno�ci od najmniejszej do najwi�kszej ;
		byte tmp0 = notes [0];
		byte tmp1 = notes [3];
		byte tmp2 = notes [2];
		byte tmp3 = notes [4];
		byte tmp4 = notes [1];
		
		System.out.println("--------------------");
		System.out.print("All notes ascending: ");
		System.out.print(tmp0+", ");
		System.out.print(tmp1+", ");
		System.out.print(tmp2+", ");
		System.out.print(tmp3+", ");
		System.out.println(tmp4);
		System.out.println("--------------------");
			
	}

}