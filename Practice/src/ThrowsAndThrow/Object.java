package ThrowsAndThrow;
public class Object {
    public Object(int a) throws MaireFelaException{
        if(a<16)
            throw new MaireFelaException("More ja");
    }
}
