/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.manager.utils;

import java.io.IOException;
import java.io.Writer;

public class FileWrapperResponse<T> {
	
	static IFileWrapperResponseUtils  UTILS;
	static {
		try {
			UTILS = (IFileWrapperResponseUtils)Class.forName("jcrystal.manager.utils.FileWrapperResponseUtils.java").newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private final String bucketName;
	private final String fileName;
	private T item;
	
	public FileWrapperResponse(T item) {
		this(null,null);
		this.item = item;
	}
	public FileWrapperResponse(String fileName) {
		this(null, fileName);
	}
	public FileWrapperResponse(String bucketName, String fileName) {
		this.bucketName = bucketName;
		this.fileName = fileName;
	}
	public T getItem() {
		if(bucketName == null && fileName == null)
			return item;
		return null;
	}
	public String asString() throws IOException{
		return UTILS.asString(this);
	}
	public void append(Writer output, boolean putFirst) throws IOException{
		UTILS.append(this, output, putFirst);
	}
	public String getBucketName() {
		return bucketName;
	}
	public String getFileName() {
		return fileName;
	}
}
