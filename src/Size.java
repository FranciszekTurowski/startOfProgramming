enum Size {
    SMALL("Mały"), MEDIUM("Średni"), LARGE("Duży");

    private final String description;

    Size(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description +" "+ name()+" "+ ordinal();
    }
}
