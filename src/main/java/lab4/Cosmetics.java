package lab4;

public class Cosmetics {
    private String name;
    private String brand;
    private String use;
    private String sex;
    private int price;

    public Cosmetics() {
    }

    public Cosmetics(String name,
                     String brand,
                     String use,
                     String sex,
                     int price) {
        this.name = name;
        this.brand = brand;
        this.use = use;
        this.sex = sex;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cosmetics{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", use='" + use + '\'' +
                ", sex='" + sex + '\'' +
                ", price=" + price +
                '}';
    }
}
