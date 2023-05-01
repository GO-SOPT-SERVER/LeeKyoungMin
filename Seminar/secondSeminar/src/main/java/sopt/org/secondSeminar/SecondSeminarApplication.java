package sopt.org.secondSeminar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sopt.org.secondSeminar.domain.post.Post;
import sopt.org.secondSeminar.domain.user.User;

import java.util.ArrayList;

@SpringBootApplication
public class SecondSeminarApplication {

	public static ArrayList<User> userList;
	public static ArrayList<Post> postList;

	public static void main(String[] args) {
		SpringApplication.run(SecondSeminarApplication.class, args);

		userList = new ArrayList<>();
		postList = new ArrayList<>();
	}
}
