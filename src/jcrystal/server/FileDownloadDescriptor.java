/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.server;

public class FileDownloadDescriptor {

	public final String bucketName;
	public final String path;
	public FileDownloadDescriptor(String bucketName, String path) {
		this.bucketName = bucketName;
		this.path = path;
	}
	public FileDownloadDescriptor(String path) {
		this.bucketName = StorageUtils.getDEFAULT_BUCKET();
		this.path = path;
	}
	
}
