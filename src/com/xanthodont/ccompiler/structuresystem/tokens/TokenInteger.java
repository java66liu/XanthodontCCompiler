/************************************************************************
* 版权所有 (C)2012,xanthodont 
* http://www.cnblogs.com/hbq-fczzw/						 
*																		 
* 文件名称：TokenNumber.java							                     
* 内容摘要： 表示整型数记号的类                                                            
* 其它说明：                                                             
* 当前版本：v1.0												         
* 作	者：	   xanthodont											         
* 完成日期：2012-10-1                      									     
************************************************************************/
package com.xanthodont.ccompiler.structuresystem.tokens;

import com.xanthodont.ccompiler.structuresystem.Tag;
import com.xanthodont.ccompiler.structuresystem.Token;
/**
 * 继承自Token类，表示整型数的记号类
 * @author xanthondont
 *
 */
public class TokenInteger extends Token{

	private int _value;
	
	public TokenInteger(int value)
	{
		super(Tag.INTEGER);
		this._value = value;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
