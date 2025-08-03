#include <stdio.h>

int main() {
    int n;

    printf("Enter the number of elements: ");
    scanf("%d", &n);

    int arr[n];

    printf("Enter %d elements:\n", n);         // Input elements into array
    for (int i = 0; i < n; i++) {
        printf("Element %d: ", i + 1);
        scanf("%d", &arr[i]);
    }

    printf("\nChecking elements:\n");          // Traverse and check each element
    for (int i = 0; i < n; i++) {
        if (arr[i] > 0) {
            printf("Element at index %d is Positive (%d)\n", i, arr[i]);
        } else if (arr[i] < 0) {
            printf("Element at index %d is Negative (%d)\n", i, arr[i]);
        } else {
            printf("Element at index %d is Zero\n", i);
        }
    }

    return 0;
}
