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

import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.user.client.ui.*;

import java.util.HashSet;
import java.util.Set;

public class MultiValueSuggestBox extends Composite {

  private FlowPanel container;
  private Set<String> valueSet;
  private SuggestBox suggestBox;

  public MultiValueSuggestBox(SuggestOracle suggestOracle) {
    valueSet = new HashSet<String>();
    suggestBox = new SuggestBox(suggestOracle);
    container = new FlowPanel();
    container.setWidth("100%");
    container.add(suggestBox);
    initWidget(container);
    suggestBox.addSelectionHandler(new SelectionHandler<SuggestOracle.Suggestion>() {
      public void onSelection(SelectionEvent<SuggestOracle.Suggestion> suggestionSelectionEvent) {
        onSuggestionSelection(suggestionSelectionEvent.getSelectedItem().getReplacementString());
      }
    });
  }

  private void onSuggestionSelection(final String item) {
    if(!valueSet.contains(item)) {
      valueSet.add(item);
      final Token token = new Token(item);
      token.addRemoveHandler(new Token.RemoveTokenHandler() {
        public void onRemoveToken() {
          token.removeFromParent();
          valueSet.remove(item);
        }
      });
      container.insert(token, container.getWidgetCount()-1);
    }
    suggestBox.setText("");
  }

  public Set<String> getValueSet() {
    return valueSet;
  }

  public String getText() {
    String result = "";
    for(String s : valueSet) {
      result = result + s +", ";
    }
    return result;
  }

  public void setText(String text) {
    suggestBox.setText(text);
  }

  public void clear() {
    container.clear();
    valueSet.clear();
    suggestBox.setText("");
    container.add(suggestBox);
  }
}