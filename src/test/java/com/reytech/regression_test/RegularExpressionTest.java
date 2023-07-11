package com.reytech.regression_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class RegularExpressionTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void txtで終わるパターンに一致するかを検証するテスト()
    {
    	String pattern = "^.+\\.txt$";
        assertTrue("document.txt".matches(pattern)); 
        assertFalse("text.doc".matches(pattern)); 
    }
    @Test
    public void 四桁の半角数字の文字列パターンに一に一致するかを検証するテスト()
    {
    	String pattern = "^\\d{4}$";
        assertTrue("1357".matches(pattern)); 
        assertFalse("246810".matches(pattern)); 
    }
    @Test
    public void ひらがなで構成される文字列パターン一致するかを検証するテスト()
    {
    	String pattern = "^[ぁ-ん]+$";
        assertTrue("ひらがな".matches(pattern)); 
        assertFalse("カタカナ".matches(pattern)); 
    }
    @Test
    public void デート形式の文字列パターンに一致するかを検証するテスト()
    {
    	String pattern = "^\\d{4}-\\d{2}-\\d{2}$";
        assertTrue("2023-07-11".matches(pattern)); 
        assertFalse("2023/07/11".matches(pattern)); 
    }
    @Test
    public void 制御文字を含まない文字列パターンに一致するかを検証するテスト()
    {
    	String pattern = "^[^\\p{Cntrl}]+$";
        assertTrue("こんばんは！".matches(pattern)); 
        assertFalse("こんばんは！\n".matches(pattern)); 
    }
    
    
}
