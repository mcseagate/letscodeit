import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.*

/**
 * Created by sysdevconsultant6 on 9/26/2016.
 */

def chromeDriver = System.getProperty('webdriver.chrome.driver')
def firefoxDriver = System.getProperty('webdriver.gecko.driver')
def browser = System.getenv('geb.env')

def dir  = System.getProperty("user.dir");
if(dir.indexOf('\\src') > 0) dir = dir.substring(0,dir.indexOf('\\src'))
def firefoxDriverPath =  "${dir}\\drivers\\geckodriver.exe"
def chromeDriverPath =  "${dir}\\drivers\\chromedriver.exe"

if(!chromeDriver) System.setProperty('webdriver.chrome.driver', chromeDriverPath)
if(!firefoxDriver) System.setProperty("webdriver.gecko.driver",firefoxDriverPath)

driver = {
    def driver
    switch(browser){
        case 'chrome':
            driver = new ChromeDriver()
            break
        case 'firefox':
            driver = new FirefoxDriver()
            break
        default:
            driver =  new ChromeDriver()
            break
    }
    return driver
}

baseUrl = "https://learn.letskodeit.com/"
reportsDir = "geb-reports"
baseNavigatorWaiting = true
atCheckWaiting = true
autoClearCookies = false