import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

class AddressBookMain {
	public static void main(String args[])
	{
		System.out.println("	 Welcome To AddressBook !");
		System.out.println("	**************************");
		
		Contacts people1 = new Contacts();
		people1.addContact();
	}
}

// Adding multiple peoples to address book
class Contacts
{
	public void addContact()
	{
		ArrayList<String> firstContact = new ArrayList<String>(7);
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println(" ");		
		System.out.println("Enter the contact details  : ");
		System.out.println("name address city state zip phoneNo email  : ");
		
		for(int i =0; i < firstContact.size(); i++)
		{
			String s = sc.nextLine();
			firstContact.add(s);
		}
		count++;
		System.out.println(" -------------------------------------------");
		System.out.println("contact" + count+ " details added :");
		System.out.println("contact" + count + " is "+ firstContact );
		
	}
}