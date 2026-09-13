package com;

public record SalesEmployee(
        int id,
        String name,
        int gender, // 1:男 2:女
        int salesAmount
) {
}
