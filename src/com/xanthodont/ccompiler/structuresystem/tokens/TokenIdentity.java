/************************************************************************
* 版权所有 (C)2012,xanthodont 
* http://www.cnblogs.com/hbq-fczzw/	
* http://weibo.com/u/2106149344					 
*																		 
* 文件名称：TokenIdentity.java							                     
* 内容摘要： 代表标识符的记号类                                                            
* 其它说明：                                                             
* 当前版本：v1.0												         
* 作	者：	   xanthodont											         
* 完成日期：2012-10-1                      									     
************************************************************************/
package com.xanthodont.ccompiler.structuresystem.tokens;

import com.xanthodont.ccompiler.structuresystem.Tag;
import com.xanthodont.ccompiler.structuresystem.Token;
/**
 * 表示标识符的记号类
 * @author xanthondont
 *
 */
public class TokenIdentity extends Token{

	/** 标识符串 */
	private String _lexeme;
	
	/**
	 * 构造方法
	 * @param lexeme 标识符串
	 */
	public TokenIdentity(String lexeme)
	{
		super(Tag.IDENTITY);
		this._lexeme = lexeme;
	}
	/**
	 * 构造方法，主要用以关键字
	 * @param tag 关键字类别
	 * @param lexeme 关键字串
	 */
	public TokenIdentity(int tag, String lexeme)
	{
		super(tag);
		this._lexeme = lexeme;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
