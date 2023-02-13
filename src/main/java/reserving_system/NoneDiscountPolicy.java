package reserving_system;

public class NoneDiscountPolicy implements DiscountPolicy {
    @Override
    public Money calculateDiscountAmount(Screening screening){
        return Money.ZERO;
    }
}
