package commons;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

public class Browser {
	
	BrowserProperties properties = new BrowserProperties();
	
	public void openPage() {
		Configuration.timeout = properties.getTimeout();
		Configuration.browser = properties.getBrowserSize();
		Configuration.browserSize = properties.getBrowserSize();
		Configuration.headless = properties.isHeadless();
		Configuration.browserCapabilities.setCapability("applicationCacheEnable", false);
		Selenide.open(properties.getUrl());
	}
}
