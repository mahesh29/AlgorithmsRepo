package Template;

import java.util.Scanner;

public class TemplateForSorting 
{
	public static void sort(Comparable[] a)
	{
		// Sorting Algorithm Goes here
	}
	
	private static boolean less(Comparable v, Comparable w)
	{
		return v.compareTo(w) < 0;
	}
	
	private static void show(Comparable[] a)
	{
		// Print Array on Single Line
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	private static boolean isSorted(Comparable[] a)
	{
		// Test whether the values in array are in order
		for (int i = 0; i < a.length; i++)
		{
			if (less(a[i], a[i + 1]))
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		// Reading values from Commandline / Standard input, 
		// and then sort them and print them.
		
		//String[] a = In.readStrings();
		sort(args);
		assert isSorted(args);
		show(args);
		
		
	}
}
