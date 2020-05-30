#include <stdio.h>
int hcf(int n1, int n2);
int main() {
    int n1, n2;
   
    scanf("%d %d", &n1, &n2);
    printf("G.C.D of %d and %d = %d", n1, n2, hcf(n1, n2));
    return 0;
}

int hcf(int n1, int n2) {
    if (n2 != 0)
        return hcf(n2, n1 % n2);
    else
        return n1;
}