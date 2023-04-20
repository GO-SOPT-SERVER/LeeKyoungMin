package sopt.org.secondSeminar.controller.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sopt.org.secondSeminar.controller.user.dto.request.RegisterRequestDto;
import sopt.org.secondSeminar.service.user.UserService;

import static sopt.org.secondSeminar.SecondSeminarApplication.userList;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @PostMapping("/user")
    public String register(@RequestBody final RegisterRequestDto request) {
//        System.out.println("성별: " + request.getGender());
//        System.out.println("이름: " + request.getName());
//        System.out.println("전화번호: " + request.getContact());
//        System.out.println("나이: " + request.getAge());

        // 서비스 계층에 유저를 등록하는 메서드를 호출

        Long userId = userService.register(request);
        System.out.println(userList.get(userId.intValue() - 1).toString());

//        return "유저 등록이 완료됐습니다.";
        return userId + "번 유저가 등록되었습니다!";
    }

    @GetMapping("/user/{userId}")
    public String getOne(@PathVariable final Long userId) {
        System.out.println("요청 유저 아이디: " + userId);

        //서비스 계층에서 유저 아이디로 유저를 찾는 메서드 호출

        return "유저 조회 성공";
    }

    @GetMapping("/user/search")
    public String search(@RequestParam final String name) {
        System.out.println("유저 이름 검색 인자: " + name);

        //서비스 계층에서 유저 닉네임으로 유저를 찾는 메서드 호출

        return "유저 검색 성공";
    }
}
