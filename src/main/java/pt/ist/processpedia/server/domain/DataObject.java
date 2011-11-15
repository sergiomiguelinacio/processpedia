package pt.ist.processpedia.server.domain;

import java.util.Set;

public class DataObject extends DataObject_Base {

  public enum DataObjectType { COMPOSED, INTEGER, DOUBLE, STRING, DATE, FILE }

  public DataObject(String label, Set<DataObjectVersion> childDataObjectVersionSet) {
    createNewComposedDataObjectVersion(label, childDataObjectVersionSet);
  }

  public DataObject(DataObjectType type, String label, String externalizedValue) {
    createNewAtomicDataObjectVersion(type, label, externalizedValue);
  }

  public ComposedDataObjectVersion createNewComposedDataObjectVersion(String label, Set<DataObjectVersion> childDataObjectVersionSet) {
    ComposedDataObjectVersion newVersion = new ComposedDataObjectVersion(label);
    for(DataObjectVersion childdataObjectVersion : childDataObjectVersionSet) {
      newVersion.addChild(childdataObjectVersion);
    }
    newVersion.setPreviousVersion(getLatestVersion());
    addVersion(newVersion);
    setLatestVersion(newVersion);
    return newVersion;
  }

  public DataObjectVersion createNewAtomicDataObjectVersion(DataObjectType type, String label, String externalizedValue) {
    AtomicDataObjectVersion newVersion = new AtomicDataObjectVersion(type, label, externalizedValue);
    newVersion.setPreviousVersion(getLatestVersion());
    addVersion(newVersion);
    setLatestVersion(newVersion);
    return newVersion;
  }

}
