package factorymethod;

import factorymethod.documents.IDocument;
import factorymethod.documents.diploma.*;
import factorymethod.documents.recordbook.RecordBook;
import factorymethod.documents.recordbook.RecordBookElectronic;
import factorymethod.documents.studentcard.StudentCard;
import factorymethod.documents.studentcard.StudentCardElectronic;

public class Institute {

    public IDocument createDiplomaSpecialist(DiplomaType type) {
        switch (type) {
            case RED: return new DiplomaSpecialistRed();
            case BLUE: return new DiplomaSpecialistBlue();
            default: return null;
        }
    }

    public IDocument createDiplomaMaster(DiplomaType type) {
        switch (type) {
            case RED: return new DiplomaMasterRed();
            case BLUE: return new DiplomaMasterBlue();
            default: return null;
        }
    }

    public IDocument createDiplomaBachelor(DiplomaType type) {
        switch (type) {
            case RED: return new DiplomaBachelorRed();
            case BLUE: return new DiplomaBachelorBlue();
            default: return null;
        }
    }

    public IDocument createRecordBook(DocumentType type) {
        switch (type) {
            case PLAIN: return new RecordBook();
            case ELECTRONIC: return new RecordBookElectronic();
            default: return null;
        }
    }

    public IDocument createStudentCard(DocumentType type) {
        switch (type) {
            case PLAIN: return new StudentCard();
            case ELECTRONIC: return new StudentCardElectronic();
            default: return null;
        }
    }
}
