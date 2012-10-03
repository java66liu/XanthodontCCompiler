/************************************************************************
* 版权所有 (C)2012,xanthodont 
* http://www.cnblogs.com/hbq-fczzw/		
* http://weibo.com/u/2106149344				 
*																		 
* 文件名称：State0.java							                     
* 内容摘要：开始状态                                                             
* 其它说明：                                                             
* 当前版本：v1.0												         
* 作	者：	   xanthodont											         
* 完成日期：2012-10-3                      									     
************************************************************************/
package com.xanthodont.ccompiler.lexicalanalyzer.states;

import com.xanthodont.ccompiler.lexicalanalyzer.IState;
import com.xanthodont.ccompiler.lexicalanalyzer.Lexer;
import com.xanthodont.ccompiler.lexicalanalyzer.StateHandleResult;
/**
 * 开始状态0
 * @author xanthondont
 *
 */
public class State0 implements IState{

	@Override
	public int handle(Lexer lexer, char peek) {
		// TODO Auto-generated method stub
		switch(peek)
		{
			case ' ':
			case '\r':
				lexer.setState(new State1());
				return StateHandleResult.Normal;
			case '\n':
				lexer._line++;
				return StateHandleResult.Normal;
			case '/':
				lexer.setState(new State2());
				return StateHandleResult.Normal;
			case '0':
				lexer.setState(new State6());
				return StateHandleResult.Normal;
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				lexer.setState(new State7());
				return StateHandleResult.Normal;
			default:
				//System.out.print(peek);
				return StateHandleResult.No_finish;
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
