package com.thehoistory.todopus.task;


import com.thehoistory.todopus.core.BaseEntity;
import com.thehoistory.todopus.user.User;

import javax.persistence.ManyToOne;

public class Task extends BaseEntity {

    private String taskname;
    private String description;
    private Long point;

    @ManyToOne
    private User user;

}
