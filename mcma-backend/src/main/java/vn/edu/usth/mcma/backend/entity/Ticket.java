package vn.edu.usth.mcma.backend.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@SuperBuilder(toBuilder = true)
public class Ticket extends AbstractAuditing implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "TINYINT")
    private Integer typeId;
    @OneToOne
    @JoinColumns({
            @JoinColumn(name = "seat_screenId", referencedColumnName = "screenId"),
            @JoinColumn(name = "seat_row", referencedColumnName = "row"),
            @JoinColumn(name = "seat_col", referencedColumnName = "col")
    })
    private Seat seat;
}
