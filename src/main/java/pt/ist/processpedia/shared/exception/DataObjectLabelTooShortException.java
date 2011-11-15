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

package pt.ist.processpedia.shared.exception;

public class DataObjectLabelTooShortException extends ProcesspediaException {

  private String dataObjectLabel;
  private int minLengthAllowed;

  public DataObjectLabelTooShortException() {}

  public DataObjectLabelTooShortException(String dataObjectLabel, int minLengthAllowed) {
    setDataObjectLabel(dataObjectLabel);
    setMinLengthAllowed(minLengthAllowed);
  }

  public String getDataObjectLabel() {
    return dataObjectLabel;
  }

  public void setDataObjectLabel(String dataObjectLabel) {
    this.dataObjectLabel = dataObjectLabel;
  }

  public int getMinLengthAllowed() {
    return minLengthAllowed;
  }

  public void setMinLengthAllowed(int minLengthAllowed) {
    this.minLengthAllowed = minLengthAllowed;
  }
}
