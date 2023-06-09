package com.sekou.LIM.enity;

import jakarta.persistence.*;
import lombok.*;

import javax.annotation.processing.Generated;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;
    private String createdBY;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
}
