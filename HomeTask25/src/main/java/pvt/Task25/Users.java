package pvt.Task25;

public class Users {

	private String site;
	private String login;
	private String password;
	private String email;
	private String theme;
	private String text;
	private int id;

	public Users(int id, String site, String login, String password, String email, String theme, String text) {
		this.id = id;
		this.site = site;
		this.login = login;
		this.password = password;
		this.email = email;
		this.theme = theme;
		this.text = text;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
