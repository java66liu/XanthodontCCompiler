/************************************************************************
* 版权所有 (C)2012,xanthodont 
* http://www.cnblogs.com/hbq-fczzw/		
* http://weibo.com/u/2106149344				 
*																		 
* 文件名称：Lexer.java							                     
* 内容摘要： 词法分析类                                                            
* 其它说明：                                                             
* 当前版本：v1.0												         
* 作	者：	   xanthodont											         
* 完成日期：2012-10-1                      									     
************************************************************************/
package com.xanthodont.ccompiler.lexicalanalyzer;

import java.util.Hashtable;

import com.xanthodont.ccompiler.lexicalanalyzer.states.State0;
import com.xanthodont.ccompiler.structuresystem.Tag;
import com.xanthodont.ccompiler.structuresystem.Token;

/**
 * 词法分析类，用以去除注释、空白符，识别各个词法单元
 * @author xanthondont
 *
 */
public class Lexer {

	/** 行号 */
	public int _line = 1;
	/** 列号 */
	public int _row = 1;
	/** 用以存放下一个字符 */
	private char _peek = ' ';
	/** 保存关键字和标识符 */
	private Hashtable<Integer, String> _words = new Hashtable<Integer, String>();
	/** 源代码读取器 */
	private SourceCodeFileReader _reader = null;
	
	/** 状态接口 */
	private IState _state;
	/** 是否回退读取，用以控制_peek是否读取下一个字符 */
	private boolean _isBack = false;
	
	/**
	 * 构造方法
	 * 	初始化，将关键字初始化到words对象中
	 */
	public Lexer(String fileName)
	{
		this._reader = new SourceCodeFileReader(fileName);
		this.initKeywords();
		
		this._state = new State0();	// 开始状态
	}
	
	/**
	 * 设置状态
	 * @param state 要设置的具体状态
	 */
	public void setState(IState state)
	{
		this._state = state;
	}
	/**
	 * 获取状态
	 * @return
	 */
	public IState getState()
	{
		return this._state;
	}
	
	/**
	 * 将关键字初始化到words对象中
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
	 * 词法单元扫描
	 * @return 扫描到的词法单元
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
