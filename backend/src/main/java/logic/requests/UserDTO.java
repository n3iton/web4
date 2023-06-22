package logic.requests;

import lombok.Data;
import javax.validation.constraints.*;
import java.io.Serializable;

/**
 * Объект обращения к серверу для {@code UserController}.
 * @see logic.controllers.UserController
 */
@Data
public class UserDTO implements Serializable {
    private static final long serialVersionUID = 4L;
    @Email @NotNull private String email;
    @NotNull private String password;
}