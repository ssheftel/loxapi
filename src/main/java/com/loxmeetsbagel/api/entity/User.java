package com.loxmeetsbagel.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
@Table(name="APP_USER")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
//
//    CREATE TABLE app_user (
//            id SERIAL PRIMARY KEY,
//            username TEXT NOT NULL,
//            password TEXT NOT NULL,
//            email TEXT NOT NULL,
//            first_name TEXT NOT NULL,
//            last_name TEXT NOT NULL,
//            gender CHAR(1) NOT NULL,
//    photo_url TEXT DEFAULT '',
//    profile jsonb DEFAULT '{}'::JSON,
//    event_name TEXT NOT NULL ,
//    active BOOL DEFAULT TRUE
//);


    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

    @Column(name="email")
    private String email;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name="gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "photo_url")
    private String photoUrl;

    @Column(name = "profile")
    @Type(type = "com.marvinformatics.hibernate.json.JsonUserType")
    private Map<String, String> profile;

    @Column(name = "event_name")
    private String eventName;

    @Column(name = "active")
    private Boolean active;


    @OneToMany
    @JoinColumn(name="APP_USER_ID", referencedColumnName="ID")
    private List<UserRole> roles;


}
