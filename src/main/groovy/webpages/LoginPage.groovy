package webpages

import geb.Module
import geb.Page

class LoginPage extends Page{
    def emailid = 'menwoye@gmail.com'
    def passd = 'gns10101'


    static  content = {

        //emailaddress { $("input#user_email") }
        emailaddress {$("input[type='email']")}
        password { $("input#user_password") }
        //password {$("input[type='password']")}
        loginbtn {$('input').eq(5)}
        //loginbtn {$("input[value='Log In']")}

    }

//    void login(){
//        emailaddress.value(emailid)
//        password.value(passd)
//        loginbtn.click()
//
//    }

}
