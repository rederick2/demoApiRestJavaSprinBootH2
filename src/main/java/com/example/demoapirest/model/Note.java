package com.example.demoapirest.model;

import com.example.demoapirest.model.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Note {
    @Id
    @GeneratedValue
    private int id;

    private String content;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
