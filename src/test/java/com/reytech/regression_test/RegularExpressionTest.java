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
        assertTrue("1234".matches(pattern)); // 4桁の半角数字の文字列 "1234" はパターンに一致する
        assertFalse("456".matches(pattern)); // 3桁の半角数字の文字列 "456" はパターンに一致しない
    }
    @Test
    public void ひらがなで構成される文字列パターンに一に一致するかを検証するテスト()
    {
    	String pattern = "^[ぁ-んー]+$";
        assertTrue("ひらがな".matches(pattern)); // ひらがなで構成される文字列 "ひらがな" はパターンに一致する
        assertFalse("カタカナ".matches(pattern)); // カタカナを含む文字列 "カタカナ" はパターンに一致しない
    }
    @Test
    public void デート形式の文字列ターンに一致するかを検証するテスト()
    {
    	String pattern = "^\\d{4}-\\d{2}-\\d{2}$";
        assertTrue("2023-07-09".matches(pattern)); // YYYY-MM-DD形式の文字列 "2023-07-09" はパターンに一致する
        assertFalse("2023/07/09".matches(pattern)); // ハイフン以外の区切り文字を含む文字列 "2023/07/09" はパターンに一致しない
    }
    @Test
    public void 制御文字を含まない文字列ターンに一致するかを検証するテスト()
    {
    	String pattern = "^[^\\p{Cntrl}]+$";
        assertTrue("Hello World".matches(pattern)); // 制御文字を含まない文字列 "Hello World" はパターンに一致する
        assertFalse("こんにちは\n".matches(pattern)); // 改行文字を含む文字列 "こんにちは\n" はパターンに一致しない
    }
}
