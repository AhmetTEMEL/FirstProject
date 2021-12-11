package com.Dev.FirstProject.Entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetUserDto {
    private int id;
    private String name;
    private String surname;
    private String registerdate;
    private String email;
}
