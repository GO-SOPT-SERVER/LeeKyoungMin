package sopt.org.secondSeminar.controller.post;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sopt.org.secondSeminar.controller.post.dto.request.PostRequestDto;
import sopt.org.secondSeminar.domain.post.Post;
import sopt.org.secondSeminar.service.post.PostService;

import static sopt.org.secondSeminar.SecondSeminarApplication.postList;

@RestController
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @PostMapping("/post")
    public String register(@RequestBody final PostRequestDto request) {
        Long postId = postService.register(request);
        System.out.println(postList.get(postId.intValue() - 1).toString());

        return postId + "번 게시글이 등록되었습니다!";
    }

    @GetMapping("/post/{postId}")
    public String getOne(@PathVariable final int postId) {
        System.out.println("요청 게시글 아이디: " + postId);

        //서비스 계층에서 게시글 아이디로로 게시글을 찾는 메서드 호출
        Post findPost = postList.get(postId-1);

        return findPost.getTitle() + " 제목의 게시글 조회 성공";
    }

    @GetMapping("/post/search")
    public String search(@RequestParam final String postName) {
        System.out.println("유저 게시물 이름 검색 인자: " + postName);

        //서비스 계층에서 게시물 제목으로 게시물을 찾는 메서드 호출
        Post findPost = postList.stream().filter(post -> post.getTitle().contains(postName))
                .findFirst().orElse(null);

        return findPost.getTitle() + " 게시글 제목으로 검색 성공";
    }
}
