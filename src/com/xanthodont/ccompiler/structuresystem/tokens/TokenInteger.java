/************************************************************************
* ��Ȩ���� (C)2012,xanthodont 
* http://www.cnblogs.com/hbq-fczzw/						 
*																		 
* �ļ����ƣ�TokenNumber.java							                     
* ����ժҪ�� ��ʾ�������Ǻŵ���                                                            
* ����˵����                                                             
* ��ǰ�汾��v1.0												         
* ��	�ߣ�	   xanthodont											         
* ������ڣ�2012-10-1                      									     
************************************************************************/
package com.xanthodont.ccompiler.structuresystem.tokens;

import com.xanthodont.ccompiler.structuresystem.Tag;
import com.xanthodont.ccompiler.structuresystem.Token;
/**
 * �̳���Token�࣬��ʾ�������ļǺ���
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
