package reserving_system;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class PeriodCondition implements DiscountCondition{
    private DayOfWeek dayOfWeek;
    private LocalDate startTime;
    private LocalDate endTime;

    public PeriodCondition(DayOfWeek dayOfWeek, LocalDate startTime, LocalDate endTime) {
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public boolean isSatisfiedBy(Screening screening){
        return screening.getStartTime().getDayOfWeek().equals(dayOfWeek) &&
                startTime.compareTo(ChronoLocalDate.from(screening.getStartTime().toLocalTime())) <= 0 &&
                endTime.compareTo(ChronoLocalDate.from(screening.getStartTime().toLocalTime())) >= 0;
    }
}
