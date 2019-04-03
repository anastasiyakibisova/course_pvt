package pvt.sax;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import pvt.model.Authentication;

public class AuthenticationHandler extends DefaultHandler {

	private List<Authentication> sites;
	private Authentication site;
	boolean bName = false;
	boolean bLogin = false;
	boolean bPassword = false;

	public List<Authentication> getAuthentication() {
		return sites;
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

		if (qName.equalsIgnoreCase("Site")) {
			String id = attributes.getValue("id");
			site = new Authentication();
			site.setId(Integer.parseInt(id));
			if (sites == null) {
				sites = new ArrayList<>();
			}
		} else if (qName.equalsIgnoreCase("Name")) {
			bName = true;
		} else if (qName.equalsIgnoreCase("Login")) {
			bLogin = true;
		} else if (qName.equalsIgnoreCase("Password")) {
			bPassword = true;
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (qName.equalsIgnoreCase("Site")) {
			sites.add(site);
		}
	}

	@Override
	public void characters(char ch[], int start, int length) throws SAXException {

		if (bName) {
			site.setName(new String(ch, start, length));
			bName = false;
		} else if (bLogin) {
			site.setLogin(new String(ch, start, length));
			bLogin = false;
		} else if (bPassword) {
			site.setPassword(new String(ch, start, length));
			bPassword = false;
		}
	}
}
