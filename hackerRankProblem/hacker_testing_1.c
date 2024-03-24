#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// Function to swap two strings
void swap(char **a, char **b) {
    char *temp = *a;
    *a = *b;
    *b = temp;
}

// Function to reverse a portion of the array of strings
void reverse(char **s, int start, int end) {
    while (start < end) {
        swap(&s[start], &s[end]);
        start++;
        end--;
    }
}

// Function to find the next lexicographically greater permutation
int next_permutation(int n, char **s) {
    // Find the rightmost string that is smaller than its next string
    int i;
    for (i = n - 2; i >= 0; i--) {
        if (strcmp(s[i], s[i + 1]) < 0)
            break;
    }

    // If no such string is found, then the current permutation is the last permutation
    if (i == -1)
        return 0;

    // Find the rightmost string that is greater than the above found string
    int j;
    for (j = n - 1; j > i; j--) {
        if (strcmp(s[j], s[i]) > 0)
            break;
    }

    // Swap the above two found strings
    swap(&s[i], &s[j]);

    // Reverse the strings from index (i+1) to the end
    reverse(s, i + 1, n - 1);

    return 1;
}

int main() {
    char **s;
    int n;
    scanf("%d", &n);
    s = calloc(n, sizeof(char *));
    for (int i = 0; i < n; i++) {
        s[i] = calloc(11, sizeof(char));
        scanf("%s", s[i]);
        // printf("s[i]%s:",s[i]);

        
    }
    do {
        for (int i = 0; i < n; i++)
            printf("%s%c", s[i], i == n - 1 ? '\n' : ' ');
    } while (next_permutation(n, s));
    for (int i = 0; i < n; i++)
        free(s[i]);
    free(s);
    return 0;
}
