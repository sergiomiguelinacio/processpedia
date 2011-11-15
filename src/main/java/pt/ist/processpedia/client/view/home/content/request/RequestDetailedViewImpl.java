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
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.*;

public class RequestDetailedViewImpl extends Composite implements RequestDetailedView {

  interface RequestDetailedViewImplUiBinder extends UiBinder<Widget,RequestDetailedViewImpl> {}
  private static RequestDetailedViewImplUiBinder uiBinder = GWT.create(RequestDetailedViewImplUiBinder.class);

  @UiField
  HasText processTitleContainer, processDescriptionContainer, requestTitleContainer, requestDescriptionContainer;

  @UiField
  Tree dataObjectTree;

  private Presenter presenter;

  public RequestDetailedViewImpl() {
    initWidget(uiBinder.createAndBindUi(this));
    TreeItem root = new TreeItem("Aluno");
    root.addItem(new TreeItem("Número: 55371"));
    root.addItem(new TreeItem("Nome: David Martinho"));

    dataObjectTree.addItem(root);
    
  }

  public void setPresenter(Presenter presenter) {
    this.presenter = presenter;
  }

  public void prepareView() {
    processTitleContainer.setText("");
    processDescriptionContainer.setText("");
    requestTitleContainer.setText("");
    requestDescriptionContainer.setText("");
  }

  public void setProcessTitle(String processTitle) {
    processTitleContainer.setText(processTitle);
  }

  public void setProcessDescription(String processDescription) {
    processDescriptionContainer.setText(processDescription);
  }

  public void setRequestTitle(String requestTitle) {
    requestTitleContainer.setText(requestTitle);
  }

  public void setRequestDescription(String requestDescription) {
    requestDescriptionContainer.setText(requestDescription);
  }


}
