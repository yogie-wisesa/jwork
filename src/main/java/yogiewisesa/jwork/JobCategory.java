package yogiewisesa.jwork;
/**
 * 
 *
 * @author (Yogie Wisesa)
 * @version (27.03.2021)
 */
public enum JobCategory {
    
    WebDeveloper("Web Developer"),
    FrondEnd("Front End"),
    BackEnd("Back End"),
    UI("UI"),
    UX("UX"),
    Devops("Devops"),
    DataScientist("Data Scientist");

    private String category;

    /**
     * 
     * @param category
     */
    JobCategory(String category)
    {
        this.category = category;
    }

    /**
     * 
     */
    public String toString()
    {
        return category;
    } 
}
