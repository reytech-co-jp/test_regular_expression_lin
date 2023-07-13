package com.reytech.regression_test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RegularExpressionTest {

	@Test
	public void txtで終わるパターンに一致するかを検証するテスト() {
		String pattern = "^.+\\.txt$";
		assertTrue("document.txt".matches(pattern));
		assertTrue("myFile.txt".matches(pattern));
		assertFalse("image.jpg".matches(pattern));
		assertFalse("powerpoint.pptx".matches(pattern));
	}

	@Test
	public void 四桁の半角数字の文字列パターンに一致するかを検証するテスト() {
		String pattern = "^\\d{4}$";
		assertTrue("1234".matches(pattern));
		assertTrue("5678".matches(pattern));
		assertFalse("456".matches(pattern));
		assertFalse("789".matches(pattern));
	}

	@Test
	public void ひらがなで構成される文字列パターンに一致するかを検証するテスト() {
		String pattern = "^[ぁ-んー]+$";
		assertTrue("ひらがな".matches(pattern));
		assertTrue("せいきひょうげん".matches(pattern));
		assertFalse("カタカナ".matches(pattern));
		assertFalse("Regular Expression".matches(pattern));
	}

	@Test
	public void デート形式の文字列ターンに一致するかを検証するテスト() {
		String pattern = "^\\d{4}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$";
		assertTrue("2001-02-26".matches(pattern));
		assertTrue("2001-10-30".matches(pattern));
		assertFalse("2001-26-02".matches(pattern));
		assertFalse("2001/26/02".matches(pattern));
	}

	@Test
	public void 制御文字を含まない文字列ターンに一致するかを検証するテスト() {
		String pattern = "^[^\\p{Cntrl}]+$";
		assertTrue("Hello Lin Leck!".matches(pattern));
		assertTrue("リンさん、こんにちは!".matches(pattern));
		assertFalse("Hello Lin\tLeck!".matches(pattern));
		assertFalse("リンさん、こんにちは!\n".matches(pattern));
	}
}
