public class Flower {
    private String flowerColor;
    private String country;
    private double cost;
    private int lifeSpan;

    public Flower(String flowerColor, String country, double cost, int lifeSpan) {
        if (flowerColor == null || flowerColor.equals("")) {
            this.flowerColor = "Белый";
        } else {
            this.flowerColor = flowerColor;
        }
        if (country == null || country.equals("")) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
        if (cost <= 0.00f) {
            this.cost = 1.00f;
        } else {
            this.cost = cost;
        }
        if (lifeSpan < 0) {
            this.lifeSpan = Math.abs(lifeSpan);
        } else if (lifeSpan == 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null || flowerColor.equals("")) {
            this.flowerColor = "Белый";
        } else {
            this.flowerColor = flowerColor;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null || country.equals("")) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost <= 0.00f) {
            this.cost = 1.00f;
        } else {
            this.cost = cost;
        }
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan < 0) {
            this.lifeSpan = Math.abs(lifeSpan);
        } else if (lifeSpan == 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }
}
