#include <stdio.h>
void main() {
    int x, y;
    int* ptr;
    x =  0;
    ptr = &x;
    y = *ptr;
    *ptr = 1;
    printf("%d,%d", x,y);
}

// int* ptr is a integer pointer
// ptr expects an address not a value
// *ptr expects a value not an address

// while output
// *ptr gives variables value
// ptr gives address of variable
// &ptr gives address of the pointer