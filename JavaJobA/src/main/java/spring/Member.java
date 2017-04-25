package spring;

import java.util.Date;

public class Member {
	private long id;
	private String email;
	private String password;
	private String name;
	private Date regdate;
	
	public Member(){
		
	}
	
	public Member(String email, String password, String name, Date regdate) {
		this.email = email;
		this.password = password;
		this.name = name;
		this.regdate = regdate;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public void changePassword(String oldPassword, String newPassword){
		if(!password.equals(oldPassword))
			throw new IdPasswordMatchingException();
		this.password = newPassword;
	}
	public boolean matchPassword(String password){
		return this.password.equals(password);
	}
	
}
