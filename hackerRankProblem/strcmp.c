#include <stdio.h>
#include <string.h>

int main() {
    char *a = "a";
    char *b = "bc";

    int result = strcmp(a, b);
    
    if (result < 0)
        printf("'%s' is less than '%s'\n", a, b);
    else if (result > 0)
        printf("'%s' is greater than '%s'\n", a, b);
    else
        printf("'%s' is equal to '%s'\n", a, b);
    
    return 0;
}
