package yogiewisesa.jwork;
/**
 * 
 *
 * @author (Yogie Wisesa)
 * @version (27.03.2021)
 * 
 * enum category job
 */
public enum JobCategory {
    
    /**
     * inisiasi enum
     */
    WebDeveloper("Web Developer"),
    FrondEnd("Front End"),
    BackEnd("Back End"),
    UI("UI"),
    UX("UX"),
    Devops("Devops"),
    DataScientist("Data Scientist");

    private String category;

    /**
     * constructor enum
     * @param category
     */
    JobCategory(String category)
    {
        this.category = category;
    }

    /**
     * method untuk mencetak category
     */
    public String toString()
    {
        return category;
    } 
}
