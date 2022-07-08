package Address;

import java.util.Objects;

public class MyClass {
    String city;
    String street;
    int houseNumber;

    public MyClass(String city, String street, int houseNumber) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClass myClass = (MyClass) o;
        return houseNumber == myClass.houseNumber &&
                Objects.equals(city, myClass.city) && Objects.equals(street, myClass.street);
    }

    // сравнение по параметру "номер дома"
    public boolean myEquals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClass myClass = (MyClass) o;
        return houseNumber == myClass.houseNumber;
    }

    // сравнение по параметру "название города"
    public boolean MyCityEquals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClass myClass = (MyClass) o;
        return Objects.equals(city, myClass.city);
    }

    // сравнение по параметру "название улицы"
    public boolean MyStreetEquals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClass myClass = (MyClass) o;
        return Objects.equals(street, myClass.street);
    }

    @Override
    public int hashCode() {
        int result = 1;
        final int i = 31;
        result = i * result + (city == null ? 0 : city.hashCode());
        result = i * result + (street == null ? 0 : street.hashCode());
        result = i * result + houseNumber;
        return result;
    }
}
