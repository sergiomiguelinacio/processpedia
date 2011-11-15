package pt.ist.processpedia.server.domain;

import org.joda.time.DateTime;
import pt.ist.processpedia.server.domain.DataObject.DataObjectType;

public abstract class DataObjectVersion extends DataObjectVersion_Base {

  protected void init(DataObjectType type, String label) {
    setType(type);
    setLabel(label);
    setCreationTimestamp(new DateTime());
  }

}
