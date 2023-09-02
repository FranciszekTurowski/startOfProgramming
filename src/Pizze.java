public enum Pizze {
    MARGHERITA(true,true,false,false),
    CAPRICIOSA(true,true,true,false),
    PROSCIUTTO(true,true,false,true),
    ;
    private final boolean tomatoSauce;
    private final boolean cheese;
    private final boolean mushrooms;
    private final boolean ham;

    Pizze(boolean tomatoSauce, boolean cheese, boolean mushrooms, boolean ham) {
        this.tomatoSauce = tomatoSauce;
        this.cheese = cheese;
        this.mushrooms = mushrooms;
        this.ham = ham;
    }

    @Override
    public String toString() {
       String result = name() + " (";
               if(tomatoSauce == true)
                   result += " sos";
               if(cheese == true)
                    result += " ser";
               if(mushrooms == true)
                   result += " grzyby";
               if(ham == true)
                   result += " wędlina";

        return result + " ) ";
    }
}
