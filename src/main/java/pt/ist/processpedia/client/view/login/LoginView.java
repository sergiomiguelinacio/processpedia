package pt.ist.processpedia.client.view.login;

import pt.ist.processpedia.client.view.ProcesspediaView;

public interface LoginView extends ProcesspediaView {

  public interface Presenter extends ProcesspediaPresenter {
    void onLoginAction();
    void onSignupAction();
  }

  void setPresenter(Presenter presenter);

  void clearEmailContainer();
  void clearPasswordContainer();

  void setLoginBoxTitle(String loginBoxTitle);

  void setEmailPlaceholderText(String placeholderText);
  void setPasswordPlaceholderText(String placeholderText);

  void setDontHaveAccountText(String dontHaveAccountText);
  void setSignupLinkText(String signupLinkText);

  void setLoginButtonText(String loginButtonText);

  void setProcesspediaInfoText(String processpediaInfoText);

  String getEmail();
  String getPassword();

}
