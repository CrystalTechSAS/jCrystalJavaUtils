package jcrystal.entity.types;

import java.io.Serializable;

public class PersistentFile implements Serializable{

	private static final long serialVersionUID = 2461936084040946135L;

	private String[] allowedMimeTypes;
	private String[] allowedExtentions;
	
	private PersistentFile() {
		// TODO Auto-generated constructor stub
	}
	public static PersistentFile build() {
		return new PersistentFile();
	}
	public PersistentFile mimeTypes(String...mimeTypes) {
		this.allowedMimeTypes = mimeTypes;
		return this;
	}
	public PersistentFile extentions(String...exts) {
		this.allowedExtentions = exts;
		return this;
	}
	
	public String[] getAllowedExtentions() {
		return allowedExtentions;
	}
	public String[] getAllowedMimeTypes() {
		return allowedMimeTypes;
	}
}
