package example.jbehave.app.domain;

public class CustomerIdentifier {

    private String identifier;

    public CustomerIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomerIdentifier that = (CustomerIdentifier) o;

        return !(identifier != null ? !identifier.equals(that.identifier) : that.identifier != null);

    }

    @Override
    public int hashCode() {
        return identifier != null ? identifier.hashCode() : 0;
    }

    @Override
    public String toString() {
        return identifier;
    }
}
