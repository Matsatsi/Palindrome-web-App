/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model.bi;

import javax.ejb.Local;

/**
 *
 * @author User
 */
@Local
public interface PalindromeDetectorLocal {

    String isPalindrome(String word,String reverse);

    String reverseWord(String word);
    
}
