package com.in28minutes.database.databasedemo;

import com.in28minutes.database.databasedemo.entity.MyMath;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyMathTest {
    private MyMath math = new MyMath();

        @Test
        void calculateSum_ThreeMemberArray() {
            assertEquals(6, math.calculateSum(new int[] {1,2,3}));
        }
}
