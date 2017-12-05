package Pages;

import Util.ManageDriver;
import org.openqa.selenium.By;

public class Loginpage extends ManageDriver {

    By Login_CheckBox = By.id("");
    By EmailTextField = By.id("email");
    By PasswordTextField = By.id("pwd");



    String BaseUrl = "http://calendar.google.com/";

    public void Launch_Url(){
        driver.get (BaseUrl);

    }
    public void click_checkbox(){
        driver.findElement(Login_CheckBox).click();
    }

    //public void EnterEmail ()

    //public void setEmailTextField(By emailTextField) {
      //  EmailTextField = emailTextField;
    }

