package sobes_training.person_unique;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
    public Integer id;
    public String firstName;
    public String secondName;
    public String patronymicName;
}
