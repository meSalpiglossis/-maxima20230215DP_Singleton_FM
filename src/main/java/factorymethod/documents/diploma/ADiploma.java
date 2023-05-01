package factorymethod.documents.diploma;

import factorymethod.documents.IDocument;
import factorymethod.documents.utils.Regex;

public abstract class ADiploma implements IDocument {

    private final String uniqueID;

    public ADiploma () {
        uniqueID = generateUniqueID();
    }

    @Override
    public String generateUniqueID() {
        return "D-" + Regex.last9Symbols(this.toString());
    }

    @Override
    public String getID() {
        return uniqueID;
    }

}
