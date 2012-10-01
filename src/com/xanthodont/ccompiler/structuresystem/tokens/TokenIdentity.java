/************************************************************************
* ��Ȩ���� (C)2012,xanthodont 
* http://www.cnblogs.com/hbq-fczzw/						 
*																		 
* �ļ����ƣ�TokenIdentity.java							                     
* ����ժҪ�� �����ʶ���ļǺ���                                                            
* ����˵����                                                             
* ��ǰ�汾��v1.0												         
* ��	�ߣ�	   xanthodont											         
* ������ڣ�2012-10-1                      									     
************************************************************************/
package com.xanthodont.ccompiler.structuresystem.tokens;

import com.xanthodont.ccompiler.structuresystem.Tag;
import com.xanthodont.ccompiler.structuresystem.Token;
/**
 * ��ʾ��ʶ���ļǺ���
 * @author xanthondont
 *
 */
public class TokenIdentity extends Token{

	/** ��ʶ���� */
	private String _lexeme;
	
	/**
	 * ���췽��
	 * @param lexeme ��ʶ����
	 */
	public TokenIdentity(String lexeme)
	{
		super(Tag.IDENTITY);
		this._lexeme = lexeme;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
