package pt.ist.processpedia.server.domain;

import pt.ist.processpedia.server.domain.DataObject.DataObjectType;

public class ComposedDataObjectVersion extends ComposedDataObjectVersion_Base {

  public ComposedDataObjectVersion(String label) {
    init(DataObjectType.COMPOSED, label);
  }

}
