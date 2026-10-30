package com.vitthal.registration;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Participant {
    @NotBlank(message = "name cannot be empty")
    @Size(min = 3, max = 30, message = "name must be 3 to 30 characters")
    private String name;

    @NotBlank(message = "email cannot be empty")
    @Email(message = "email is not valid")
    private String email;

    @Min(value = 16, message = "you must be at least 16 to register")
    @Max(value = 60, message = "age cannot be more than 60")
    private int age;

    @Pattern(regexp = "[6-9][0-9]{9}", message = "phone must be a 10 digit Indian mobile number")
    private String phone;

    public Participant(String name, String email, int age, String phone) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }
}
