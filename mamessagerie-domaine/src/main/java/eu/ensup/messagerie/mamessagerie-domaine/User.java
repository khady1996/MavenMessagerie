	package eu.ensup.messagerie.mamessageriedomaine;

public class User {
	
	private String name;
	private String mail;
	private String message;
	
	public User() {
		super();
	}

	public User(String name, String mail, String message) {
		super();
		this.name = name;
		this.mail = mail;
		this.message = message;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
