#include <stdio.h>
#include <stdlib.h>

typedef struct {
    int zero;
    int one;
} Count;

Count fibonacci(int n, Count* memo) {
    if (n == 0) {
        memo[0].zero = 1;
        memo[0].one = 0;
        return memo[0];
    }
    if (n == 1) {
        memo[1].zero = 0;
        memo[1].one = 1;
        return memo[1];
    }
    if (memo[n].zero != -1 && memo[n].one != -1) {
        return memo[n];
    }

    Count c1 = fibonacci(n - 1, memo);
    Count c2 = fibonacci(n - 2, memo);

    memo[n].zero = c1.zero + c2.zero;
    memo[n].one = c1.one + c2.one;

    return memo[n];
}

int main(void) {
    int t;
    scanf("%d", &t);

    int* print = (int*)malloc(t * sizeof(int));
    for (int i = 0; i < t; i++) {
        scanf("%d", &print[i]);
    }

    for (int i = 0; i < t; i++) {
        int n = print[i];
        Count* memo = (Count*)malloc((n + 1) * sizeof(Count));
        for (int j = 0; j <= n; j++) {
            memo[j].zero = -1;
            memo[j].one = -1;
        }

        Count result = fibonacci(n, memo);
        printf("%d %d\n", result.zero, result.one);

        free(memo);
    }

    free(print);
    return 0;
}