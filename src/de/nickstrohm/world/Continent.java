package de.nickstrohm.world;

public class Continent {
    private String name;
    private long area;
    private long citizens;

    public Continent(String name, long area, long citizens) {
        setName(name);
        setArea(area);
        setCitizens(citizens);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public long getArea() {
        return area;
    }

    private void setArea(long area) {
        this.area = area;
    }

    public long getCitizens() {
        return citizens;
    }

    private void setCitizens(long citizens) {
        this.citizens = citizens;
    }

    public boolean isLargerThen(Continent comparer) {
        if (getArea() == comparer.getArea()) {
            return getCitizens() > comparer.getCitizens();
        }

        return getArea() > comparer.getArea();
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\r\n Area: " + getArea() + "\r\n Citizens: " + getCitizens();
    }
}
