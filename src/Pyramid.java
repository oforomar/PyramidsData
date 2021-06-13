public class Pyramid {
    private double height;
    String name;
    private String pharaoh;
    private String site;

    public Pyramid(String pharaoh, String name, String site, String height){
        try {
            this.height = Double.parseDouble(height.replaceAll("s", ""));
        }catch (Exception e){
            this.height = -1;
        }
        this.name = name;
        this.pharaoh = pharaoh;
        this.site = site;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPharaoh() {
        return pharaoh;
    }

    public void setPharaoh(String pharaoh) {
        this.pharaoh = pharaoh;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    @Override
    public String toString() {
        return "Pyramid{" +
                "height=" + height +
                ", name='" + name + '\'' +
                ", pharaoh='" + pharaoh + '\'' +
                ", site='" + site + '\'' +
                '}';
    }
}
