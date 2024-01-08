package template_method.cd3;

public class SortPoductByPrice extends SortCollection<Product>{
    @Override
    protected int myCompare(Product t1, Product t2) {
        if (t1.price < t2.price)
            return -1;
        else if (t1.price == t2.price)
            return 0;
        else return 1;
    }
}
