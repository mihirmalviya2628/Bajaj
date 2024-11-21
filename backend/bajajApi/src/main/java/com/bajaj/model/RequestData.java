package com.bajaj.model;

import lombok.Data;
import java.util.List;

@Data
public class RequestData {
    private List<String> data;
    private String file_b64; // Optional, base64 encoded file string
	/**
	 * @return the data
	 */
	public List<String> getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(List<String> data) {
		this.data = data;
	}
	/**
	 * @return the file_b64
	 */
	public String getFile_b64() {
		return file_b64;
	}
	/**
	 * @param file_b64 the file_b64 to set
	 */
	public void setFile_b64(String file_b64) {
		this.file_b64 = file_b64;
	}
    
    
}
