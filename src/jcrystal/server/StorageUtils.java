/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.server;

public class StorageUtils {
	static String DEFAULT_BUCKET;
	public static String getDEFAULT_BUCKET() {
		if(DEFAULT_BUCKET == null) {
			try {
				Class.forName("jcrystal.server.StorageUtilsInitializer");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return DEFAULT_BUCKET;
	}
}
