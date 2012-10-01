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
 * 在C语言中，总共有32个关键字
 * 具体类型值有：整数类型<code>INTEGER</code>、浮点数类型<code>FLOAT</code>、标记符类型<code>IDENTITY</code>等
 * @author xanthondont
 * @version 1.0
 */
public class Tag {

	/** 声明自动变量 */
	public final int AUTO = 256;
	/** 跳出当前循环 */
	public final int BREAK = 257;
	/** 开关分支语句 */
	public final int CASE = 258;
	/** 声明字符型变量或函数 */
	public final int CHAR = 259;
	/** 声明只读常量 */
	public final int CONST = 260;
	/** 结束当前循环，开始下一个循环 */
	public final int CONTINUE = 261;
	/** 开关语句中'其他'的分支 */
	public final int DEFAULT = 262;
	/** 循环语句的循环体 */
	public final int DO = 263;
	/** 声明双精度浮点型数变量或函数*/
	public final int DOUBLE = 264;
	/** 条件语句的否定分支 */
	public final int ELSE = 265;
	/** 声明枚举类型 */
	public final int ENUM = 266;
	/** 声明变量是在其他文件中声明的 */
	public final int EXTERN = 267;
	/** 声明单精度浮点数类型 */
	public final int FLOAT = 268;
	/** 循环语句 */
	public final int FOR = 269;
	/** 无条件跳转语句 */
	public final int GOTO = 270;
	/** 条件语句 */
	public final int IF = 271;
	/** 声明整型类型 */
	public final int INT = 272;
	/** 声明长整型 */
	public final int LONG = 273;
	/** 声明寄存器变量 */
	public final int REGISTER = 274;
	/** 子程序返回语句 */
	public final int RETURN = 275;
	/** 声明短整型变量 */
	public final int SHORT = 276;
	/** 声明有符号类型 */
	public final int SIGNED = 277;
	/** 计算数据类型的长度 */
	public final int SIZEOF = 278;
	/** 声明静态变量 */
	public final int STATIC = 279;
	/** 声明结构体 */
	public final int STRUCT = 280;
	/** 开关分支语句 */
	public final int SWITCH = 281;
	/** 用以给数据类型取别名 */
	public final int TYPEDEF = 282;
	/** 声明联合数据类型 */
	public final int UNION = 283;
	/** 声明无符号类型 */
	public final int UNSIGNED = 284;
	/** 空类型 */
	public final int VOID = 285;
	/** 说明变量在执行过程中被可被隐含的改变 */
	public final int VOLATILE = 286;
	/** 循环语句的循环条件 */
	public final int WHILE = 287;
	
	/** 整数类型 */
	public final int INTEGER = 290;
	/** 浮点数类型 */
	public final int FLOATER = 291;
	/** 标识符 */
	public final int IDENTITY = 292;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
