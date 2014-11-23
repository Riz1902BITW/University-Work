#include <stdio.h>
#include <stdlib.h>

//The internals of this struct aren't important
//from the user's point of view
typedef struct{
  FILE* file;        //File being read
  int bufferlength;  //Fixed buffer length
  int usedbuffer;    //Current point in the buffer
  char* buffer;      //A pointer to a piece of memory
                     //  same length as "bufferlength"
  int byte_tot;     //Integer to store the total amount of bytes that were read from the file.
} cr_file;




//Open a file with a given size of buffer to cache with
cr_file* cr_open(char* filename, int buffersize);


//Close an open file
void cr_close(cr_file* f);

//Read a byte.  Will return EOF if empty.
char cr_read_byte(cr_file* f);



//---------------------------------------------------------

//Refill an empty buffer.  Not intended for users
int refill(cr_file* buff);
