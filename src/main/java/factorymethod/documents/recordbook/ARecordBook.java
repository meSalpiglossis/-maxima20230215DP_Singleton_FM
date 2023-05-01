package factorymethod.documents.recordbook;

import factorymethod.documents.IDocument;
import factorymethod.documents.utils.Regex;

public abstract class ARecordBook implements IDocument {

    private final String uniqueID;

    public ARecordBook () {
        uniqueID = generateUniqueID();
    }

    @Override
    public String generateUniqueID() {
        return "RB-" + Regex.last9Symbols(this.toString());
    }

    @Override
    public String getID() {
        return uniqueID;
    }
}
