// 先清除先前所有semaphore

ipcrm -a

//編譯p1 p2 p3

sudo gcc -o p1 p1.c sem.c

sudo gcc -o p2 p2.c sem.c

sudo gcc -o p2 p2.c sem.c

//執行p1 p2 p3(p2,p3順序可調換)

./p1 &

./p2 &

./p3 &