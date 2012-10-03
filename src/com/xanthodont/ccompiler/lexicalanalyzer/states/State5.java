/************************************************************************
* ��Ȩ���� (C)2012,xanthodont 
* http://www.cnblogs.com/hbq-fczzw/		
* http://weibo.com/u/2106149344				 
*																		 
* �ļ����ƣ�State5.java							                     
* ����ժҪ��                                                             
* ����˵����                                                             
* ��ǰ�汾��v1.0												         
* ��	�ߣ�	   xanthodont											         
* ������ڣ�2012-10-3                      									     
************************************************************************/
package com.xanthodont.ccompiler.lexicalanalyzer.states;

import com.xanthodont.ccompiler.lexicalanalyzer.IState;
import com.xanthodont.ccompiler.lexicalanalyzer.Lexer;
import com.xanthodont.ccompiler.lexicalanalyzer.StateHandleResult;

public class State5 implements IState {

	@Override
	public int handle(Lexer lexer, char peek) {
		// TODO Auto-generated method stub
		switch(peek)
		{
			case '*':
				return StateHandleResult.Do_nothing;
			case '/':
				lexer.setState(new State0());
				return StateHandleResult.Receive;
			case '\n':
				lexer._line++;
				lexer.setState(new State4());
				return StateHandleResult.Do_nothing;
			default:
				lexer.setState(new State4());
				return StateHandleResult.Do_nothing;
		}
	}

}
