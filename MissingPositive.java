package com.example.demo;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


@Component
public class MissingPositive {
    public static int firstMissingPositive(int[] nums) {

        Set<Integer> set = new HashSet<>();

        // Add all positive integers from the array to the set
        for (int num : nums) {
            if (num > 0) {
                set.add(num);
            }
        }

        // Find the smallest missing positive integer
        for (int i = 1; i <= nums.length + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return 1;

    }

    public static void main(String[] args) {
        System.out.println( firstMissingPositive(new int[]{1,2,3,4,5,6,7,12}));
    }
    }

