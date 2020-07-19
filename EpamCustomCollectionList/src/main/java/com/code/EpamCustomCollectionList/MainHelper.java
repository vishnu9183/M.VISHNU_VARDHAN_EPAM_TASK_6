package com.code.EpamCustomCollectionList;

import java.util.*;

public class MainHelper{

@SuppressWarnings("rawtypes")
public static void main(String[] args) {
	CollectionCustomList c=new CollectionCustomList();
			System.out.println("\n1.Add an element to the Custom Collection Listn"
					+ "2.Fetch an element from the Custom Collection List\n"
					+ "3.Remove an elemnt from the Custom Collection List\n"
					+ "4.Print the Custom Collection List");

			System.out.println("Enter your choice:");

			Scanner s=new Scanner(System.in);
			int a = 0;
			int choice=s.nextInt();

			switch(choice)
			{
			case 1:
					System.out.println("Enter the number of elements:");
					int var1=s.nextInt();
					System.out.println("Enter the elements:");
					for(int i=0;i<var1;i++)
					{
					String v=s.next();
					a=c.Adding(v);
					}
					if(a==1)
						System.out.println("Element added successfully");
					else
						System.out.println("Element can't be added");
					break;

			case 2:
					System.out.println("Enter the index of element to retreive:");
					int g=s.nextInt();
					Object o=c.Fetching(g);
					System.out.println("The element at index "+g +" is:"+o);
			        break;
			case 3:
					System.out.println("Enter index of element to remove:");
					String r=s.next();
					a=c.Removing(r);
					if(a==1)
						System.out.println("Element Deleted successfully");
					else
						System.out.println("Element can't be Deleted");
					break;
			case 4:System.out.println("Elements in Custom Collection List are:");
				   System.out.println((ArrayList) c.Printing());
				   break;
			default:

					System.out.println("Enter correct Input");

			}

			s.close();
			}

		}
