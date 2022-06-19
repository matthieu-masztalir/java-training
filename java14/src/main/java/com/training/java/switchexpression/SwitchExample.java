package com.training.java.switchexpression;

import java.time.DayOfWeek;

public class SwitchExample {
    /**
     * All case must be cover
     *
     * @param dayOfWeek {@link DayOfWeek}
     * @return True when it's a week-end !!
     */
    boolean isHoliday(DayOfWeek dayOfWeek) {
        return switch (dayOfWeek) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> false;
            case SATURDAY, SUNDAY -> true;
        };
    }

    /**
     * <p>Switch result store in a variable.</p>
     * <p>Use yield keyword.</p>
     * <p>Brackets are mandatory around yield keyword.</p>
     * <p>Default case is mandatory otherwise there are a error :</p>
     * <p>java: the switch expression does not cover all possible input values</p>
     */
    boolean useYieldKeyword(final Integer op1, final String comparator, final Integer op2) {
        var result = switch (comparator) {
            case "GREATER THAN" -> {
                yield op1 > op2;
            }
            case "LOWER THAN" -> op1 < op2;
            default -> false;
        };

        return result;
    }
}
