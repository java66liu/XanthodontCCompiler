/************************************************************************
* ��Ȩ���� (C)2012,xanthodont 
* http://www.cnblogs.com/hbq-fczzw/		
* http://weibo.com/u/2106149344				 
*																		 
* �ļ����ƣ�IState.java							                     
* ����ժҪ�� ״̬�ӿڣ�ʹ��״̬ģʽ���д���                                                            
* ����˵����                                                             
* ��ǰ�汾��v1.0												         
* ��	�ߣ�	   xanthodont											         
* ������ڣ�2012-10-3                      									     
************************************************************************/
package com.xanthodont.ccompiler.lexicalanalyzer;
/**
 * ״̬�ӿڣ�����һ��Handle����
 * @author xanthondont
 *
 */
public interface IState 
{
	StateHandleResult handle(Lexer lexer, char peek);
}
