/************************************************************************
* 版权所有 (C)2012,xanthodont 
* http://www.cnblogs.com/hbq-fczzw/		
* http://weibo.com/u/2106149344				 
*																		 
* 文件名称：State4.java							                     
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

public class State4 implements IState {

	@Override
	public int handle(Lexer lexer, char peek) {
		// TODO Auto-generated method stub
		switch(peek)
		{
			case '*':
				lexer.setState(new State5());
				return StateHandleResult.Do_nothing;
			case '\n':
				lexer._line++;
				return StateHandleResult.Do_nothing;
			default:
				return StateHandleResult.Do_nothing;
		}
	}

}
