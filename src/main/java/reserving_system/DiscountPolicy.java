package reserving_system;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
