public abstract class Burger implements items{

    @Override
    public Package packing() {
        return new Wrapper();
    };
}
