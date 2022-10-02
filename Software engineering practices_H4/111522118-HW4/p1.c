#include <stdio.h>
#include "awk_sem.h"

main() {
    int i = 0 ,semid1,semid2,semid3;
    // *** Please insert proper semaphore initialization here
    semid1 = create_sem(".",'S',2);
    semid2 = create_sem(".",'D',0);
    semid3 = create_sem(".",'F',0);
    do {
        // *** this is where you should place semaphore 
       P(semid1);
       P(semid1);
       printf("P1111111111 is here\n"); i++;
       // *** this is where you should place semaphore
       V(semid2);
    }  while (i < 100) ;
}
