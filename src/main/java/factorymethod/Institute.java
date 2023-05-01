package factorymethod;

import factorymethod.documents.IDocument;
import factorymethod.documents.diploma.*;
import factorymethod.documents.recordbook.RecordBook;
import factorymethod.documents.recordbook.RecordBookElectronic;
import factorymethod.documents.studentcard.StudentCard;
import factorymethod.documents.studentcard.StudentCardElectronic;

public class Institute {

    public IDocument createDiplomaSpecialist(String type) {
        switch (type) {
            case "Red": return new DiplomaSpecialistRed();
            case "Blue": return new DiplomaSpecialistBlue();
            default: return null;
        }
    }

    public IDocument createDiplomaMaster(String type) {
        switch (type) {
            case "Red": return new DiplomaMasterRed();
            case "Blue": return new DiplomaMasterBlue();
            default: return null;
        }
    }

    public IDocument createDiplomaBachelor(String type) {
        switch (type) {
            case "Red": return new DiplomaBachelorRed();
            case "Blue": return new DiplomaBachelorBlue();
            default: return null;
        }
    }

    public IDocument createRecordBook(String type) {
        switch (type) {
            case "Plain": return new RecordBook();
            case "Electronic": return new RecordBookElectronic();
            default: return null;
        }
    }

    public IDocument createStudentCard(String type) {
        switch (type) {
            case "Plain": return new StudentCard();
            case "Electronic": return new StudentCardElectronic();
            default: return null;
        }
    }
}
