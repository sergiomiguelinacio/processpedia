package pt.ist.processpedia.client;

import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.Widget;
import com.google.web.bindery.event.shared.EventBus;
import pt.ist.processpedia.client.activity.mapper.ContentActivityMapper;
import pt.ist.processpedia.client.activity.mapper.HeaderActivityMapper;
import pt.ist.processpedia.client.activity.mapper.ProcesspediaActivityMapper;
import pt.ist.processpedia.client.activity.mapper.SidebarActivityMapper;
import pt.ist.processpedia.client.service.DataSwitch;
import pt.ist.processpedia.client.view.account.AccountActivationView;
import pt.ist.processpedia.client.view.home.HomeView;
import pt.ist.processpedia.client.view.home.content.process.CreateProcessView;
import pt.ist.processpedia.client.view.home.content.request.CreateRequestView;
import pt.ist.processpedia.client.view.home.content.request.RequestDetailedView;
import pt.ist.processpedia.client.view.home.content.request.RequestListView;
import pt.ist.processpedia.client.view.home.content.splash.NoFolderSelectedView;
import pt.ist.processpedia.client.view.home.content.splash.NoRequestsFoundView;
import pt.ist.processpedia.client.view.home.header.HeaderView;
import pt.ist.processpedia.client.view.home.content.settings.SettingsView;
import pt.ist.processpedia.client.view.home.sidebar.FolderListView;
import pt.ist.processpedia.client.view.home.sidebar.LoadingFoldersView;
import pt.ist.processpedia.client.view.login.LoginView;
import pt.ist.processpedia.client.view.signup.SignupView;
import pt.ist.processpedia.client.view.home.content.splash.LoadingMessageView;

public interface BrowserFactory {

  PlaceHistoryHandler getPlaceHistoryHandler();

  Widget getAppContainer();

  PlaceController getPlaceController();

  Messages getMessages();

  LoginView getLoginView();
  SignupView getSignupView();
  HomeView getHomeView();
  SettingsView getSettingsView();
  FolderListView getFolderListView();
  RequestListView getProcessListView();
  RequestDetailedView getRequestDetailedView();


  CreateProcessView getCreateProcessView();
  CreateRequestView getCreateRequestView();

  LoadingFoldersView getLoadingFoldersView();


  LoadingMessageView getLoadingMessageView();

  HeaderView getHeaderView();

  DataSwitch getDataSwitch();

  ProcesspediaActivityMapper getProcesspediaActivityMapper();
  HeaderActivityMapper getHeaderActivityMapper();
  ContentActivityMapper getContentActivityMapper();
  SidebarActivityMapper getSidebarActivityMapper();

  AccountActivationView getAccountActivationView();

  NoFolderSelectedView getNoFolderSelectedView();
  NoRequestsFoundView getNoRequestsFoundView();

  EventBus getEventBus();

  AcceptsOneWidget getProcesspediaContainer();



}
