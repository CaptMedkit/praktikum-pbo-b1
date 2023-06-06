/*	Nama File: SerializePerson.java 
	Pembuat: Vicoriza Ramadhani
	NIM: 24060121130053
	LAB: B1
	30/05/2023
*/

import java.io.*;

class Person implements Serializable
{
	private String name;
	public Person(String n)
	{
		name = n;
	}
	
	public String getName()
	{
		return name;
	}
}

public class SerializePerson
{
	public static void main(String[] args)
	{
		Person person = new Person("Panji");
		try
		{
			FileOutputStream f= new FileOutputStream("person.ser");
			ObjectOutputStream s = new ObjectOutputStream(f);
			s.writeObject(person);
			System.out.println("Selesai menulis objek person");
			s.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}