package com.example.sprintspringtask1.modals;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    private Long id;
    private String name;
    private String surname;
    private Integer exam;
    private String mark;
}
