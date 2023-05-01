package factorymethod.documents.studentcard;

import factorymethod.documents.IDocument;
import factorymethod.documents.utils.Regex;

public abstract class AStudentCard implements IDocument {

    private final String uniqueID;

    public AStudentCard () {
        uniqueID = generateUniqueID();
    }

    @Override
    public String generateUniqueID() {
        return "SC-" + Regex.last9Symbols(this.toString());
    }

    @Override
    public String getID() {
        return uniqueID;
    }

}
