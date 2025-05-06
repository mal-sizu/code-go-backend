package com.dynac.plantation.model;

import lombok.Data;

@Data
public class Option {
    private String text;
    private int votes = 0;
}