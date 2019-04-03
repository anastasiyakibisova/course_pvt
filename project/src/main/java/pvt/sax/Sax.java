package pvt.sax;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import pvt.model.Authentication;
import pvt.sax.AuthenticationHandler;

public class Sax {
	private static final String REFS_XML = "Authentication.xml";

	public List<Authentication> SaxParser() throws ParserConfigurationException, SAXException, IOException {
		SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
		SAXParser saxParser = saxParserFactory.newSAXParser();
		AuthenticationHandler authenticationHandler = new AuthenticationHandler();
		saxParser.parse(new File(REFS_XML), authenticationHandler);
		List<Authentication> sites = authenticationHandler.getAuthentication();
		return sites;
	}
}
