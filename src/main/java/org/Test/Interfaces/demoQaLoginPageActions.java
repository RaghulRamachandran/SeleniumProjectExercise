package org.Test.Interfaces;

public interface demoQaLoginPageActions {

    void userName(String userName);
    void password(String password);
    void clickLoginButton();

    void loginAs(String useName, String password);


    interface TextBoxActions {
         void getTextBoxWebpage(String WebPage) throws InterruptedException;
         void Fullname(String Fullname) throws InterruptedException;
         void Email(String Email) throws InterruptedException;
         void CurrentAddress(String CurrentAddress) throws InterruptedException;
         void PermanentAddress(String PermanentAddress) throws InterruptedException;
         void clickSubmitButton() throws InterruptedException;

    }
}
