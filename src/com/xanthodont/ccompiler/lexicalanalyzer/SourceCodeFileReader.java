/************************************************************************
* ��Ȩ���� (C)2012,xanthodont 
* http://www.cnblogs.com/hbq-fczzw/		
* http://weibo.com/u/2106149344				 
*																		 
* �ļ����ƣ�SourceCodeFileReader.java							                     
* ����ժҪ��Դ�����ļ���ȡ��                                                             
* ����˵����                                                             
* ��ǰ�汾��v1.0												         
* ��	�ߣ�	   xanthodont											         
* ������ڣ�2012-10-1                      									     
************************************************************************/
package com.xanthodont.ccompiler.lexicalanalyzer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Դ�����ļ���ȡ�࣬��������У���Ҫ�����ֶ�ȡ�ķ�ʽ��
 * 	1.���ַ�Ϊ��λ��ȡ
 *  2.ʹ�û��������أ������ַ�Ϊ��λ��ȡ
 * @author xanthondont
 *
 */
public class SourceCodeFileReader {
	/** ��ȡReader��ʵ�� */
	private Reader _reader = null;
	/** ��ʹ�û��巽ʽ��ȡʱ���Լ�¼�����ȡ��λ�� */
	private int _currentPosition = -1; 
	/** �����ַ� */
	private char[] _tempchars = null;
	
	/**
	 * ���췽��
	 * @param fileName Դ�����ļ�·��
	 */
	public SourceCodeFileReader(String fileName)
	{
		this._reader = getReaderByChars(fileName);
	}
	
	/**
	 * ��ȡReader����
	 * @param fileName Դ�����ļ�·��
	 * @return Reader���󣬴���Դ�������Ϣ��ʹ��reader��read()������ȡ�����ַ�
	 */
	public static Reader getReaderByChars(String fileName)
	{
		File file = new File(fileName);
		if(file != null)
		{
			try
			{
				return new InputStreamReader(new FileInputStream(file));
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		return null;
	}
	
	/**
	 * ���ַ�Ϊ��λ��ȡ
	 */
	public char readByChar()
	{
		try 
		{
			int tempChar = this._reader.read();
			if(tempChar != -1)
			{
				return (char)tempChar;
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return ' ';
	}
	
	/**
	 * ʹ�û�����أ��Ż���ȡ��Ч��
	 */
	public char readByBuffers()
	{
		if(this._currentPosition < 0)
		{
			try 
			{
				this._tempchars = new char[1024];
				int charread = _reader.read(_tempchars);
				if(charread <= _tempchars.length && charread != -1)
				{
					return _tempchars[++_currentPosition];
				}
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		else
		{
			if(++_currentPosition >= _tempchars.length-1)
			{
				_currentPosition = -1;
				return _tempchars[_tempchars.length-1];
			}
			return _tempchars[_currentPosition];
		}
		return ' ';
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
