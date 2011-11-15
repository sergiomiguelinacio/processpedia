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

package pt.ist.processpedia.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class RequestPlace extends Place {

  private Long requestOid;

  public RequestPlace(long requestOid) {
    this.requestOid = requestOid;
  }

  public RequestPlace(String token) {
    requestOid = Long.parseLong(token);
  }

  public Long getRequestOid() {
    return requestOid;
  }

  @Prefix("request")
  public static class Tokenizer implements PlaceTokenizer<RequestPlace> {

    public RequestPlace getPlace(String token) {
      return new RequestPlace(token);
    }

    public String getToken(RequestPlace place) {
      return place.getRequestOid().toString();
    }
  }
}
