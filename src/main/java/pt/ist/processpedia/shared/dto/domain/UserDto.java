package pt.ist.processpedia.shared.dto.domain;

public class UserDto extends DomainObjectDto {

  private String name;

  public UserDto() {}

  public UserDto(long oid, String name) {
    super(oid);
    setName(name);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
