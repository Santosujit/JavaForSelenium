package OOP_Abstract_WebDriverArch;
	
	
public class SafariDriver implements WebDriver {

		public SafariDriver() {
			System.out.println("launch Safari browser");
		}

		@Override
		public void get(String url) {
			System.out.println("launching url " + url);
		}

		@Override
		public void getTitle() {
			System.out.println("title is : " + "google");

		}

		@Override
		public void getPageUrl() {
			System.out.println("url is : " + "http://www.google.com");

		}

		@Override
		public void findElement(String locator) {
			System.out.println("finding the element with : " + locator);
		}

		@Override
		public void quit() {
			System.out.println("quit browser");
		}
		

}
