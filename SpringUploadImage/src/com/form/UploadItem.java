package com.form;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class UploadItem 
{
private String fileName;


	public String getFileName() {
	return fileName;
}


public void setFileName(String fileName) {
	this.fileName = fileName;
}
private CommonsMultipartFile fileData;


public CommonsMultipartFile getFileData() {
	return fileData;
}


public void setFileData(CommonsMultipartFile fileData) {
	this.fileData = fileData;
}
}
