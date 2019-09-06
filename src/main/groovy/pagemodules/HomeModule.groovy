package pagemodules

import geb.Module
import geb.Page

class HomeModule extends Module{

   static content = {
       practice {$("a[href='/pages/practice']")}
       loginlnk {$("a[href='/sign_in']")}
       signupbtn {$("a[href='/sign_up']")}

   }


    void linkclick(){
        loginlnk.click()

    }

}
