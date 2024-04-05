/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model.bi;

import javax.ejb.Stateless;

/**
 *
 * @author User
 */
@Stateless
public class PalindromeDetector implements PalindromeDetectorLocal {
    
    
    @Override
    public String isPalindrome(String word,String reverse) {
        String outcome ="NotPalindrome";
        
        
        if(reverse.equals(word))
        {
            outcome ="Palindrome";
        }
        return outcome;
    }

    @Override
    public String reverseWord(String word) {
        String newWord="";
        for(int i=word.length()-1;i>=0;i--)
        {
            newWord+= word.charAt(i);
        }
        return newWord;
    }
    

    
}
