package tests

import geb.spock.GebReportingSpec
import webpages.LoginPage
import programfiles.RootPage

class LoginTest extends GebReportingSpec{

     def "Login to page"(){
         given:
          def page = to RootPage
          when: "at home page"
            page.Home.linkclick()
          //sleep 3000
          //waitFor(10){$("input#user_email")}
            page = at LoginPage
            page.emailaddress.value(page.emailid)
            page.password.value(page.passd)
            page.loginbtn.click()
          then: "I am routed to login page"
     }



}
