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
public enum StateHandleResult {
	Normal,
	Receive,
	Receive_back,
}
