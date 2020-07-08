package nl.miwgroningen.cohort3.reinout.vrijProject.voetbalUitslagen.Enums;

/**
 * @author Reinout Smit <reinoutsmit@live.nl>
 * <p>
 * Dit programma is een uitwerking van opdracht
 * <p>
 * <Beschrijf wat dit programma doet>
 */
public enum Teams {

    ADODENHAAG("Ado den Haag"),
    AJAX("Ajax"),
    AZ("AZ"),
    FCEMMEN("FC Emmen"),
    FCGRONINGEN("FC Groningen"),
    FCTWENTE("FC Twente"),
    FCUTRECHT("FC Utrecht"),
    FEYENOORD("Feyenoord"),
    FORTUNASITTARD("Fortuna Sittard"),
    HERACLESALMELO("Heracles Almelo"),
    PECZWOLLE("PEC Zwolle"),
    PSV("PSV"),
    RKCWAALWIJK("RKC Waalwijk"),
    SCHEERENVEEN("SC Heerenveen"),
    SPARTA("Sparta"),
    VITESSE("Vitesse"),
    VVVVENLO("VVV Venlo"),
    WILLEMII("Willem II");

    private final String displayValue;

    Teams(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }
}
