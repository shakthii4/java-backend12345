package com.ani.mappings.entitymapping.domain;

import javax.persistence.*;
import java.sql.Date;
@Entity
public class UserAccounts
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date created;

    @OneToOne
    @JoinColumn(name = "user_id")
    private AppUser user;
}

