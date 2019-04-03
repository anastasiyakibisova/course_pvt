package pvt.pages;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class PagesFactory {

	private Set<Page> pages;
	
    public PagesFactory(WebDriver driver){
        pages = new HashSet<Page>();
        pages.add(new VkPage(driver));
        pages.add(new MailPage(driver));
    }

    public Page getInstans(String webSiteName){
        for(Page page: pages){
            if(page.worksWith(webSiteName)){
                return page;
            }
        }
        return null;
    }
}
