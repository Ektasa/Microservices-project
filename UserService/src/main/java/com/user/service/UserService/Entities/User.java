package com.user.service.UserService.Entities;


import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name="users")
public class User {

    @Id
    private Long id;
    //    @Id
//    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="UserId")
    private String UserId;
    @Column(name = "Name")
    private  String Name;
    @Column(name = "Email")
        private String Email;
    @Column(name = "About")
        private String About;
}
