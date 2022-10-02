#include <stdio.h>
#include "awk_sem.h"

main() {
    int i = 0 ,semid1,semid2,semid3;
    // *** please insert proper semaphore initialization here
    semid1=get_sem(".",'S');
    semid2=get_sem(".",'D');
    semid3=get_sem(".",'F');
    do {
        // *** this is where you should place semaphore 
       P(semid2);
       printf("P222222222 is here\n"); i++ ;
       
       // *** this is where you should place semaphore
       V(semid3);
       V(semid3);
    }  while (i < 100);
}
