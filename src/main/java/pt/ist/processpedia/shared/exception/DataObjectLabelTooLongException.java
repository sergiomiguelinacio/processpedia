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

public class DataObjectLabelTooLongException extends ProcesspediaException {

  private String tooLongLabel;
  private int maxLength;

  public DataObjectLabelTooLongException() {}

  public DataObjectLabelTooLongException(String tooLongLabel, int maxLength) {
    setTooLongLabel(tooLongLabel);
    setMaxLength(maxLength);
  }

  public String getTooLongLabel() {
    return tooLongLabel;
  }

  public void setTooLongLabel(String tooLongLabel) {
    this.tooLongLabel = tooLongLabel;
  }

  public int getMaxLength() {
    return maxLength;
  }

  public void setMaxLength(int maxLength) {
    this.maxLength = maxLength;
  }
}
