package pvt.dao;

public class Infromation {

	private String email;
	private String theme;
	private String text;
	private String token;
	private String text1;
	private String text2;
	private String number;

	public String getText1() {
		return text1;
	}

	public String getText2() {
		return text2;
	}

	public String getNumber() {
		return number;
	}

	public Infromation(String email, String theme, String text) {
		this.email = email;
		this.theme = theme;
		this.text = text;
	}

	public Infromation(String token, String number, String text1, String text2) {
		this.token = token;
		this.text1 = text1;
		this.text2 = text2;
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public String getToken() {
		return token;
	}

	public String getTheme() {
		return theme;
	}

	public String getText() {
		return text;
	}

}
