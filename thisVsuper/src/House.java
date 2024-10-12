public class House {

    private String colour;

    public House(String colour) {
        // keyword (this) is required, same parameter name as field.
        this.colour = colour;
    }

    public String getColour() {
        // (this) is optional
        return colour; // Same as return this.colour;
    }

    public void setColour(String colour) {
        // keyword (this) is required, same parameter name as field.
        this.colour = colour;
    }
}
