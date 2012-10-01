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
	/** 一次读取缓冲填入区中的字符数 */
	private int _charread = 0;
	/** 缓冲区大小 */
	private final int BUFFER_LENGTH = 1024;
	
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
	 * @return 返回-1表示读取结束
	 * 		          正常情况下返回字符的ASCII值
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
	 * 使用缓冲加载，优化读取的效率
	 * @return 返回-1表示读取结束
	 * 		           正常情况下返回字符的ASCII值
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
	 * 测试SourceCodeFileReader两种读取方式的效率
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "D:\\Projects\\Git\\Pattern.java";	// 源代码文件路径
		long times = 0;
		/** 
		 * 以字符为单位读取的效率
		 */
		SourceCodeFileReader readByChar = new SourceCodeFileReader(fileName);
		long start = System.currentTimeMillis();
		while(readByChar.readByChar() != -1){ times++; }
		long end = System.currentTimeMillis();
		System.out.println(String.format("总读取字符数：%d readByChar耗时：%dms", times, (end - start)));
		
		/** 
		 * 使用缓冲加载读取的效率
		 */
		times = 0;
		SourceCodeFileReader readByBuffers = new SourceCodeFileReader(fileName);
		start = System.currentTimeMillis();
		while(readByBuffers.readByBuffers() != -1){ times++; }
		end = System.currentTimeMillis();
		System.out.println(String.format("总读取字符数：%d readByBuffers耗时：%dms", times, (end - start)));
	}

}
