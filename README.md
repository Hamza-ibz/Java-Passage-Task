# Java-Passage-Task

In NetBeans, open the project called ‘Task1’ and inspect the data file provided called datafile.txt. This file contains a passage of text that is encoded. You are not required to, and should not, alter this text file i.e., it is intended to be read-only.
The encoded data file uses a very simple cipher based on the encryption of the positions of vowels and consonants from the English alphabet. These positions (with respect to the cipher that is employed) are illustrated in Tables 1 and 2. Note that for the purposes of this cipher the letter y (or Y) is counted as a vowel.

![Screenshot 2022-11-09 at 21 01 02](https://user-images.githubusercontent.com/93152488/200940886-a2f3d2ee-14b4-4353-a18c-5e0709862ec0.png)

The cipher works by substituting the relevant alphabet character for the position based on the tables. During the encoding of a passage of text, a vowel is denoted by inserting the letter ‘V’ followed directly by its position index. For example, the uppercase letter ‘A’ is encoded as ‘V2’. Similarly, a consonant is encoded by inserting the letter ‘C’ followed directly by its position index. For example, the lowercase letter ‘h’ is encoded as ‘C11’. For example, the word Apples would be encoded as V2C23C23C17V3C29.
To keep this deciphering task even simpler, the encoded data file has no punctuation and comprises only words separated by whitespace (and newlines).
Your task is to write a Java 8 program (as a NetBeans 8 project) that opens the data file, parses the characters in the data file, deciphers them to normal text and prints the decoded passage of text to the console. Newlines and blank lines must be maintained in the decoding.
In addition to the console output, your program should also save all the output to a text file in the NetBeans project root folder. Name the file results.txt.
Having performed these actions, your program should close the opened file(s) properly and deal with file handling exceptions correctly.
Your solution to Task 1 will be assessed according to robustness, functionality, and the correctness of program output.
When checking your solution, the tutors will use different test files, but with the same encoding to that provided. In other words, the program should execute in the same way, but the program outputs will be different. The markers will examine these different outputs to verify the correctness of your program.
