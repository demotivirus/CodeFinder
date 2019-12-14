package Collections.List.EqualsHashCode;

public class Houme {
    private int address;
    private String street;

    public Houme(int address, String street) {
        this.address = address;
        this.street = street;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Houme houme = (Houme) o;

        if (getAddress() != houme.getAddress()) return false;
        return getStreet() != null ? getStreet().equals(houme.getStreet()) : houme.getStreet() == null;
    }

    @Override
    public int hashCode() {
        int result = getAddress();
        result = 31 * result + (getStreet() != null ? getStreet().hashCode() : 0);
        return result;
    }
}
