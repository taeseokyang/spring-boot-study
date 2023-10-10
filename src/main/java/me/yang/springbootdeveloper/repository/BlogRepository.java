package me.yang.springbootdeveloper.repository;

import me.yang.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository<Article, Long> 엔티티 이름과 엔티티 기본키의 타입
//save(), findById(), findAll(), deleteById()와 같은 메소드 제공
//JpaRepository내부적으로 빈등록 됨.
public interface BlogRepository extends JpaRepository<Article, Long> {
}
