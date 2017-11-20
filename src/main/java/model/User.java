package model;

import lombok.*;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String name;
    private String email;
    private String password;
}
