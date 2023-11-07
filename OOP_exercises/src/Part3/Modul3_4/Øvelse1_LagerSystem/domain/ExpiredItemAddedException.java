package Part3.Modul3_4.Øvelse1_LagerSystem.domain;

public class ExpiredItemAddedException extends Exception{
    public ExpiredItemAddedException () {
        super("Attempted to add expired product to database");
    }
}
