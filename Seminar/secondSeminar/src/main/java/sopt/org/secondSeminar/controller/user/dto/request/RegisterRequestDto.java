package sopt.org.secondSeminar.controller.user.dto.request;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class RegisterRequestDto {
    private String gender;
    private String name;
    private String contact;
    private int age;
}
