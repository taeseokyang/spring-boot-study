package me.yang.springbootdeveloper.domain;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.ErrorResponse;


@Entity //엔티티로 지정
@Getter //멤버 게터 자동 생성
@NoArgsConstructor(access = AccessLevel.PROTECTED) //기본 생성자 생성 + 권한 protected로 설정
public class Article {

    @Id // 기본키
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content", nullable = false)
    private String content;

    @Builder // 빌더 패턴을 사용하여 직관적인 객체 생성
    private  Article(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void update(String title, String content){
        this.title = title;
        this.content = content;
    }
}
