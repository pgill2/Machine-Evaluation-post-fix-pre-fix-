# Machine-Evaluation-post-fix-pre-fix-

Assume a machine that has a single register and six instructions. 
LD A Places the operand A into the register. 
ST A Places the content of the register into the variable A. 
AD A Adds the content of the variable A from the register. 
SB A Subtracts the contents of the variable A from the register. 
ML A Multiplies the contents of the register by the variable A. 
DV A Divides the contents of the register by the variable A. 


The Program:

Write a program that accepts a postfix expression containing single letter operands and the 
operators +, -, *, and / and prints a sequence of instructions to evaluate the expression and 
leave the result in the register. Use variables of the form TEMP as temporary variables. For 
example, using the postfix expression ABC*+DE-/ should print the following: 
 LD B 
 ML C 
 ST TEMP1 
 LD A 
 AD TEMP1 
 ST TEMP2 
 LD D 
 SB E 
 ST TEMP3 
 LD TEMP2 
 DV TEMP3 
 ST TEMP4 

Goal is to create this using stack code without the use of any built in library functions in Java. 


