// Wrapper on int so it can be passed by reference
class IntegerWrapper {
    public Integer value;

    IntegerWrapper(Integer value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return String.valueOf(value);
    }
}
