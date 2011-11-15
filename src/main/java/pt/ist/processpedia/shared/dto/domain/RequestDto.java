package pt.ist.processpedia.shared.dto.domain;

import com.google.gwt.view.client.ProvidesKey;

import java.util.Comparator;
import java.util.Date;

public class RequestDto extends DomainObjectDto {

  public static final ProvidesKey<RequestDto> KEY_PROVIDER = new ProvidesKey<RequestDto>() {
    public Object getKey(RequestDto requestDto) {
      return requestDto == null ? null : requestDto.getOid();
    }
  };

  private String title;
  private UserDto senderDto;
  private ProcessDto processDto;
  private Date lastUpdateTimestamp;
  
  public RequestDto() {}

  public RequestDto(long oid, String title, UserDto senderDto, Date lastUpdateTimestamp, ProcessDto processDto) {
    super(oid);
    setTitle(title);
    setSenderDto(senderDto);
    setLastUpdateTimestamp(lastUpdateTimestamp);
    setProcessDto(processDto);
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public UserDto getSenderDto() {
    return senderDto;
  }

  public void setSenderDto(UserDto senderDto) {
    this.senderDto = senderDto;
  }

  public Date getLastUpdateTimestamp() {
    return lastUpdateTimestamp;
  }

  public void setLastUpdateTimestamp(Date lastUpdateTimestamp) {
    this.lastUpdateTimestamp = lastUpdateTimestamp;
  }

  public ProcessDto getProcessDto() {
    return processDto;
  }

  public void setProcessDto(ProcessDto processDto) {
    this.processDto = processDto;
  }

  public static class CompareRequestTitleName implements Comparator<RequestDto> {
    public int compare(RequestDto a, RequestDto b) {
      if(a == null || a.getTitle()==null)
        return -1;
      if(b == null || b.getTitle()==null)
        return 1;
      else return a.getTitle().compareTo(b.getTitle());
    }
  }

  public static class CompareProcessTitleName implements Comparator<RequestDto> {
    public int compare(RequestDto a, RequestDto b) {
      if(a == null || a.getProcessDto() == null || a.getProcessDto().getTitle() == null)
        return -1;
      if(b == null || b.getProcessDto() == null || a.getProcessDto().getTitle() == null)
        return 1;
      else return a.getProcessDto().getTitle().compareTo(b.getProcessDto().getTitle());
    }
  }

  public static class CompareLastUpdateTimestamp implements Comparator<RequestDto> {
    public int compare(RequestDto a, RequestDto b) {
      if(a == null || a.getLastUpdateTimestamp() == null)
        return -1;
      if(b == null || b.getLastUpdateTimestamp() == null)
        return 1;
      else return a.getLastUpdateTimestamp().compareTo(b.getLastUpdateTimestamp());
    }
  }

  public static class CompareSenderName implements Comparator<RequestDto> {
    public int compare(RequestDto a, RequestDto b) {
      if(a == null || a.getSenderDto() == null || a.getSenderDto().getName() == null)
        return -1;
      if(b == null || b.getSenderDto() == null || a.getSenderDto().getName() == null)
        return 1;
      else return a.getSenderDto().getName().compareTo(b.getSenderDto().getName());
    }
  }


}
