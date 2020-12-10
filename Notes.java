class Notes {
	public static void main (String args[]){
		int indexNumber = 234121;
		double[] notes = new double [6];
		
		notes [0] = 5;
		notes [1] = 1;
		notes [2] = 3.5;
		notes [3] = 1;
		notes [4] = 6;
		notes [5] = 4.5;
		
		System.out.println("Student: "+indexNumber);
		System.out.print("Notes: ");
		System.out.print(notes [0]+", ");
		System.out.print(notes [1]+", ");
		System.out.print(notes [2]+", ");
		System.out.print(notes [3]+", ");
		System.out.print(notes [4]+", ");
		System.out.println(notes [5]);
	}
}