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
	public StateHandleResult handle(Lexer lexer, char peek) {
		// TODO Auto-generated method stub
		switch(peek)
		{
			case '*':
				return StateHandleResult.Normal;
			case '/':
				lexer.setState(new State0());
				return StateHandleResult.Receive;
			default:
				lexer.setState(new State4());
				return StateHandleResult.Normal;
		}
	}

}
