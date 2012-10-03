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

import com.xanthodont.ccompiler.lexicalanalyzer.states.State0;
import com.xanthodont.ccompiler.structuresystem.Tag;
import com.xanthodont.ccompiler.structuresystem.Token;

/**
 * �ʷ������࣬����ȥ��ע�͡��հ׷���ʶ������ʷ���Ԫ
 * @author xanthondont
 *
 */
public class Lexer {

	/** �к� */
	public int _line = 1;
	/** �к� */
	public int _row = 1;
	/** ���Դ����һ���ַ� */
	private char _peek = ' ';
	/** ����ؼ��ֺͱ�ʶ�� */
	private Hashtable<Integer, String> _words = new Hashtable<Integer, String>();
	/** Դ�����ȡ�� */
	private SourceCodeFileReader _reader = null;
	
	/** ״̬�ӿ� */
	private IState _state;
	/** �Ƿ���˶�ȡ�����Կ���_peek�Ƿ��ȡ��һ���ַ� */
	private boolean _isBack = false;
	
	/**
	 * ���췽��
	 * 	��ʼ�������ؼ��ֳ�ʼ����words������
	 */
	public Lexer(String fileName)
	{
		this._reader = new SourceCodeFileReader(fileName);
		this.initKeywords();
		
		this._state = new State0();	// ��ʼ״̬
	}
	
	/**
	 * ����״̬
	 * @param state Ҫ���õľ���״̬
	 */
	public void setState(IState state)
	{
		this._state = state;
	}
	/**
	 * ��ȡ״̬
	 * @return
	 */
	public IState getState()
	{
		return this._state;
	}
	
	/**
	 * ���ؼ��ֳ�ʼ����words������
	 */
	private void initKeywords() {
		// TODO Auto-generated method stub
		this._words.put(Tag.AUTO, 		"auto");
		this._words.put(Tag.BREAK, 		"break");
		this._words.put(Tag.CASE, 		"case");
		this._words.put(Tag.CHAR, 		"char");
		this._words.put(Tag.CONST, 		"const");
		this._words.put(Tag.CONTINUE, 	"continue");
		this._words.put(Tag.DEFAULT, 	"default");
		this._words.put(Tag.DO, 		"do");
		this._words.put(Tag.DOUBLE, 	"double");
		this._words.put(Tag.ELSE, 		"else");
		this._words.put(Tag.ENUM, 		"enum");
		this._words.put(Tag.EXTERN, 	"extern");
		this._words.put(Tag.FLOAT, 		"float");
		this._words.put(Tag.FOR, 		"for");
		this._words.put(Tag.GOTO, 		"goto");
		this._words.put(Tag.IF,	   	 	"if");
		this._words.put(Tag.INT, 		"int");
		this._words.put(Tag.LONG, 		"long");
		this._words.put(Tag.REGISTER, 	"register");
		this._words.put(Tag.RETURN, 	"return");
		this._words.put(Tag.SHORT, 		"short");
		this._words.put(Tag.SIGNED, 	"signed");
		this._words.put(Tag.SIZEOF, 	"sizeof");
		this._words.put(Tag.STATIC, 	"static");
		this._words.put(Tag.STRUCT, 	"struct");
		this._words.put(Tag.SWITCH, 	"switch");
		this._words.put(Tag.TYPEDEF, 	"typedef");
		this._words.put(Tag.UNION, 		"union");
		this._words.put(Tag.UNSIGNED, 	"unsigned");
		this._words.put(Tag.VOID, 		"void");
		this._words.put(Tag.VOLATILE,   "volatile");
		this._words.put(Tag.WHILE, 		"while");
	}
	
	/**
	 * �ʷ���Ԫɨ��
	 * @return ɨ�赽�Ĵʷ���Ԫ
	 */
	public Token scan()
	{
		while(true)
		{
			if(!_isBack)
			{
				int t = _reader.readByBuffers();
				if(t == -1)
					return null;
				else
					_peek = (char)t;
			}
			_isBack = false;
			int result = _state.handle(this, _peek);
			if(result == StateHandleResult.Normal)
			{
				
			}
			else if(result == StateHandleResult.Receive)
			{
				
			}
			else if(result == StateHandleResult.Receive_back)
			{
				_isBack = true;
			}
		}
	}
	
	public String toString()
	{
		return String.format("line:%d", _line).toString();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "D:\\Projects\\Git\\lexer.txt";
		Lexer lexer = new Lexer(fileName);
		lexer.scan();
	}

}
