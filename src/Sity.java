public enum Sity {
    ITALIA( " Wonderful country"),
    BISHKEK(" My country"),
    MOCKOW(" Couid country"),
    VETNAM( " Beatiful country"),
    PEKIN(" Big country");
    private String country;


    Sity(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}

