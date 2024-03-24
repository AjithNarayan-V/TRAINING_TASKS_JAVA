#include <stdio.h>
#include <stdlib.h>
#include <string.h>
void swap(char* x, char* y) 
{ 
	char temp; 
	temp = *x; 
	*x = *y; 
	*y = temp; 
}
int next_permutation(int n, char **s)
{

    	int i; 
	if (l == r) 
		printf("%s\n", a); 
	else { 
		for (i = l; i <= r; i++) { 
			swap((a + l), (a + i)); 
			permute(a, l + 1, r); 
			swap((a + l), (a + i)); // backtrack 
		} 
	} 
	/**
	* Complete this method
	* Return 0 when there is no next permutation and 1 otherwise
	* Modify array s to its next permutation
	*/
}

int main()
{
	char **s;
	int n;
	scanf("%d", &n);
	s = calloc(n, sizeof(char*));
	for (int i = 0; i < n; i++)
	{
		s[i] = calloc(11, sizeof(char));
		scanf("%s", s[i]);
	}
	do
	{
		for (int i = 0; i < n; i++)
			printf("%s%c", s[i], i == n - 1 ? '\n' : ' ');
	} while (next_permutation(n, s));
	for (int i = 0; i < n; i++)
		free(s[i]);
	free(s);
	return 0;
}




// // C program to print all permutations with duplicates 
// // allowed 
// #include <stdio.h> 
// #include <string.h> 

// /* Function to swap values at two pointers */
// void swap(char* x, char* y) 
// { 
// 	char temp; 
// 	temp = *x; 
// 	*x = *y; 
// 	*y = temp; 
// } 

// /* Function to print permutations of string 
// This function takes three parameters: 
// 1. String 
// 2. Starting index of the string 
// 3. Ending index of the string. */
// void permute(char* a, int l, int r) 
// { 
// 	int i; 
// 	if (l == r) 
// 		printf("%s\n", a); 
// 	else { 
// 		for (i = l; i <= r; i++) { 
// 			swap((a + l), (a + i)); 
// 			permute(a, l + 1, r); 
// 			swap((a + l), (a + i)); // backtrack 
// 		} 
// 	} 
// } 

// /* Driver code */
// int main() 
// { 
// 	char str[] = "ABC"; 
// 	int n = strlen(str); 
// 	permute(str, 0, n - 1); 
// 	return 0; 
// }
