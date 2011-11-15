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

package pt.ist.processpedia.shared.dto.domain;

import java.util.Date;

public class RequestDetailedDto extends RequestDto {

  private String description;

  public RequestDetailedDto() {}

  public RequestDetailedDto(long oid, String title, String description, UserDto senderDto, Date lastUpdateTimestamp, ProcessDto processDto) {
    super(oid, title, senderDto, lastUpdateTimestamp, processDto);
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProcessDetailedDto getProcessDetailedDto() {
    return (ProcessDetailedDto)super.getProcessDto();
  }
}
