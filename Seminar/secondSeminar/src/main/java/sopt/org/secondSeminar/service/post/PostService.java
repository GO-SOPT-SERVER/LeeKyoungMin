package sopt.org.secondSeminar.service.post;

import org.springframework.stereotype.Service;
import sopt.org.secondSeminar.controller.post.dto.request.PostRequestDto;
import sopt.org.secondSeminar.domain.post.Post;

import static sopt.org.secondSeminar.SecondSeminarApplication.postList;

@Service
public class PostService {

    public Long register(PostRequestDto request) {
        //받아온 request 데이터를 토대로 실제 User 객체 생성
        Post newPost = new Post(
                request.getTitle(),
                request.getContent()
        );

        //데이터베이스에 저장
        postList.add(newPost);
        newPost.setId((long) postList.size());

        //저장한 유저 아이디 값 반환
        return newPost.getId();
    }
}
