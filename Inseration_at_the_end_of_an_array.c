#include <stdio.h>

int main() {
    int n, element;

    printf("Enter number of elements: ");
    scanf("%d", &n);

    int arr[n + 1];  // Allocate space for one extra element

    printf("Enter %d elements:\n", n);  // Input existing elements
    for (int i = 0; i < n; i++) {
        printf("Element %d: ", i + 1);
        scanf("%d", &arr[i]);
    }

    printf("Enter element to insert at end: ");  // Input element to insert
    scanf("%d", &element);
    arr[n] = element;  // Insert at the next position (end)

    printf("\nArray after insertion:\n");  // Display array after insertion
    for (int i = 0; i <= n; i++) {
        printf("%d ", arr[i]);
    }

    return 0;
}
