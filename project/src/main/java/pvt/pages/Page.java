package pvt.pages;

public interface Page {

	public void readMessage();

	public void writeMessage();

	public void deleteMessange();

	public boolean worksWith(String webSiteName);
	

}

