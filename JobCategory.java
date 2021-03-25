public enum JobCategory {
    
    WebDeveloper("Web Developer"),
    FrondEnd("Front End"),
    BackEnd("Back End"),
    UI("UI"),
    UX("UX"),
    Devops("Devops"),
    DataScientist("Data Scientist");

    private String category;

    JobCategory(String category)
    {
        this.category = category;
    }

    public String toString()
    {
        return category;
    } 
}
