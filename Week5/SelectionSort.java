/**The class is used to implement the Selection sort algorithm. 
 * 
 * @author Karim
 * @version
 *
 */
public class EX1 {

	// return int array
	public static int[] selectionSort(int[] numbers) {

		// we set all these to zero. Temp is used for swapping.
		int i, j, minValue, minIndex, temp = 0;

		for (i = 0; i < numbers.length; i++) // Outer for loop
		{
			// we now initialise minvalue and minIndex to first unsorted item each time
			// through the outer loop.
			minValue = numbers[i];
			minIndex = i;

			// we now need our inner loop.
			// starts at unsorted item and continues to last item.
			// Meaning we go from j = i to 5.

			for (j = i; j < numbers.length; j++) {

				// we want to do a comparisons.
				// if the numbers item is less than the minimum value, then change the min into
				// that item we are comparing to. and set the index
				if (numbers[j] < minValue) {
					minValue = numbers[j];
					minIndex = j;
				}
			}

			//after each iteration, we check if the min value is the first unsorted value.
			if (minValue < numbers[i]) {
				temp = numbers[i];
				numbers[i] = numbers[minIndex];
				numbers[minIndex] = temp;
			}

		}

		return numbers;
	}

	public static void main(String[] args) {

		int[] array = { 2, 10, 31, 229, 44, 9, 1 };

		System.out.printf("The values of the original array are:%n");

		// output original array elements using enhanced for statements
		for (int value : array)
			System.out.printf("  %d", value);

		selectionSort(array); // pass array into selection sort method
		System.out.printf("%n%nThe values we obtain after Selection sort are:%n");

		// output modified array elements
		for (int value : array)
			System.out.printf("  %d", value);
	
	}

}
