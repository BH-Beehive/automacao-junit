package commons;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

public class Browser {
	
	BrowserProperties properties = new BrowserProperties();
	
	public void openPage(String finalUrl) {
		Configuration.timeout = properties.getTimeout();
		Configuration.browser = properties.getBrowser();
		Configuration.browserSize = properties.getBrowserSize();
		Configuration.headless = properties.isHeadless();
		Configuration.browserCapabilities.setCapability("applicationCacheEnable", false);
		Selenide.open(properties.getUrl() + finalUrl);
	}
}
