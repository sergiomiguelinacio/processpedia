package pt.ist.processpedia.client.view.login;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.*;
import pt.ist.processpedia.client.Messages;

public class LoginViewImpl extends Composite implements LoginView {

  interface LoginViewImplUiBinder extends UiBinder<Widget, LoginViewImpl> {}
  private static LoginViewImplUiBinder uiBinder = GWT.create(LoginViewImplUiBinder.class);

  @UiField Label loginBoxTitleContainer;

  @UiField Button loginAction;

  @UiField TextBox emailContainer;
  @UiField PasswordTextBox passwordContainer;
  
  @UiField HTMLPanel dontHaveAccountTextContainer;
  @UiField Anchor signupAction;

  @UiField HasText processpediaInfoContainer;

  private Presenter presenter;

  public LoginViewImpl() {
    initWidget(uiBinder.createAndBindUi(this));
  }

  public void prepareView() {
    clearEmailContainer();
    clearPasswordContainer();
    emailContainer.getElement().setPropertyBoolean("spellcheck", false);
    passwordContainer.getElement().setPropertyBoolean("spellcheck", false);
    Messages messages = presenter.getBrowserFactory().getMessages();
    setLoginBoxTitle(messages.loginTitle());
    setEmailPlaceholderText(messages.enterYourEmail());
    setPasswordPlaceholderText(messages.enterYourPassword());
    setLoginButtonText(messages.login());
    setDontHaveAccountText(messages.dontHaveAccount());
    setSignupLinkText(messages.signup());
    setProcesspediaInfoText(messages.processpediaInfo());
  }

  public void setLoginBoxTitle(String loginBoxTitle) {
    loginBoxTitleContainer.setText(loginBoxTitle);
  }

  public void setEmailPlaceholderText(String placeholderText) {
    emailContainer.getElement().setPropertyString("placeholder", placeholderText);
  }

  public void setPasswordPlaceholderText(String placeholderText) {
    passwordContainer.getElement().setPropertyString("placeholder", placeholderText);
  }

  public void setLoginButtonText(String loginButtonText) {
    loginAction.setText(loginButtonText);
  }

  public void setDontHaveAccountText(String dontHaveAccountText) {
    dontHaveAccountTextContainer.getElement().setInnerText(dontHaveAccountText);
  }

  public void setSignupLinkText(String signupLinkText) {
    signupAction.setText(signupLinkText);
  }

  public void setProcesspediaInfoText(String processpediaInfoText) {
    processpediaInfoContainer.setText(processpediaInfoText);
  }

  @UiHandler("signupAction")
  public void onSignupAction(ClickEvent clickEvent) {
    presenter.onSignupAction();
  }

  @UiHandler("loginAction")
  public void onLoginAction(ClickEvent clickEvent) {
    presenter.onLoginAction();
  }

  @UiHandler("emailContainer")
  public void onEmailContainerEnterKeyPress(KeyPressEvent keyPressEvent) {
    if(keyPressEvent.getCharCode()== KeyCodes.KEY_ENTER) {
      passwordContainer.setFocus(true);
    }
  }

  @UiHandler("passwordContainer")
  public void onPasswordContainerEnterKeyPress(KeyPressEvent keyPressEvent) {
    if(keyPressEvent.getCharCode()== KeyCodes.KEY_ENTER) {
      presenter.onLoginAction();
    }
  }

  public void setPresenter(Presenter presenter) {
    this.presenter = presenter;
  }

  public String getEmail() {
    return emailContainer.getText();
  }

  public String getPassword() {
    return passwordContainer.getText();
  }

  public void clearEmailContainer() {
    emailContainer.setText("");
  }

  public void clearPasswordContainer() {
    passwordContainer.setText("");
  }

}
