package seedu.apollo.module;


import java.util.ArrayList;

/**
 * Class representing a Module.
 * Contains the Module's code and name.
 */
public class Module {
    private String code;
    private String title;

    private String moduleCredits;

    private ArrayList<Timetable> timetable;


    /**
     * Initialises the Module with its corresponding code and name.
     *
     * @param moduleCode The code of the module e.g. CS2113
     * @param moduleName The name of the module e.g. Software Engineering and Object-Oriented Programming
     */
    public Module(String moduleCode, String moduleName, String moduleCredits) {
        this.code = moduleCode;
        this.title = moduleName;
        this.moduleCredits = moduleCredits;
    }


    /**
     * Retrieves a String with the module's code.
     *
     * @return String of the module code
     */
    public String getCode() {
        return code;
    }

    /**
     * Retrieves a String with the module's name.
     *
     * @return String of the module name
     */
    public String getTitle() {
        return title;
    }

    public String getModuleCredits() {
        return moduleCredits;
    }

    public void setTimetable(ArrayList<Timetable> timetable) {
        this.timetable = timetable;
    }

    /**
     * Retrieves a ArrayList with the module's timetable information.
     *
     * @return ArrayList of the module timetable information.
     */
    public ArrayList<Timetable> getModuleTimetable() {
        return timetable;
    }


    /**
     * Prints out the Module in desired format.
     */
    @Override
    public String toString() {
        return code + ": " + title;
    }

    public void createNewTimeTable() {
        this.timetable = new ArrayList<>();
    }
}
