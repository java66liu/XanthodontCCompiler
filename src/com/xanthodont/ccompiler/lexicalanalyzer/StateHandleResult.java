/************************************************************************
* ��Ȩ���� (C)2012,xanthodont 
* http://www.cnblogs.com/hbq-fczzw/		
* http://weibo.com/u/2106149344				 
*																		 
* �ļ����ƣ�StateHandleResult.java							                     
* ����ժҪ��IState�����Ľ��                                                             
* ����˵����                                                             
* ��ǰ�汾��v1.0												         
* ��	�ߣ�	   xanthodont											         
* ������ڣ�2012-10-3                      									     
************************************************************************/
package com.xanthodont.ccompiler.lexicalanalyzer;
/**
 * IState������ö�ٽ��
 * @author xanthondont
 *
 */
public final class StateHandleResult {
	public static final int Error = 0x1;
	public static final int No_finish = 0x2;
	public static final int Normal = 0x4;
	public static final int Receive = 0x8;
	public static final int Receive_back = 0x10;
	public static final int Integer = 0x20;
	public static final int Do_nothing = 0x40;
	public static final int Operation = 0x80;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =  0x00000010;
		System.out.print(48 & Integer);
	}
}