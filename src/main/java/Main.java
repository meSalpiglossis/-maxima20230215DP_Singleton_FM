import factorymethod.Institute;
import factorymethod.documents.IDocument;
import singleton.SingleLogger;

public class Main {
    public static void main(String[] args) {

//        makeSingleLoggerWork();

        makeInstituteWork();


    }

    private static void makeSingleLoggerWork() {
        for (Integer i = 0; i < 3; i++) {
            SingleLogger.getLogger().makeRecord(i.toString());
        }
    }

    private static void makeInstituteWork() {
        Institute institute = new Institute();
        IDocument someDiploma = institute.createDiplomaSpecialist("Red");
        System.out.println(someDiploma.getID());
    }
}
