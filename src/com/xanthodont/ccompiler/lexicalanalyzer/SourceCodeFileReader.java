/************************************************************************
* 版权所有 (C)2012,xanthodont 
* http://www.cnblogs.com/hbq-fczzw/		
* http://weibo.com/u/2106149344				 
*																		 
* 文件名称：SourceCodeFileReader.java							                     
* 内容摘要：源代码文件读取类                                                             
* 其它说明：                                                             
* 当前版本：v1.0												         
* 作	者：	   xanthodont											         
* 完成日期：2012-10-1                      									     
************************************************************************/
package com.xanthodont.ccompiler.lexicalanalyzer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * 源代码文件读取类，在这个类中，主要有两种读取的方式：
 * 	1.以字符为单位读取
 *  2.使用缓冲区加载，再以字符为单位读取
 * @author xanthondont
 *
 */
public class SourceCodeFileReader {
	/** 读取Reader类实例 */
	private Reader _reader = null;
	/** 在使用缓冲方式读取时用以记录缓冲读取的位置 */
	private int _currentPosition = -1; 
	/** 缓冲字符 */
	private char[] _tempchars = null;
	
	/**
	 * 构造方法
	 * @param fileName 源代码文件路径
	 */
	public SourceCodeFileReader(String fileName)
	{
		this._reader = getReaderByChars(fileName);
	}
	
	/**
	 * 获取Reader对象
	 * @param fileName 源代码文件路径
	 * @return Reader对象，代表源代码的信息，使用reader。read()方法读取单个字符
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
	 * 以字符为单位读取
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
	 * 使用缓冲加载，优化读取的效率
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
