package reserving_system;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
