/************************************************************************
* 版权所有 (C)2012,xanthodont 
* http://www.cnblogs.com/hbq-fczzw/		
* http://weibo.com/u/2106149344				 
*																		 
* 文件名称：IState.java							                     
* 内容摘要： 状态接口，使用状态模式进行处理                                                            
* 其它说明：                                                             
* 当前版本：v1.0												         
* 作	者：	   xanthodont											         
* 完成日期：2012-10-3                      									     
************************************************************************/
package com.xanthodont.ccompiler.lexicalanalyzer;
/**
 * 状态接口，包含一个Handle方法
 * @author xanthondont
 *
 */
public interface IState 
{
	StateHandleResult handle(Lexer lexer, char peek);
}
