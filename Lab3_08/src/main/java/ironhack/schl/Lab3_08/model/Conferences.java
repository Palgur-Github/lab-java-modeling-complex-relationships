package ironhack.schl.Lab3_08.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Conferences extends Event{
    @ManyToMany(mappedBy = "conferences")
    private Set<Speaker> speakerList = new HashSet<>();

}
