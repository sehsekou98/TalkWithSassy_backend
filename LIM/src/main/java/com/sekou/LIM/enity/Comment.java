package com.sekou.LIM.enity;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String text;
}
