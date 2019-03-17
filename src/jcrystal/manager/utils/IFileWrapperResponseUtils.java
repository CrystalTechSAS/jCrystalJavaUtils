/* Copyright (C) Germán Augusto Sotelo Arévalo - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Germán Augusto Sotelo Arévalo <gasotelo@crystaltech.co.com>, December 2018
 */
package jcrystal.manager.utils;

import java.io.IOException;
import java.io.Writer;

public interface IFileWrapperResponseUtils {
	public <T> String asString(FileWrapperResponse<T> wrapper) throws IOException;
	public <T> void append(FileWrapperResponse<T> wrapper, Writer output, boolean putFirst) throws IOException;
}
