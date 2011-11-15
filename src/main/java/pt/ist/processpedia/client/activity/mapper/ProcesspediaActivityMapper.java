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

package pt.ist.processpedia.client.activity.mapper;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.core.client.GWT;
import com.google.gwt.place.shared.Place;
import pt.ist.processpedia.client.BrowserFactory;
import pt.ist.processpedia.client.activity.*;
import pt.ist.processpedia.client.place.AccountActivationPlace;
import pt.ist.processpedia.client.place.LoginPlace;
import pt.ist.processpedia.client.place.SignupPlace;

public class ProcesspediaActivityMapper implements ActivityMapper {

  private BrowserFactory browserFactory;

  public ProcesspediaActivityMapper(BrowserFactory browserFactory) {
    this.browserFactory = browserFactory;
  }

  public Activity getActivity(Place place) {
    GWT.log("ProcesspediaActivityMapper: " + place.toString());
    if(place instanceof LoginPlace)
      return new LoginActivity((LoginPlace) place, browserFactory);
    if(place instanceof SignupPlace)
      return new SignupActivity((SignupPlace) place, browserFactory);
    if(place instanceof AccountActivationPlace)
      return new AccountActivationActivity((AccountActivationPlace) place, browserFactory);
    return new HomeActivity(place, browserFactory);
  }

}
