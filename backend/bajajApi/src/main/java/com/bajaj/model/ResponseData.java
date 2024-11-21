package com.bajaj.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ResponseData {
    private boolean is_success;
    private String user_id;
    private String email;
    private String roll_number;
    private List<String> numbers;
    private List<String> alphabets;
    private List<String> highest_lowercase_alphabet;
    private boolean is_prime_found;
    private boolean file_valid;
    private String file_mime_type; // Can accept null
    private Double file_size_kb;   // Can accept null
	public ResponseData(boolean b, String string, String string2, String string3, List<String> numbers2,
			List<String> alphabets2, List<String> highestLowercaseList, boolean isPrimeFound, boolean c, Object object,
			Object object2) {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the is_success
	 */
	public boolean isIs_success() {
		return is_success;
	}
	/**
	 * @param is_success the is_success to set
	 */
	public void setIs_success(boolean is_success) {
		this.is_success = is_success;
	}
	/**
	 * @return the user_id
	 */
	public String getUser_id() {
		return user_id;
	}
	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the roll_number
	 */
	public String getRoll_number() {
		return roll_number;
	}
	/**
	 * @param roll_number the roll_number to set
	 */
	public void setRoll_number(String roll_number) {
		this.roll_number = roll_number;
	}
	/**
	 * @return the numbers
	 */
	public List<String> getNumbers() {
		return numbers;
	}
	/**
	 * @param numbers the numbers to set
	 */
	public void setNumbers(List<String> numbers) {
		this.numbers = numbers;
	}
	/**
	 * @return the alphabets
	 */
	public List<String> getAlphabets() {
		return alphabets;
	}
	/**
	 * @param alphabets the alphabets to set
	 */
	public void setAlphabets(List<String> alphabets) {
		this.alphabets = alphabets;
	}
	/**
	 * @return the highest_lowercase_alphabet
	 */
	public List<String> getHighest_lowercase_alphabet() {
		return highest_lowercase_alphabet;
	}
	/**
	 * @param highest_lowercase_alphabet the highest_lowercase_alphabet to set
	 */
	public void setHighest_lowercase_alphabet(List<String> highest_lowercase_alphabet) {
		this.highest_lowercase_alphabet = highest_lowercase_alphabet;
	}
	/**
	 * @return the is_prime_found
	 */
	public boolean isIs_prime_found() {
		return is_prime_found;
	}
	/**
	 * @param is_prime_found the is_prime_found to set
	 */
	public void setIs_prime_found(boolean is_prime_found) {
		this.is_prime_found = is_prime_found;
	}
	/**
	 * @return the file_valid
	 */
	public boolean isFile_valid() {
		return file_valid;
	}
	/**
	 * @param file_valid the file_valid to set
	 */
	public void setFile_valid(boolean file_valid) {
		this.file_valid = file_valid;
	}
	/**
	 * @return the file_mime_type
	 */
	public String getFile_mime_type() {
		return file_mime_type;
	}
	/**
	 * @param file_mime_type the file_mime_type to set
	 */
	public void setFile_mime_type(String file_mime_type) {
		this.file_mime_type = file_mime_type;
	}
	/**
	 * @return the file_size_kb
	 */
	public Double getFile_size_kb() {
		return file_size_kb;
	}
	/**
	 * @param file_size_kb the file_size_kb to set
	 */
	public void setFile_size_kb(Double file_size_kb) {
		this.file_size_kb = file_size_kb;
	}
    
    
}
