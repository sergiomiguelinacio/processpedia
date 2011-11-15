/**
 * Copyright 2011 ESW Software Engineering Group
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 **/

package pt.ist.processpedia.client.view.home.content.request;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.*;
import pt.ist.processpedia.client.Messages;
import pt.ist.processpedia.client.view.util.MultiValueSuggestBox;

public class CreateRequestViewImpl extends Composite implements CreateRequestView {

  interface CreateRequestViewImplUiBinder extends UiBinder<Widget,CreateRequestViewImpl> {}
  private static CreateRequestViewImplUiBinder uiBinder = GWT.create(CreateRequestViewImplUiBinder.class);

  @UiField
  HasText createRequestTitleContainer,
          toLabelContainer,
          requestTitleLabelContainer,
          requestDescriptionLabelContainer;

  @UiField
  HasText requestTitleContainer, requestDescriptionContainer;

  @UiField(provided = true)
  MultiValueSuggestBox toContainer;

  @UiField
  CheckBox expectsAnswerContainer;

  @UiField
  Button publishRequestAction, cancelAction;

  private Presenter presenter;

  private MultiWordSuggestOracle oracle;

  public CreateRequestViewImpl() {
    oracle = new MultiWordSuggestOracle();
    toContainer = new MultiValueSuggestBox(oracle);
    initWidget(uiBinder.createAndBindUi(this));
  }

  public void setPresenter(Presenter presenter) {
    this.presenter = presenter;
  }

  public void prepareView() {
    Messages messages = presenter.getBrowserFactory().getMessages();
    setCreateRequestTitle(messages.createRequestTitle());
    setToLabel(messages.to());
    setRequestTitleLabel(messages.requestTitle());
    setRequestDescriptionLabel(messages.requestDescription());
    setExpectsAnswerLabel(messages.expectsAnswer());
    setPublishRequestButtonText(messages.publishRequest());
    setCancelButtonText(messages.cancel());
    requestTitleContainer.setText("");
    requestDescriptionContainer.setText("");
    toContainer.setText("");
    expectsAnswerContainer.setValue(false);
  }

  public void setCreateRequestTitle(String createRequestTitle) {
    createRequestTitleContainer.setText(createRequestTitle);
  }

  public void setExpectsAnswerLabel(String expectsAnswerLabel) {
    expectsAnswerContainer.setText(expectsAnswerLabel);
  }

  public void setCancelButtonText(String cancelButtonText) {
    cancelAction.setText(cancelButtonText);
  }

  public void setToLabel(String toLabel) {
    toLabelContainer.setText(toLabel);
  }

  public void setRequestTitleLabel(String requestTitleLabel) {
    requestTitleLabelContainer.setText(requestTitleLabel);
  }

  public void setRequestDescriptionLabel(String requestDescriptionLabel) {
    requestDescriptionLabelContainer.setText(requestDescriptionLabel);
  }

  public void setPublishRequestButtonText(String publishRequestButtonText) {
    publishRequestAction.setText(publishRequestButtonText);
  }

  public String getTo() {
    return toContainer.getText();
  }

  public String getRequestTitle() {
    return requestTitleContainer.getText();
  }

  public String getRequestDescription() {
    return requestDescriptionContainer.getText();
  }

  public Boolean getIsResponseExpected() {
    return expectsAnswerContainer.getValue();
  }

  public MultiWordSuggestOracle getOracle() {
    return oracle;
  }

  @UiHandler("publishRequestAction")
  public void onPublishRequestAction(ClickEvent clickEvent) {
    presenter.onPublishRequestAction();
  }

  @UiHandler("cancelAction")
  public void onCancelAction(ClickEvent clickEvent) {
    presenter.onCancelAction();
  }

}
