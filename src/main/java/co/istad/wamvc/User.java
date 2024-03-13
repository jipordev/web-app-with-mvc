package co.istad.wamvc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.UUID;

@Data
@AllArgsConstructor
@ToString
public class User {
    private String id;
    private String name;
    private String email;

    public User() {
        this.id = shortUUID(UUID.randomUUID().toString()); // Generate UUID for id
    }

    public User(String name, String email) {
        this.id = shortUUID(UUID.randomUUID().toString()); // Generate UUID for id
        this.name = name;
        this.email = email;
    }


    public static String shortUUID(String uuid){
        String shortUuid = uuid.substring(0,8);
        return shortUuid;
    }
}
