package Level2;

abstract class Animal {
    private String feedWith;
    private String coloer;
    private String habitat;
    public void eat(){};
    public void sleep(){};

    public String getFeedWith() {
        return feedWith;
    }

    public void setFeedWith(String feedWith) {
        this.feedWith = feedWith;
    }

    public String getColoer() {
        return coloer;
    }

    public void setColoer(String coloer) {
        this.coloer = coloer;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
