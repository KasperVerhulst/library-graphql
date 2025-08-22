package com.example.graphqldemo.input;

import java.time.LocalDate;

public record MemberInput(String firstName, String lastName, LocalDate birthDate) {}