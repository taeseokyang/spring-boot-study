package me.yang.springbootdeveloper.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.yang.springbootdeveloper.domain.*;

@NoArgsConstructor // 기본 생성자 생성
@AllArgsConstructor //생성자 생성
@Getter // 게터 생성
public class AddArticleRequest {
    private String title;
    private String content;

    public Article toEntity(){
        return Article.builder() // article 객체 생성
                .title(title)
                .content(content)
                .build();
    }
}
//dto는 단순한 데이터 전달자 객체