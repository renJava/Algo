package sobes_training.equals_hashcode;

import lombok.Getter;

@Getter
public class Branch {
    private String name;
    private String address;

    public Branch(String name, String address) {
        this.name = name;
        this.address = address;
    }
}