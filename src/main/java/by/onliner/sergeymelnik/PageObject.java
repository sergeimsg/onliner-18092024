package by.onliner.sergeymelnik;

public class PageObject {
    private static final String INPUTE_EMAIL_XPATH = "//input[@placeholder='Ник или e-mail']";
    private static final String INPUTE_PASSWORD_XPATH = "//input[@placeholder='Пароль']";
    private static final String BUTTON_ENTER_LOGIN = "//button[@class='auth-button auth-button_primary auth-button_middle auth-form__button auth-form__button_width_full']";
    private static final String ERROR_NICK_EMAIL = "//div[contains(text(),'Укажите ник или e-mail')]";
    private static final String ERROR_PASSWORD = "//div[contains(text(),'Укажите пароль')]";

    public void getLogin() {


    }


}
