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

package pt.ist.processpedia.client.view.util;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;

public class Token extends Composite {

  private Anchor label;
  private Anchor removeAction;
  private FlowPanel container;

  public Token(String token) {
    label = new Anchor(token);
    removeAction = new Anchor("x");
    container = new FlowPanel();
    container.add(label);
    container.add(removeAction);
    container.setWidth("100%");
    initWidget(container);
  }

  public void addRemoveHandler(final RemoveTokenHandler removeHandler) {
    removeAction.addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent clickEvent) {
        removeHandler.onRemoveToken();
      }
    });
  }


  public interface RemoveTokenHandler {
    void onRemoveToken();
  }


}
