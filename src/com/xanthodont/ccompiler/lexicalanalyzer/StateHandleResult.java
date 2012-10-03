/************************************************************************
* 版权所有 (C)2012,xanthodont 
* http://www.cnblogs.com/hbq-fczzw/		
* http://weibo.com/u/2106149344				 
*																		 
* 文件名称：StateHandleResult.java							                     
* 内容摘要：IState操作的结果                                                             
* 其它说明：                                                             
* 当前版本：v1.0												         
* 作	者：	   xanthodont											         
* 完成日期：2012-10-3                      									     
************************************************************************/
package com.xanthodont.ccompiler.lexicalanalyzer;
/**
 * IState操作的枚举结果
 * @author xanthondont
 *
 */
public final class StateHandleResult {
	public static final int Error = 0x00000001;
	public static final int No_finish = 0x00000010;
	public static final int Normal = 0x00000100;
	public static final int Receive = 0x00001000;
	public static final int Receive_back = 0x00010000;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =  0x00000010;
		System.out.print(i);
	}
}
