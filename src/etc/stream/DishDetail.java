package etc.stream;

public class DishDetail {

    private final String dishName;
    private final String type;

    public DishDetail(Dish dish) {
        this.dishName = dish.getName();
        this.type = dish.getType().getDesc();
    }

    @Override
    public String toString() {
        return "DishDetail{" +
                "dishName='" + dishName + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
