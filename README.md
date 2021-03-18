# NLP Exercise
NLP exercise using Java made as part of the interviewing process for Realyze Intelligence.

## How to Run
Run with any text file:
```bash
java NLP_Exercise example.txt
```
You can replace 'example.txt' with the file path of your choosing.

## Explaination
* The application reads a file line by line and iterates through each character in order to determine the current number of words, sentences, and paragraphs in any given text file.
* What is considered a word?
    * A word is any group of characters nested between:
        * Spaces: 
            * ```<space>word<space>```
        * A space and the end of a line: 
            * ```<space>word<end of line>```
    * All periods, quotes, commas, semi-colons, and dashes are considered a character
* What is considered a sentence?
    * A sentence a group of words nested between:
        * A period followed by a space: 
            * ```Sentence 1.<space>New sentence 2```
        * A period followed by a quotation and then a space: 
            * ```Sentence 1."<space>New sentence 2```
        * A quotation at the end of a line: 
            * ```Sentence 1"<end of line>```
* What is considered a paragraph?
    * A paragraph is counted: 
        * Whenever a line of a file is has no characters, i.e. anytime there is a line between sentences.
            * ```
              Sentence 1. Sentence 2.<end of line>
              <new line><end of line>
              <new line>Sentence 3.
              ```
        * Whenever the appliation reads the last line of the text file, only if the last line is not empty.
            * ```
              Sentence 1. Sentence 2.<end of line><end of file>
              ```

<br> 
--- 

Created By Caleb Foglio

[LinkedIn](https://www.linkedin.com/in/caleb-foglio-4bb84717b) | [GitHub](https://github.com/cjfoglio)