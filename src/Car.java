public class Car {

    private int id;
    private String company;
    private String model;
    private int year;
    private String colour;
    private double price;
    private String registerNumber;

    public Car(int id, String company, String model, int year, String colour, double price, String registerNumber){
        this.id = id;
        this.company = company;
        this.model = model;
        this.year = year;
        this.colour = colour;
        this.price = price;
        this.registerNumber = registerNumber;
    }

    public int getId(){ return id; }
    public void setId(int id) { this.id = id; }
    public String getCompany() { return company; }
    public void setCompany (String company) { this.company = company; }
    public String getModel() { return model; }
    public void setModel (String model) { this.model = model; }
    public int getYear(){ return year; }
    public void setYear(int year){ this.year = year; }
    public String getColour() { return colour; }
    public void setColour(String colour) { this.colour = colour; }
    public double getPrice () { return price; }
    public void setPrice (double price) { this.price = price; }
    public String getRegisterNumber() { return registerNumber; }
    public void setRegisterNumber (String registerNumber) { this.registerNumber = registerNumber; }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                ", registerNumber='" + registerNumber + '\'' +
                '}';
    }
}
