package com.jy.s1.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter //클래스 내 모든 필드의 getter메소드 생성
@NoArgsConstructor  //기본 생성자 자동추가
@Entity  // 테이블과 링크될 클래스
public class Posts {

    @Id   // pk값
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //pk생성규칙.
    private Long id;

    @Column(length = 500, nullable = false) //테이블 컬럼.
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder  //해당 클래스의 빌더 패턴 클래스 생성.
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;

    }

}
