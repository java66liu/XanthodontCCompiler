/************************************************************************
* ��Ȩ���� (C)2012,xanthodont 
* http://www.cnblogs.com/hbq-fczzw/						 
*																		 
* �ļ����ƣ�Token.java							                     
* ����ժҪ�� �Ǻ��࣬��Ϊ��������Ǻ���Ļ���                                                            
* ����˵����                                                             
* ��ǰ�汾��v1.0												         
* ��	�ߣ�	   xanthodont											         
* ������ڣ�2012-9-25                      									     
************************************************************************/
package com.xanthodont.ccompiler.structuresystem;

public class Token 
{
	/** �Ǻ�����ֶ� */
	public final int tag;
	
	/**
	 * ���췽������ʼ��tag�ֶ�
	 * @param tag 
	 * 		      �Ǻ���𣬾���ֵΪcom.xanthodont.ccompiler.structuresystem��Tag��ľ�̬final�ֶΡ�
	 * 		  
	 */
	public Token(int tag)
	{
		this.tag = tag;
	}
}
