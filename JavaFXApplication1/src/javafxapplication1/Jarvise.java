/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

/**
 *
 * @author Aman
 */


public class Jarvise {
    String fileName ;
    String Word ;
    int FileLineNO;
    int hashValue;

   
   

    public Jarvise() {
        setFileName(null);
        setWord(null);
        setFileLineNO(0);
    }

    public Jarvise(String fileName) {
         setFileName(fileName);
    }

    public Jarvise(String fileName, String Word) {
       setFileName(fileName);
        setWord(Word);
    }

    public Jarvise(String fileName, String Word, int FileLineNO) {
       setFileName(fileName);
        setWord(Word);
         setFileLineNO(FileLineNO);
    }
    public Jarvise(String fileName, String Word, int FileLineNO , int hashValue) {
       setFileName(fileName);
        setWord(Word);
         setFileLineNO(FileLineNO);
         setHashValue(hashValue);
    }
     public int getHashValue() {
        return hashValue;
    }

    public void setHashValue(int hashValue) {
        this.hashValue = hashValue;
    }
        
   
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    

    public void setWord(String Word) {
        this.Word = Word;
    }

    public String getWord() {
        return Word;
    }

    public void setFileLineNO(int FileLineNO) {
        this.FileLineNO = FileLineNO;
    }
    public int getFileLineNO() {
       return FileLineNO;
    }
}

