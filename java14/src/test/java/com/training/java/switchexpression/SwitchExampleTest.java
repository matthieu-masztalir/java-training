package com.training.java.switchexpression;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;

class SwitchExampleTest {
    private SwitchExample switchExample;

    @BeforeEach
    void setUp() {
        switchExample = new SwitchExample();
    }

    @Test
    void shouldReturnWeekend_whenUseSwitch_andCoverAllCases() {
        Assertions.assertTrue(switchExample.isHoliday(DayOfWeek.SATURDAY));
    }

    @Test
    void shouldReturnWeek_whenUseSwitch_andCoverAllCases() {
        Assertions.assertFalse(switchExample.isHoliday(DayOfWeek.MONDAY));
    }

    @Test
    void useYieldKeyword() {
        Assertions.assertTrue(switchExample.useYieldKeyword(2, "GREATER THAN", 0));
    }
}