package creational.factory.pizza2;

public class VN_PizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(PizzaType type) {
        switch (type){
            case Seafood :
                return new VN_PizzaSeafood();
        }
//        if (type == PizzaType.Seafood)
//            return new VN_PizzaSeafood();
        return null;
    }
}
