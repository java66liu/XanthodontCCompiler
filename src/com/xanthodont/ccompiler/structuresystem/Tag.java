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
 * 具体类型值有：整数类型<code>INTEGER</code>、浮点数类型<code>FLOATER</code>、标记符类型<code>IDENTITY</code>等
 * @author xanthondont
 * @version 1.0
 */
public class Tag {

	/** 声明自动变量 */
	public final static int AUTO = 256;
	/** 跳出当前循环 */
	public final static int BREAK = 257;
	/** 开关分支语句 */
	public final static int CASE = 258;
	/** 声明字符型变量或函数 */
	public final static int CHAR = 259;
	/** 声明只读常量 */
	public final static int CONST = 260;
	/** 结束当前循环，开始下一个循环 */
	public final static int CONTINUE = 261;
	/** 开关语句中'其他'的分支 */
	public final static int DEFAULT = 262;
	/** 循环语句的循环体 */
	public final static int DO = 263;
	/** 声明双精度浮点型数变量或函数*/
	public final static int DOUBLE = 264;
	/** 条件语句的否定分支 */
	public final static int ELSE = 265;
	/** 声明枚举类型 */
	public final static int ENUM = 266;
	/** 声明变量是在其他文件中声明的 */
	public final static int EXTERN = 267;
	/** 声明单精度浮点数类型 */
	public final static int FLOAT = 268;
	/** 循环语句 */
	public final static int FOR = 269;
	/** 无条件跳转语句 */
	public final static int GOTO = 270;
	/** 条件语句 */
	public final static int IF = 271;
	/** 声明整型类型 */
	public final static int INT = 272;
	/** 声明长整型 */
	public final static int LONG = 273;
	/** 声明寄存器变量 */
	public final static int REGISTER = 274;
	/** 子程序返回语句 */
	public final static int RETURN = 275;
	/** 声明短整型变量 */
	public final static int SHORT = 276;
	/** 声明有符号类型 */
	public final static int SIGNED = 277;
	/** 计算数据类型的长度 */
	public final static int SIZEOF = 278;
	/** 声明静态变量 */
	public final static int STATIC = 279;
	/** 声明结构体 */
	public final static int STRUCT = 280;
	/** 开关分支语句 */
	public final static int SWITCH = 281;
	/** 用以给数据类型取别名 */
	public final static int TYPEDEF = 282;
	/** 声明联合数据类型 */
	public final static int UNION = 283;
	/** 声明无符号类型 */
	public final static int UNSIGNED = 284;
	/** 空类型 */
	public final static int VOID = 285;
	/** 说明变量在执行过程中被可被隐含的改变 */
	public final static int VOLATILE = 286;
	/** 循环语句的循环条件 */
	public final static int WHILE = 287;
	
	/** 整数类型 */
	public final static int INTEGER = 290;
	/** 浮点数类型 */
	public final static int FLOATER = 291;
	/** 标识符 */
	public final static int IDENTITY = 292;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
