public abstract class Q7 {
    public abstract void checkValue(Object value) throws IllegalArgumentException;

    public boolean isValueANumber (Object val) {
        if(val instanceof Number) {
            return true;
        } else {
            try {
                Double.parseDouble(val.toString());
                return true;
            } catch (NumberFormatException ex) {
                return false;
            }
        }
    }
}
