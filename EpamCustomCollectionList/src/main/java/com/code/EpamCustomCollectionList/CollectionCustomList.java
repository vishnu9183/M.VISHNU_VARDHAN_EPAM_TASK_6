package com.code.EpamCustomCollectionList;
import java.util.*;
import java.util.logging.Logger;
public class CollectionCustomList {
	 @SuppressWarnings("rawtypes")
	ArrayList AList = new ArrayList();
	 final static Logger logger = Logger.getLogger("CollectionCustomList.java");
	 @SuppressWarnings("unchecked")
	 //Adding an element
	 int Adding(String i)
	 {
		 AList.add(i);
		 //System.out.println("Element added successfully");
		 return 1;
	 }
	 
	 //Printing elements in list
	 Object Printing()
	 {
		return AList;
	 }

	 //Removing an element
	 int Removing(String r)
	 {
		 if(AList.contains(r)) 
		 {
			 AList.remove(r);
			 //System.out.println("Element deleted successfully");
			 return 1;
		 }
		 else
			 return 0;
			 //System.out.println("element not found");

	 }

	 //Fetch an element from list
	 Object Fetching(int index)
	 {
		 logger.info("Index should be greater than Zero");
		 if(index<0)
		 {
			 logger.warning("Index can't be Negative\n");
		 }
		 return AList.get(index-1);
	 }
}