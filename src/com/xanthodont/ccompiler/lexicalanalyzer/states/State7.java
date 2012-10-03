/************************************************************************
* 版权所有 (C)2012,xanthodont 
* http://www.cnblogs.com/hbq-fczzw/		
* http://weibo.com/u/2106149344				 
*																		 
* 文件名称：State7.java							                     
* 内容摘要：                                                             
* 其它说明：                                                             
* 当前版本：v1.0												         
* 作	者：	   xanthodont											         
* 完成日期：2012-10-3                      									     
************************************************************************/
package com.xanthodont.ccompiler.lexicalanalyzer.states;

import com.xanthodont.ccompiler.lexicalanalyzer.IState;
import com.xanthodont.ccompiler.lexicalanalyzer.Lexer;
import com.xanthodont.ccompiler.lexicalanalyzer.StateHandleResult;

public class State7 implements IState {

	@Override
	public int handle(Lexer lexer, char peek) {
		// TODO Auto-generated method stub
		switch(peek)
		{
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				return StateHandleResult.Normal;
			case ' ':
			case '\r':
			case ';':
			case '-':
			case '+':
			case '*':
			case '/':
			case '%':
			case '>':
			case '<':
			case '=':
			case ')':
			case '&':
			case '|':
			case '^':
				lexer.setState(new State0());
				return StateHandleResult.Receive_back | StateHandleResult.Integer;
			case '\n':
				lexer._line++;
				lexer.setState(new State0());
				return StateHandleResult.Receive_back | StateHandleResult.Integer;
			default:
				return StateHandleResult.Error;
		}
	}

}
