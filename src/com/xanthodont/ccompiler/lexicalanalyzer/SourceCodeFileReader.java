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
	/** һ�ζ�ȡ�����������е��ַ��� */
	private int _charread = 0;
	/** ��������С */
	private final int BUFFER_LENGTH = 1024;
	
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
	 * @return ����-1��ʾ��ȡ����
	 * 		          ��������·����ַ���ASCIIֵ
	 */
	public int readByChar()
	{
		try 
		{
			return this._reader.read();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return -1;
	}
	
	/**
	 * ʹ�û�����أ��Ż���ȡ��Ч��
	 * @return ����-1��ʾ��ȡ����
	 * 		           ��������·����ַ���ASCIIֵ
	 */
	public int readByBuffers()
	{
		if(this._currentPosition < 0)
		{
			try 
			{
				this._tempchars = new char[BUFFER_LENGTH];
				_charread = _reader.read(_tempchars);
				if(_charread <= _tempchars.length && _charread != -1)
				{
					return _tempchars[++_currentPosition];
				}
				else
				{
					return -1;
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
			else if(_currentPosition >= _charread)
				return -1;
			return _tempchars[_currentPosition];
		}
		return -1;
	}
	
	
	/**
	 * ����SourceCodeFileReader���ֶ�ȡ��ʽ��Ч��
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "D:\\Projects\\Git\\Pattern.java";	// Դ�����ļ�·��
		long times = 0;
		/** 
		 * ���ַ�Ϊ��λ��ȡ��Ч��
		 */
		SourceCodeFileReader readByChar = new SourceCodeFileReader(fileName);
		long start = System.currentTimeMillis();
		while(readByChar.readByChar() != -1){ times++; }
		long end = System.currentTimeMillis();
		System.out.println(String.format("�ܶ�ȡ�ַ�����%d readByChar��ʱ��%dms", times, (end - start)));
		
		/** 
		 * ʹ�û�����ض�ȡ��Ч��
		 */
		times = 0;
		SourceCodeFileReader readByBuffers = new SourceCodeFileReader(fileName);
		start = System.currentTimeMillis();
		while(readByBuffers.readByBuffers() != -1){ times++; }
		end = System.currentTimeMillis();
		System.out.println(String.format("�ܶ�ȡ�ַ�����%d readByBuffers��ʱ��%dms", times, (end - start)));
	}

}
