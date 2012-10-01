/************************************************************************
* ��Ȩ���� (C)2012,xanthodont 
* http://www.cnblogs.com/hbq-fczzw/		
* http://weibo.com/u/2106149344				 
*																		 
* �ļ����ƣ�Lexer.java							                     
* ����ժҪ�� �ʷ�������                                                            
* ����˵����                                                             
* ��ǰ�汾��v1.0												         
* ��	�ߣ�	   xanthodont											         
* ������ڣ�2012-10-1                      									     
************************************************************************/
package com.xanthodont.ccompiler.lexicalanalyzer;

import java.util.Hashtable;

import com.xanthodont.ccompiler.structuresystem.Tag;
import com.xanthodont.ccompiler.structuresystem.Token;

/**
 * �ʷ������࣬����ȥ��ע�͡��հ׷���ʶ������ʷ���Ԫ
 * @author xanthondont
 *
 */
public class Lexer {

	/** �к� */
	public int line = 1;
	/** �к� */
	public int row = 1;
	/** ���Դ����һ���ַ� */
	private char peek = ' ';
	/** ����ؼ��ֺͱ�ʶ�� */
	private Hashtable<Integer, String> words = new Hashtable<Integer, String>();
	
	/**
	 * ���췽��
	 * 	��ʼ�������ؼ��ֳ�ʼ����words������
	 */
	public Lexer()
	{
		this.initKeywords();
	}
	
	/**
	 * ���ؼ��ֳ�ʼ����words������
	 */
	private void initKeywords() {
		// TODO Auto-generated method stub
		this.words.put(Tag.AUTO, 		"auto");
		this.words.put(Tag.BREAK, 		"break");
		this.words.put(Tag.CASE, 		"case");
		this.words.put(Tag.CHAR, 		"char");
		this.words.put(Tag.CONST, 		"const");
		this.words.put(Tag.CONTINUE, 	"continue");
		this.words.put(Tag.DEFAULT, 	"default");
		this.words.put(Tag.DO, 			"do");
		this.words.put(Tag.DOUBLE, 		"double");
		this.words.put(Tag.ELSE, 		"else");
		this.words.put(Tag.ENUM, 		"enum");
		this.words.put(Tag.EXTERN, 		"extern");
		this.words.put(Tag.FLOAT, 		"float");
		this.words.put(Tag.FOR, 		"for");
		this.words.put(Tag.GOTO, 		"goto");
		this.words.put(Tag.IF,	   	 	"if");
		this.words.put(Tag.INT, 		"int");
		this.words.put(Tag.LONG, 		"long");
		this.words.put(Tag.REGISTER, 	"register");
		this.words.put(Tag.RETURN, 		"return");
		this.words.put(Tag.SHORT, 		"short");
		this.words.put(Tag.SIGNED, 		"signed");
		this.words.put(Tag.SIZEOF, 		"sizeof");
		this.words.put(Tag.STATIC, 		"static");
		this.words.put(Tag.STRUCT, 		"struct");
		this.words.put(Tag.SWITCH, 		"switch");
		this.words.put(Tag.TYPEDEF, 	"typedef");
		this.words.put(Tag.UNION, 		"union");
		this.words.put(Tag.UNSIGNED, 	"unsigned");
		this.words.put(Tag.VOID, 		"void");
		this.words.put(Tag.VOLATILE,    "volatile");
		this.words.put(Tag.WHILE, 		"while");
	}
	
	/**
	 * �ʷ���Ԫɨ��
	 * @return ɨ�赽�Ĵʷ���Ԫ
	 */
	public Token scan()
	{
		return null;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
