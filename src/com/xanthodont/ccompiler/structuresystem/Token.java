/************************************************************************
* 版权所有 (C)2012,xanthodont 
* http://www.cnblogs.com/hbq-fczzw/						 
*																		 
* 文件名称：Token.java							                     
* 内容摘要： 记号类，作为其他具体记号类的基类                                                            
* 其它说明：                                                             
* 当前版本：v1.0												         
* 作	者：	   xanthodont											         
* 完成日期：2012-9-25                      									     
************************************************************************/
package com.xanthodont.ccompiler.structuresystem;

public class Token 
{
	/** 记号类别字段 */
	public final int tag;
	
	/**
	 * 构造方法，初始化tag字段
	 * @param tag 
	 * 		      记号类别，具体值为com.xanthodont.ccompiler.structuresystem。Tag类的静态final字段。
	 * 		  
	 */
	public Token(int tag)
	{
		this.tag = tag;
	}
}
