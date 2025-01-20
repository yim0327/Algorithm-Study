#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int turret(int x1, int y1, int r1, int x2, int y2, int r2) {

	double d;

	d = sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));

	// 두 원의 중심이 같을 때
	if (x1 == x2 && y1 == y2) {
		if (r1 != r2) return 0;// printf("0\n"); // 접 x 경우
		else return -1;// printf("-1\n"); // 접 inf 경우
	}
	// 두 원의 중심이 다를 때
	else {
		if (r1 + r2 < d) return 0;// printf("0\n");
		else if (r1 + r2 == d) return 1;// printf("1\n");
		else if (d > abs(r1 - r2) && d < r1 + r2) return 2;// printf("2\n");
		else if (abs(r1 - r2) == d) return 1;// printf("1\n");
		else return 0;// printf("0\n");
	}
}

int main(void)
{
	int x1, y1, r1, x2, y2, r2, t;

	scanf("%d", &t);

	int *print = (int*)malloc(t * sizeof(int));

	for (int i = 0; i < t; i++) {
		scanf("%d %d %d %d %d %d", &x1, &y1, &r1, &x2, &y2, &r2);
		print[i] = turret(x1, y1, r1, x2, y2, r2);
	}

	for (int j = 0; j < t; j++) {
		printf("%d\n", print[j]);
	}

	return 0;
}