package programfiles

import geb.Page
import pagemodules.HomeModule
import webpages.LoginPage
import webpages.SignUpPage

class RootPage extends Page{
    static  url =  "https://learn.letskodeit.com/"
    static at = {title == "Home | Let's Kode It"}


    static content = {
        Home{module(HomeModule)}
        Login{module(LoginPage)}
        SignUp{module(SignUpPage)}
    }
}
