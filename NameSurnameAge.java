class NameSurnameAge {
	public static void main(String args[]){
		char[] name = new char[5];
		char[] surname = new char[]{'M','i','c','h','n','i','e','w','i','c','z'};
		int age = 22;
		
		//Imiê
		name [0] = 'K';
		name [1] = 'a';
		name [2] = 'r';
		name [3] = 'o';
		name [4] = 'l';
		
		System.out.println("-----------------------------");
		System.out.print("Name: ");
		System.out.print(name [0]);
		System.out.print(name [1]);
		System.out.print(name [2]);
		System.out.print(name [3]);
		System.out.print(name [4]);
		System.out.println(" ["+name.length+"]");
		System.out.print("Surname: ");
		System.out.print(surname);
		System.out.println(" ["+surname.length+"]");
		System.out.println("Age: "+age);
		System.out.println("-----------------------------");
	}
}