/************************************************************************
* 版权所有 (C)2012,xanthodont 
* http://www.cnblogs.com/hbq-fczzw/						 
*																		 
* 文件名称：Tag.java							                     
* 内容摘要： 记号类型类，用于标明记号的类型。                                                            
* 其它说明：                                                             
* 当前版本：v1.0												         
* 作	者：	xanthodont											         
* 完成日期：2012-9-30                      									     
************************************************************************/
package com.xanthodont.ccompiler.structuresystem;
/**
 * 记号类型类
 * 具体类型值有：整数类型<code>INTEGER</code>、浮点数类型<code>FLOAT</code>、标记符类型<code>IDENTITY</code>等
 * @author xanthondont
 * @version 1.0
 */
public class Tag {

	/** 整型类型 */
	public final int INTEGER = 256;
	/** 浮点数类型 */
	public final int FLOAT = 257;
	/** 双精度浮点数类型 */
	public final int DOUBLE = 258;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
