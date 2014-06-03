package selectionSort;

public class Selection {

	public static void sort(Comparable[] a)
	{
		// Selection Sort Algorithm
		
		// Sort a[] into increasing order
		int N = a.length;
		for (int i = 0; i < N; i++)
		{
			// Exchange a[i] with the smallest entry in a[i-1..N]
			
			// initialize a minimum value variable
			int min = i;
			for (int j = i+1; j < N; j++)
			{
				if (less(a[j], a[min])) 
					{
						min = j;
					}
				exch(a, i, min);
			}
		}
	}
	
	private static void exch(Comparable[] a, int i, int j) 
	{
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
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
