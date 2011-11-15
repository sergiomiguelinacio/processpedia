package pt.ist.processpedia.server.domain;

import pt.ist.processpedia.server.domain.DataObject.DataObjectType;

public class AtomicDataObjectVersion extends AtomicDataObjectVersion_Base {

  public AtomicDataObjectVersion(DataObjectType type, String label, String externalizedValue) {
    init(type, label);
    setExternalizedValue(externalizedValue);
  }

}
