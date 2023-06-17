import java.io.*;
import java.util.Scanner;

public class Main {

    int countVowels,countConsonants,countSpaces,countPalindrome;

    Scanner sc=new Scanner(System.in);
    File file=null;

    public void fileWriting(){
        FileWriter bf=null;

        try{
            file=new File("FileHandlingTasks.txt");
          bf =new FileWriter(file);

        }catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("Enter any string:");
        String sample=sc.nextLine();
        try{
            bf.write(sample);

        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                bf.close();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public void fileReading(){
        int i;
        try {
            FileReader fr = new FileReader("FileHandlingTasks.txt");
            while ((i=fr.read())!=-1){
                char chk=(char)i;
                checkVowels(chk);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void fileScannerReading() {
        Scanner scr =null;
        try {
           scr= new Scanner(file);
            System.out.println("Reversed Words:");
            while (scr.hasNext()) {
                reverseWord(scr.next());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                scr.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("--------------------------");

    }

    public void reverseWord(String word){
        String reverse="";
        for(int i=word.length()-1;i>=0;i--){
            reverse=reverse+word.charAt(i);
        }
        System.out.println(reverse);
        if(word.equalsIgnoreCase(reverse)){
            countPalindrome++;
        }

    }

    public void checkVowels(char vowel){
        if(vowel=='a' || vowel=='A'|| vowel=='e'|| vowel=='E'|| vowel=='i'|| vowel=='I'|| vowel=='o'|| vowel=='O'|| vowel=='u'|| vowel=='U'){
            countVowels++;
        } else if (vowel==' ') {
            countSpaces++;
        } else countConsonants++;

    }

    public static void main(String[] args) {

        Main obj=new Main();
        obj.fileWriting();
        obj.fileReading();
        System.out.println("--------------------------");
        System.out.println("Number of Vowels In File: "+obj.countVowels);
        System.out.println("--------------------------");
        System.out.println("Number of Consonants In File: "+obj.countConsonants);
        System.out.println("--------------------------");
        System.out.println("Number of Spaces in File: "+obj.countSpaces);
        System.out.println("--------------------------");
        obj.fileScannerReading();
        System.out.println("Number of Palindrome Words in File: "+obj.countPalindrome);
        System.out.println("--------------------------");



    }
}