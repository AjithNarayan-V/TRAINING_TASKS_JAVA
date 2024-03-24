// Java code to implement the above approach

class arrayRotation {

	public static void rotate(int arr[], int d, int n)
	{
		int p = 0;
		while (p < d) {
			int last = arr[0];
			for (int i = 0; i < n - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[n - 1] = last;
			p++;
		}

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	// Driver's code
	public static void main(String[] args)
	{
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int n = arr.length;
		// Rotate 2 times
		int d = 2;

		// Function call
		rotate(arr, d, n);
	}
}
